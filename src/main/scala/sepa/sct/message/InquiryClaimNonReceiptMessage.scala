package sepa.sct.message

import java.time.{LocalDateTime, ZoneId}
import java.util.{GregorianCalendar, UUID}

import com.openbankproject.commons.model.Iban
import io.circe.{Json, JsonObject}
import javax.xml.datatype.DatatypeFactory
import model.enums._
import model.jsonClasses.{Party, PaymentTypeInformation, SettlementInformation}
import model.types.Bic
import model.{SepaCreditTransferTransaction, SepaMessage}
import scalaxb.DataRecord
import sepa.SepaUtil
import sepa.sct.generated.inquiryClaimNonReceipt._

import scala.util.Try
import scala.xml.{Elem, NodeSeq}

case class InquiryClaimNonReceiptMessage(
                                          message: SepaMessage,
                                          creditTransferTransactions: Seq[(SepaCreditTransferTransaction, String)]
                                        ) extends SctMessage[Document] {
  def toXML: NodeSeq = {
    val document = Document(
      ClaimNonReceiptV06(
        Assgnmt = CaseAssignment4(
          Id = message.messageIdInSepaFile,
          Assgnr = message.instigatingAgent.map(_.bic).getOrElse("") match {
            case assigner if SepaUtil.isBic(assigner) => Party35Choice(DataRecord(<Agt></Agt>, BranchAndFinancialInstitutionIdentification5(FinancialInstitutionIdentification8(Some(assigner)))))
            case assigner => Party35Choice(DataRecord(<Pty></Pty>, PartyIdentification125(Nm = Some(assigner))))
          },
          Assgne = message.instigatedAgent.map(_.bic).getOrElse("") match {
            case assigner if SepaUtil.isBic(assigner) => Party35Choice(DataRecord(<Agt></Agt>, BranchAndFinancialInstitutionIdentification5(FinancialInstitutionIdentification8(Some(assigner)))))
            case assigner => Party35Choice(DataRecord(<Pty></Pty>, PartyIdentification125(Nm = Some(assigner))))
          },
          CreDtTm = DatatypeFactory.newInstance().newXMLGregorianCalendar(GregorianCalendar.from(message.creationDateTime.atZone(ZoneId.of("Europe/Paris"))))
        ),
        Case = Some(Case4(
          Id = creditTransferTransactions.head._2,
          Cretr = Party35Choice(DataRecord(<Agt></Agt>, BranchAndFinancialInstitutionIdentification5(FinancialInstitutionIdentification8(
            creditTransferTransactions.head._1.customFields.flatMap(json =>
              (json \\ SepaCreditTransferTransactionCustomField.INQUIRY_CLAIM_NON_RECEIPT_CASE_CREATOR.toString).headOption.flatMap(_.asString))
              .orElse(message.customFields.flatMap(json =>
                (json \\ SepaMessageCustomField.INQUIRY_CLAIM_NON_RECEIPT_CASE_CREATOR.toString).headOption.flatMap(_.asString)))
          ))))
        )),
        Undrlyg = UnderlyingTransaction4Choice(
          underlyingtransaction4choicableoption = DataRecord(<IntrBk></IntrBk>,
            UnderlyingPaymentTransaction3(
              OrgnlGrpInf = Some(UnderlyingGroupInformation1(
                OrgnlMsgId = creditTransferTransactions.head._1.customFields.flatMap(json =>
                  (json \\ SepaCreditTransferTransactionCustomField.INQUIRY_CLAIM_NON_RECEIPT_ORIGINAL_MESSAGE_ID_IN_SEPA_FILE.toString).headOption.flatMap(_.asString))
                  .orElse(message.customFields.flatMap(json =>
                    (json \\ SepaMessageCustomField.INQUIRY_CLAIM_NON_RECEIPT_ORIGINAL_MESSAGE_ID_IN_SEPA_FILE.toString).headOption.flatMap(_.asString)))
                  .getOrElse(""),
                OrgnlMsgNmId = creditTransferTransactions.head._1.customFields.flatMap(json =>
                  (json \\ SepaCreditTransferTransactionCustomField.INQUIRY_CLAIM_NON_RECEIPT_ORIGINAL_MESSAGE_TYPE.toString).headOption.flatMap(_.asString))
                  .orElse(message.customFields.flatMap(json =>
                    (json \\ SepaMessageCustomField.INQUIRY_CLAIM_NON_RECEIPT_ORIGINAL_MESSAGE_TYPE.toString).headOption.flatMap(_.asString)))
                  .getOrElse("")
              )),
              OrgnlInstrId = creditTransferTransactions.head._1.instructionId,
              OrgnlEndToEndId = Some(creditTransferTransactions.head._1.endToEndId),
              OrgnlTxId = Some(creditTransferTransactions.head._1.transactionIdInSepaFile),
              OrgnlIntrBkSttlmAmt = ActiveOrHistoricCurrencyAndAmount(value = creditTransferTransactions.head._1.amount, Map(("@Ccy", DataRecord("EUR")))),
              OrgnlIntrBkSttlmDt = {
                creditTransferTransactions.head._1.settlementDate.map(date => {
                  val settlementDate = DatatypeFactory.newInstance().newXMLGregorianCalendar
                  settlementDate.setYear(date.getYear)
                  settlementDate.setMonth(date.getMonthValue)
                  settlementDate.setDay(date.getDayOfMonth)
                  settlementDate
                }).get
              },
              OrgnlTxRef = Some(OriginalTransactionReference27(
                SttlmInf = creditTransferTransactions.head._1.settlementInformation.map(_.toSettlementInstruction4),
                PmtTpInf = creditTransferTransactions.head._1.paymentTypeInformation.map(_.toPaymentTypeInformation25),
                RmtInf = creditTransferTransactions.head._1.description.map(description => RemittanceInformation15(Ustrd = Seq(description))),
                Dbtr = creditTransferTransactions.head._1.debtor.map(_.toParty35Choice),
                DbtrAcct = creditTransferTransactions.head._1.debtorAccount.map(account => CashAccount24(Id = AccountIdentification4Choice(DataRecord(<IBAN></IBAN>, account.iban)))),
                DbtrAgt = creditTransferTransactions.head._1.debtorAgent.map(debtorAgent => BranchAndFinancialInstitutionIdentification5(FinInstnId = FinancialInstitutionIdentification8(BICFI = Some(debtorAgent.bic)))),
                UltmtDbtr = creditTransferTransactions.head._1.ultimateDebtor.map(_.toParty35Choice),
                Cdtr = creditTransferTransactions.head._1.creditor.map(_.toParty35Choice),
                CdtrAcct = creditTransferTransactions.head._1.creditorAccount.map(account => CashAccount24(Id = AccountIdentification4Choice(DataRecord(<IBAN></IBAN>, account.iban)))),
                CdtrAgt = creditTransferTransactions.head._1.creditorAgent.map(creditorAgent => BranchAndFinancialInstitutionIdentification5(FinInstnId = FinancialInstitutionIdentification8(BICFI = Some(creditorAgent.bic)))),
                UltmtCdtr = creditTransferTransactions.head._1.ultimateCreditor.map(_.toParty35Choice),
                Purp = creditTransferTransactions.head._1.purposeCode.map(purposeCode => Purpose2Choice(DataRecord(<Cd></Cd>, purposeCode))),
              ))
            )
          )
        ),
        InstrForAssgne = creditTransferTransactions.head._1.customFields.flatMap(json =>
          (json \\ SepaCreditTransferTransactionCustomField.INQUIRY_CLAIM_NON_RECEIPT_ADDITIONAL_INFORMATION.toString).headOption.flatMap(_.asString))
          .map(additionalInformation => InstructionForAssignee1(Cd = Some("INQR"), InstrInf = Some(additionalInformation)))
          .orElse(message.customFields.flatMap(json =>
            (json \\ SepaMessageCustomField.INQUIRY_CLAIM_NON_RECEIPT_ADDITIONAL_INFORMATION.toString).headOption.flatMap(_.asString))
            .map(additionalInformation => InstructionForAssignee1(Cd = Some("INQR"), InstrInf = Some(additionalInformation))))
      )
    )
    scalaxb.toXML[Document](document, "Document", defaultScope)
  }
}


object InquiryClaimNonReceiptMessage {
  def fromXML(xmlFile: Elem, sepaFileId: UUID): Try[InquiryClaimNonReceiptMessage] = {
    Try(scalaxb.fromXML[Document](xmlFile)).map(document =>
      InquiryClaimNonReceiptMessage(
        SepaMessage(
          id = UUID.randomUUID(),
          creationDateTime = document.ClmNonRct.Assgnmt.CreDtTm.toGregorianCalendar.toZonedDateTime.toLocalDateTime,
          messageType = SepaMessageType.B2B_INQUIRY_CLAIM_NON_RECEIP,
          status = SepaMessageStatus.PROCESSING_IN_PROGRESS,
          sepaFileId = Some(sepaFileId),
          messageIdInSepaFile = document.ClmNonRct.Assgnmt.Id,
          numberOfTransactions = 1,
          totalAmount = document.ClmNonRct.Undrlyg.underlyingtransaction4choicableoption.value.OrgnlIntrBkSttlmAmt.value,
          settlementDate = None,
          instigatingAgent = document.ClmNonRct.Assgnmt.Assgnr.party35choicableoption.value match {
            case assigner: BranchAndFinancialInstitutionIdentification5 => assigner.FinInstnId.BICFI.map(Bic)
            case assigner: PartyIdentification125 => assigner.Nm.map(Bic)
          },
          instigatedAgent = document.ClmNonRct.Assgnmt.Assgne.party35choicableoption.value match {
            case assignee: BranchAndFinancialInstitutionIdentification5 => assignee.FinInstnId.BICFI.map(Bic)
            case assignee: PartyIdentification125 => assignee.Nm.map(Bic)
          },
          customFields = Some(Json.fromJsonObject(JsonObject.empty
            .add(SepaMessageCustomField.INQUIRY_CLAIM_NON_RECEIPT_CASE_ID.toString,
              Json.fromString(document.ClmNonRct.Case.map(_.Id).getOrElse("")))
            .add(SepaMessageCustomField.INQUIRY_CLAIM_NON_RECEIPT_CASE_CREATOR.toString,
              Json.fromString(document.ClmNonRct.Case.map(_.Cretr.party35choicableoption.value).flatMap {
                case creator: BranchAndFinancialInstitutionIdentification5able => creator.FinInstnId.BICFI
              }.getOrElse("")))
            .add(SepaMessageCustomField.INQUIRY_CLAIM_NON_RECEIPT_ADDITIONAL_INFORMATION.toString,
              Json.fromString(document.ClmNonRct.InstrForAssgne.flatMap(_.InstrInf).getOrElse("")))
            .add(SepaMessageCustomField.INQUIRY_CLAIM_NON_RECEIPT_ORIGINAL_MESSAGE_ID_IN_SEPA_FILE.toString,
              Json.fromString(document.ClmNonRct.Undrlyg.underlyingtransaction4choicableoption.value.OrgnlGrpInf.map(_.OrgnlMsgId).getOrElse("")))
            .add(SepaMessageCustomField.INQUIRY_CLAIM_NON_RECEIPT_ORIGINAL_MESSAGE_TYPE.toString,
              Json.fromString(document.ClmNonRct.Undrlyg.underlyingtransaction4choicableoption.value.OrgnlGrpInf.map(_.OrgnlMsgNmId).getOrElse("")))
          ))
        ),
        creditTransferTransactions = Seq(
          (SepaCreditTransferTransaction(
            id = UUID.randomUUID(),
            amount = document.ClmNonRct.Undrlyg.underlyingtransaction4choicableoption.value.OrgnlIntrBkSttlmAmt.value,
            debtor = document.ClmNonRct.Undrlyg.underlyingtransaction4choicableoption.value.OrgnlTxRef.flatMap(_.Dbtr.map(party =>
              Party.fromParty35Choice(party.party35choicableoption.value))),
            debtorAccount = document.ClmNonRct.Undrlyg.underlyingtransaction4choicableoption.value.OrgnlTxRef
              .flatMap(_.DbtrAcct.map(account => Iban(account.Id.accountidentification4choicableoption.value.toString))),
            debtorAgent = document.ClmNonRct.Undrlyg.underlyingtransaction4choicableoption.value.OrgnlTxRef
              .flatMap(_.DbtrAgt.flatMap(_.FinInstnId.BICFI.map(Bic))),
            ultimateDebtor = document.ClmNonRct.Undrlyg.underlyingtransaction4choicableoption.value.OrgnlTxRef.flatMap(_.UltmtDbtr.map(party =>
              Party.fromParty35Choice(party.party35choicableoption.value))),
            creditor = document.ClmNonRct.Undrlyg.underlyingtransaction4choicableoption.value.OrgnlTxRef.flatMap(_.Cdtr.map(party =>
              Party.fromParty35Choice(party.party35choicableoption.value))),
            creditorAccount = document.ClmNonRct.Undrlyg.underlyingtransaction4choicableoption.value.OrgnlTxRef
              .flatMap(_.CdtrAcct.map(account => Iban(account.Id.accountidentification4choicableoption.value.toString))),
            creditorAgent = document.ClmNonRct.Undrlyg.underlyingtransaction4choicableoption.value.OrgnlTxRef
              .flatMap(_.CdtrAgt.flatMap(_.FinInstnId.BICFI.map(Bic))),
            ultimateCreditor = document.ClmNonRct.Undrlyg.underlyingtransaction4choicableoption.value.OrgnlTxRef.flatMap(_.UltmtCdtr.map(party =>
              Party.fromParty35Choice(party.party35choicableoption.value))),
            purposeCode = document.ClmNonRct.Undrlyg.underlyingtransaction4choicableoption.value.OrgnlTxRef
              .flatMap(_.Purp.map(_.purpose2choiceoption.value)),
            description = document.ClmNonRct.Undrlyg.underlyingtransaction4choicableoption.value.OrgnlTxRef
              .flatMap(_.RmtInf.map(_.Ustrd.mkString)),
            creationDateTime = LocalDateTime.now(),
            settlementDate = Some(document.ClmNonRct.Undrlyg.underlyingtransaction4choicableoption.value.OrgnlIntrBkSttlmDt.toGregorianCalendar.toZonedDateTime.toLocalDate),
            transactionIdInSepaFile = document.ClmNonRct.Undrlyg.underlyingtransaction4choicableoption.value.OrgnlTxId.getOrElse(""),
            instructionId = document.ClmNonRct.Undrlyg.underlyingtransaction4choicableoption.value.OrgnlInstrId,
            endToEndId = document.ClmNonRct.Undrlyg.underlyingtransaction4choicableoption.value.OrgnlEndToEndId.getOrElse(""),
            settlementInformation = document.ClmNonRct.Undrlyg.underlyingtransaction4choicableoption.value.OrgnlTxRef
              .flatMap(_.SttlmInf).map(SettlementInformation.fromSettlementInstruction4),
            paymentTypeInformation = document.ClmNonRct.Undrlyg.underlyingtransaction4choicableoption.value.OrgnlTxRef
              .flatMap(_.PmtTpInf).map(PaymentTypeInformation.fromPaymentTypeInformation25),
            status = SepaCreditTransferTransactionStatus.CLAIMED_NON_RECEIPT,
            customFields = Some(Json.fromJsonObject(JsonObject.empty
              .add(SepaCreditTransferTransactionCustomField.INQUIRY_CLAIM_NON_RECEIPT_CASE_ID.toString,
                Json.fromString(document.ClmNonRct.Case.map(_.Id).getOrElse("")))
              .add(SepaCreditTransferTransactionCustomField.INQUIRY_CLAIM_NON_RECEIPT_CASE_CREATOR.toString,
                Json.fromString(document.ClmNonRct.Case.map(_.Cretr.party35choicableoption.value).flatMap {
                  case creator: BranchAndFinancialInstitutionIdentification5able => creator.FinInstnId.BICFI
                }.getOrElse("")))
              .add(SepaCreditTransferTransactionCustomField.INQUIRY_CLAIM_NON_RECEIPT_ADDITIONAL_INFORMATION.toString,
                Json.fromString(document.ClmNonRct.InstrForAssgne.flatMap(_.InstrInf).getOrElse("")))
              .add(SepaCreditTransferTransactionCustomField.INQUIRY_CLAIM_NON_RECEIPT_ORIGINAL_MESSAGE_ID_IN_SEPA_FILE.toString,
                Json.fromString(document.ClmNonRct.Undrlyg.underlyingtransaction4choicableoption.value.OrgnlGrpInf.map(_.OrgnlMsgId).getOrElse("")))
              .add(SepaCreditTransferTransactionCustomField.INQUIRY_CLAIM_NON_RECEIPT_ORIGINAL_MESSAGE_TYPE.toString,
                Json.fromString(document.ClmNonRct.Undrlyg.underlyingtransaction4choicableoption.value.OrgnlGrpInf.map(_.OrgnlMsgNmId).getOrElse("")))
            ))
          ), document.ClmNonRct.Case.map(_.Id).getOrElse("")))
      )
    )
  }
}
