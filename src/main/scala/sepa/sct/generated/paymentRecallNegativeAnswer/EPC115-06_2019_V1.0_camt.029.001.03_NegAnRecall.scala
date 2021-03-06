// Generated by <a href="http://scalaxb.org/">scalaxb</a>.
package sepa.sct.generated.paymentRecallNegativeAnswer

/** Account Identification 4ChoiceSpecifies the unique identification of an account as assigned by the account servicer.
*/
trait AccountIdentification4Choicable {
  def accountidentification4choicableoption: scalaxb.DataRecord[Any]
}


/** Account Identification 4ChoiceSpecifies the unique identification of an account as assigned by the account servicer.
*/
case class AccountIdentification4Choice(accountidentification4choicableoption: scalaxb.DataRecord[Any]) extends AccountIdentification4Choicable
      

trait AccountIdentification4ChoicableOption

case class AccountIdentification4Choice_EPC115u4506_SCT_IB_2019_V1u460(accountidentification4choicableoption: scalaxb.DataRecord[Any]) extends AccountIdentification4Choicable
      

trait AccountIdentification4Choice_EPC115u4506_SCT_IB_2019_V1u460Option

/** Account Scheme Name 1ChoiceSets of elements to identify a name of the identification scheme
*/
case class AccountSchemeName1Choice(accountschemename1choiceoption: scalaxb.DataRecord[Any])
      

trait AccountSchemeName1ChoiceOption

/** Active Or Historic Currency And AmountA number of monetary units specified in an active or a historic currency where the unit of currency is explicit and compliant with ISO 4217.
*/
trait ActiveOrHistoricCurrencyAndAmountable {
  def value: BigDecimal
  def Ccy: String
}


/** Active Or Historic Currency And AmountA number of monetary units specified in an active or a historic currency where the unit of currency is explicit and compliant with ISO 4217.
*/
case class ActiveOrHistoricCurrencyAndAmount(value: BigDecimal,
  attributes: Map[String, scalaxb.DataRecord[Any]] = Map.empty) extends ActiveOrHistoricCurrencyAndAmountable {
  lazy val Ccy = attributes("@Ccy").as[String]
}

      


case class ActiveOrHistoricCurrencyAndAmount_EPC115u4506_SCT_IB_2019_V1u460(value: BigDecimal,
  attributes: Map[String, scalaxb.DataRecord[Any]] = Map.empty) extends ActiveOrHistoricCurrencyAndAmountable {
  lazy val Ccy = attributes("@Ccy").as[String]
}

      


/** Branch And Financial Institution Identification 4Set of elements used to uniquely and unambiguously identify a financial institution or a branch of a financial institution.
*/
trait BranchAndFinancialInstitutionIdentification4able extends Party7ChoicableOption {
  def FinInstnId: sepa.sct.generated.paymentRecallNegativeAnswer.FinancialInstitutionIdentification7able
}


/** Branch And Financial Institution Identification 4Set of elements used to uniquely and unambiguously identify a financial institution or a branch of a financial institution.
*/
case class BranchAndFinancialInstitutionIdentification4(FinInstnId: sepa.sct.generated.paymentRecallNegativeAnswer.FinancialInstitutionIdentification7able) extends BranchAndFinancialInstitutionIdentification4able
      


case class BranchAndFinancialInstitutionIdentification4_EPC115u4506_SCT_IB_2019_V1u460(FinInstnId: sepa.sct.generated.paymentRecallNegativeAnswer.FinancialInstitutionIdentification7able) extends BranchAndFinancialInstitutionIdentification4able with Party7Choice_EPC115u4506_SCT_IB_2019_V1u460Option
      

sealed trait CancellationIndividualStatus1Code

object CancellationIndividualStatus1Code {
  def fromString(value: String, scope: scala.xml.NamespaceBinding)(implicit fmt: scalaxb.XMLFormat[sepa.sct.generated.paymentRecallNegativeAnswer.CancellationIndividualStatus1Code]): CancellationIndividualStatus1Code = fmt.reads(scala.xml.Text(value), Nil) match {
    case Right(x: CancellationIndividualStatus1Code) => x
    case x => throw new RuntimeException(s"fromString returned unexpected value $x for input $value")
  }
  lazy val values: Seq[CancellationIndividualStatus1Code] = Seq(RJCRValue)
}

case object RJCRValue extends CancellationIndividualStatus1Code { override def toString = "RJCR" }

/** Cancellation Status Reason 1ChoiceSpeficies the reason for the transaction cancellation status.
*/
trait CancellationStatusReason1Choicable {
  def cancellationstatusreason1choicableoption: scalaxb.DataRecord[Any]
}


/** Cancellation Status Reason 1ChoiceSpeficies the reason for the transaction cancellation status.
*/
case class CancellationStatusReason1Choice(cancellationstatusreason1choicableoption: scalaxb.DataRecord[Any]) extends CancellationStatusReason1Choicable
      

trait CancellationStatusReason1ChoicableOption

case class CancellationStatusReason1Choice_EPC115u4506_SCT_IB_2019_V1u460(cancellationstatusreason1choicableoption: scalaxb.DataRecord[Any]) extends CancellationStatusReason1Choicable
      

trait CancellationStatusReason1Choice_EPC115u4506_SCT_IB_2019_V1u460Option

/** Cancellation Status Reason Information 1Set of elements used to provide information on the status of the cancellation request.
*/
trait CancellationStatusReasonInformation1able {
  def Orgtr: Option[sepa.sct.generated.paymentRecallNegativeAnswer.PartyIdentification32able]
  def Rsn: Option[sepa.sct.generated.paymentRecallNegativeAnswer.CancellationStatusReason1Choicable]
  def AddtlInf: Seq[String]
}


/** Cancellation Status Reason Information 1Set of elements used to provide information on the status of the cancellation request.
*/
case class CancellationStatusReasonInformation1(Orgtr: Option[sepa.sct.generated.paymentRecallNegativeAnswer.PartyIdentification32able] = None,
  Rsn: Option[sepa.sct.generated.paymentRecallNegativeAnswer.CancellationStatusReason1Choicable] = None,
  AddtlInf: Seq[String] = Nil) extends CancellationStatusReasonInformation1able
      


case class CancellationStatusReasonInformation1_EPC115u4506_SCT_IB_2019_V1u460(Orgtr: Option[sepa.sct.generated.paymentRecallNegativeAnswer.PartyIdentification32able] = None,
  Rsn: Option[sepa.sct.generated.paymentRecallNegativeAnswer.CancellationStatusReason1Choicable] = None,
  AddtlInf: Seq[String] = Nil) extends CancellationStatusReasonInformation1able
      


/** Case Assignment 2Set of elements used to represent the assignment of a case to a party.
*/
trait CaseAssignment2able {
  def Id: String
  def Assgnr: sepa.sct.generated.paymentRecallNegativeAnswer.Party7Choicable
  def Assgne: sepa.sct.generated.paymentRecallNegativeAnswer.Party7Choicable
  def CreDtTm: javax.xml.datatype.XMLGregorianCalendar
}


/** Case Assignment 2Set of elements used to represent the assignment of a case to a party.
*/
case class CaseAssignment2(Id: String,
  Assgnr: sepa.sct.generated.paymentRecallNegativeAnswer.Party7Choicable,
  Assgne: sepa.sct.generated.paymentRecallNegativeAnswer.Party7Choicable,
  CreDtTm: javax.xml.datatype.XMLGregorianCalendar) extends CaseAssignment2able
      


case class CaseAssignment2_EPC115u4506_SCT_IB_2019_V1u460(Id: String,
  Assgnr: sepa.sct.generated.paymentRecallNegativeAnswer.Party7Choicable,
  Assgne: sepa.sct.generated.paymentRecallNegativeAnswer.Party7Choicable,
  CreDtTm: javax.xml.datatype.XMLGregorianCalendar) extends CaseAssignment2able
      


/** Cash Account 16Set of elements used to identify an account.
*/
trait CashAccount16able {
  def Id: sepa.sct.generated.paymentRecallNegativeAnswer.AccountIdentification4Choicable
}


/** Cash Account 16Set of elements used to identify an account.
*/
case class CashAccount16(Id: sepa.sct.generated.paymentRecallNegativeAnswer.AccountIdentification4Choicable) extends CashAccount16able
      


case class CashAccount16_EPC115u4506_SCT_IB_2019_V1u460(Id: sepa.sct.generated.paymentRecallNegativeAnswer.AccountIdentification4Choicable) extends CashAccount16able
      


/** Category Purpose 1Choice
Specifies the high level purpose of the instruction based on a set of pre-defined categories.
Usage: This is used by the initiating party to provide information concerning the processing of the payment. It is likely to trigger special processing by any of the agents involved in the payment chain.
      
*/
case class CategoryPurpose1Choice(categorypurpose1choiceoption: scalaxb.DataRecord[Any])
      

trait CategoryPurpose1ChoiceOption

/** Clearing System Identification 3ChoiceSpecifies the clearing system identification.
*/
case class ClearingSystemIdentification3Choice(clearingsystemidentification3choiceoption: scalaxb.DataRecord[Any])
      

trait ClearingSystemIdentification3ChoiceOption

/** Creditor Reference Information 2Reference information provided by the creditor to allow the identification of the underlying documents.
*/
trait CreditorReferenceInformation2able {
  def Tp: Option[sepa.sct.generated.paymentRecallNegativeAnswer.CreditorReferenceType2]
  def Ref: Option[String]
}


/** Creditor Reference Information 2Reference information provided by the creditor to allow the identification of the underlying documents.
*/
case class CreditorReferenceInformation2(Tp: Option[sepa.sct.generated.paymentRecallNegativeAnswer.CreditorReferenceType2] = None,
  Ref: Option[String] = None) extends CreditorReferenceInformation2able
      


case class CreditorReferenceInformation2_EPC115u4506_SCT_IB_2019_V1u460(Tp: Option[sepa.sct.generated.paymentRecallNegativeAnswer.CreditorReferenceType2] = None,
  Ref: Option[String] = None) extends CreditorReferenceInformation2able
      


/** Creditor Reference Type 1ChoiceSpecifies the type of document referred by the creditor.
*/
case class CreditorReferenceType1Choice(creditorreferencetype1choiceoption: scalaxb.DataRecord[sepa.sct.generated.paymentRecallNegativeAnswer.DocumentType3Code])
      

trait CreditorReferenceType1ChoiceOption

/** Creditor Reference Type 2Specifies the type of creditor reference.
*/
case class CreditorReferenceType2(CdOrPrtry: sepa.sct.generated.paymentRecallNegativeAnswer.CreditorReferenceType1Choice,
  Issr: Option[String] = None)
      


/** Date And Place Of BirthDate and place of birth of a person.
*/
case class DateAndPlaceOfBirth(BirthDt: javax.xml.datatype.XMLGregorianCalendar,
  PrvcOfBirth: Option[String] = None,
  CityOfBirth: String,
  CtryOfBirth: String)
      


trait Documentable {
  def RsltnOfInvstgtn: sepa.sct.generated.paymentRecallNegativeAnswer.ResolutionOfInvestigationV03able
}


case class Document(RsltnOfInvstgtn: sepa.sct.generated.paymentRecallNegativeAnswer.ResolutionOfInvestigationV03able) extends Documentable
      

sealed trait DocumentType3Code

object DocumentType3Code {
  def fromString(value: String, scope: scala.xml.NamespaceBinding)(implicit fmt: scalaxb.XMLFormat[sepa.sct.generated.paymentRecallNegativeAnswer.DocumentType3Code]): DocumentType3Code = fmt.reads(scala.xml.Text(value), Nil) match {
    case Right(x: DocumentType3Code) => x
    case x => throw new RuntimeException(s"fromString returned unexpected value $x for input $value")
  }
  lazy val values: Seq[DocumentType3Code] = Seq(SCOR)
}

case object SCOR extends DocumentType3Code { override def toString = "SCOR" }

case class Document_EPC115u4506_SCT_IB_2019_V1u460(RsltnOfInvstgtn: sepa.sct.generated.paymentRecallNegativeAnswer.ResolutionOfInvestigationV03able) extends Documentable
      

sealed trait ExternalServiceLevel1Code_EPC115u4506_SCT_IB_2019_V1u460

object ExternalServiceLevel1Code_EPC115u4506_SCT_IB_2019_V1u460 {
  def fromString(value: String, scope: scala.xml.NamespaceBinding)(implicit fmt: scalaxb.XMLFormat[sepa.sct.generated.paymentRecallNegativeAnswer.ExternalServiceLevel1Code_EPC115u4506_SCT_IB_2019_V1u460]): ExternalServiceLevel1Code_EPC115u4506_SCT_IB_2019_V1u460 = fmt.reads(scala.xml.Text(value), Nil) match {
    case Right(x: ExternalServiceLevel1Code_EPC115u4506_SCT_IB_2019_V1u460) => x
    case x => throw new RuntimeException(s"fromString returned unexpected value $x for input $value")
  }
  lazy val values: Seq[ExternalServiceLevel1Code_EPC115u4506_SCT_IB_2019_V1u460] = Seq(SEPA)
}

case object SEPA extends ExternalServiceLevel1Code_EPC115u4506_SCT_IB_2019_V1u460 { override def toString = "SEPA" }

/** Financial Institution Identification 7Set of elements used to identify a financial institution.
*/
trait FinancialInstitutionIdentification7able {
  def BIC: Option[String]
}


/** Financial Institution Identification 7Set of elements used to identify a financial institution.
*/
case class FinancialInstitutionIdentification7(BIC: Option[String] = None) extends FinancialInstitutionIdentification7able
      


case class FinancialInstitutionIdentification7_EPC115u4506_SCT_IB_2019_V1u460(BIC: Option[String] = None) extends FinancialInstitutionIdentification7able
      


/** Generic Account Identification 1Information related to a generic account identification.
*/
case class GenericAccountIdentification1(Id: String,
  SchmeNm: Option[sepa.sct.generated.paymentRecallNegativeAnswer.AccountSchemeName1Choice] = None,
  Issr: Option[String] = None) extends AccountIdentification4ChoicableOption
      


/** Generic Organisation Identification 1Information related to an identification, eg, party identification or account identification.
*/
case class GenericOrganisationIdentification1(Id: String,
  SchmeNm: Option[sepa.sct.generated.paymentRecallNegativeAnswer.OrganisationIdentificationSchemeName1Choice] = None,
  Issr: Option[String] = None)
      


/** Generic Person Identification 1Information related to an identification, eg, party identification or account identification.
*/
case class GenericPersonIdentification1(Id: String,
  SchmeNm: Option[sepa.sct.generated.paymentRecallNegativeAnswer.PersonIdentificationSchemeName1Choice] = None,
  Issr: Option[String] = None)
      

sealed trait InvestigationExecutionConfirmation3Code

object InvestigationExecutionConfirmation3Code {
  def fromString(value: String, scope: scala.xml.NamespaceBinding)(implicit fmt: scalaxb.XMLFormat[sepa.sct.generated.paymentRecallNegativeAnswer.InvestigationExecutionConfirmation3Code]): InvestigationExecutionConfirmation3Code = fmt.reads(scala.xml.Text(value), Nil) match {
    case Right(x: InvestigationExecutionConfirmation3Code) => x
    case x => throw new RuntimeException(s"fromString returned unexpected value $x for input $value")
  }
  lazy val values: Seq[InvestigationExecutionConfirmation3Code] = Seq(RJCR)
}

case object RJCR extends InvestigationExecutionConfirmation3Code { override def toString = "RJCR" }

/** Investigation Status 2ChoiceSpecifies the status of an investigation case.
*/
trait InvestigationStatus2Choicable {
  def investigationstatus2choicableoption: scalaxb.DataRecord[sepa.sct.generated.paymentRecallNegativeAnswer.InvestigationExecutionConfirmation3Code]
}


/** Investigation Status 2ChoiceSpecifies the status of an investigation case.
*/
case class InvestigationStatus2Choice(investigationstatus2choicableoption: scalaxb.DataRecord[sepa.sct.generated.paymentRecallNegativeAnswer.InvestigationExecutionConfirmation3Code]) extends InvestigationStatus2Choicable
      

trait InvestigationStatus2ChoicableOption

case class InvestigationStatus2Choice_EPC115u4506_SCT_IB_2019_V1u460(investigationstatus2choicableoption: scalaxb.DataRecord[sepa.sct.generated.paymentRecallNegativeAnswer.InvestigationExecutionConfirmation3Code]) extends InvestigationStatus2Choicable
      

trait InvestigationStatus2Choice_EPC115u4506_SCT_IB_2019_V1u460Option

/** Local Instrument 2ChoiceSet of elements that further identifies the type of local instruments being requested by the initiating party.
*/
case class LocalInstrument2Choice(localinstrument2choiceoption: scalaxb.DataRecord[Any])
      

trait LocalInstrument2ChoiceOption

/** Organisation Identification 4Unique and unambiguous way to identify an organisation.
*/
trait OrganisationIdentification4able extends Party6ChoicableOption {
  def BICOrBEI: Option[String]
  def Othr: Seq[sepa.sct.generated.paymentRecallNegativeAnswer.GenericOrganisationIdentification1]
}


/** Organisation Identification 4Unique and unambiguous way to identify an organisation.
*/
case class OrganisationIdentification4(BICOrBEI: Option[String] = None,
  Othr: Seq[sepa.sct.generated.paymentRecallNegativeAnswer.GenericOrganisationIdentification1] = Nil) extends OrganisationIdentification4able
      


case class OrganisationIdentification4_EPC115u4506_SCT_IB_2019_V1u460(BICOrBEI: Option[String] = None,
  Othr: Seq[sepa.sct.generated.paymentRecallNegativeAnswer.GenericOrganisationIdentification1] = Nil) extends OrganisationIdentification4able with Party6Choice_EPC115u4506_SCT_IB_2019_V1u460Option
      


case class OrganisationIdentification4_EPC115u4506_SCT_IB_2019_V1u460_2(BICOrBEI: Option[String] = None,
  Othr: Seq[sepa.sct.generated.paymentRecallNegativeAnswer.GenericOrganisationIdentification1] = Nil) extends OrganisationIdentification4able with Party6Choice_EPC115u4506_SCT_IB_2019_V1u460_2Option
      


/** Organisation Identification Scheme Name 1ChoiceSets of elements to identify a name of the organisation identification scheme.
*/
case class OrganisationIdentificationSchemeName1Choice(organisationidentificationschemename1choiceoption: scalaxb.DataRecord[Any])
      

trait OrganisationIdentificationSchemeName1ChoiceOption

/** Original Group Information 3Unique and unambiguous identifier of the group of transactions as assigned by the original instructing party.
*/
trait OriginalGroupInformation3able {
  def OrgnlMsgId: String
  def OrgnlMsgNmId: String
}


/** Original Group Information 3Unique and unambiguous identifier of the group of transactions as assigned by the original instructing party.
*/
case class OriginalGroupInformation3(OrgnlMsgId: String,
  OrgnlMsgNmId: String) extends OriginalGroupInformation3able
      


case class OriginalGroupInformation3_EPC115u4506_SCT_IB_2019_V1u460(OrgnlMsgId: String,
  OrgnlMsgNmId: String) extends OriginalGroupInformation3able
      


/** Original Transaction Reference 13Set of key elements used to refer the original transaction.
*/
trait OriginalTransactionReference13able {
  def IntrBkSttlmAmt: Option[sepa.sct.generated.paymentRecallNegativeAnswer.ActiveOrHistoricCurrencyAndAmountable]
  def IntrBkSttlmDt: Option[javax.xml.datatype.XMLGregorianCalendar]
  def SttlmInf: Option[sepa.sct.generated.paymentRecallNegativeAnswer.SettlementInformation13]
  def PmtTpInf: Option[sepa.sct.generated.paymentRecallNegativeAnswer.PaymentTypeInformation22able]
  def RmtInf: Option[sepa.sct.generated.paymentRecallNegativeAnswer.RemittanceInformation5able]
  def UltmtDbtr: Option[sepa.sct.generated.paymentRecallNegativeAnswer.PartyIdentification32able]
  def Dbtr: Option[sepa.sct.generated.paymentRecallNegativeAnswer.PartyIdentification32able]
  def DbtrAcct: Option[sepa.sct.generated.paymentRecallNegativeAnswer.CashAccount16able]
  def DbtrAgt: Option[sepa.sct.generated.paymentRecallNegativeAnswer.BranchAndFinancialInstitutionIdentification4able]
  def CdtrAgt: Option[sepa.sct.generated.paymentRecallNegativeAnswer.BranchAndFinancialInstitutionIdentification4able]
  def Cdtr: Option[sepa.sct.generated.paymentRecallNegativeAnswer.PartyIdentification32able]
  def CdtrAcct: Option[sepa.sct.generated.paymentRecallNegativeAnswer.CashAccount16able]
  def UltmtCdtr: Option[sepa.sct.generated.paymentRecallNegativeAnswer.PartyIdentification32able]
}


/** Original Transaction Reference 13Set of key elements used to refer the original transaction.
*/
case class OriginalTransactionReference13(IntrBkSttlmAmt: Option[sepa.sct.generated.paymentRecallNegativeAnswer.ActiveOrHistoricCurrencyAndAmountable] = None,
  IntrBkSttlmDt: Option[javax.xml.datatype.XMLGregorianCalendar] = None,
  SttlmInf: Option[sepa.sct.generated.paymentRecallNegativeAnswer.SettlementInformation13] = None,
  PmtTpInf: Option[sepa.sct.generated.paymentRecallNegativeAnswer.PaymentTypeInformation22able] = None,
  RmtInf: Option[sepa.sct.generated.paymentRecallNegativeAnswer.RemittanceInformation5able] = None,
  UltmtDbtr: Option[sepa.sct.generated.paymentRecallNegativeAnswer.PartyIdentification32able] = None,
  Dbtr: Option[sepa.sct.generated.paymentRecallNegativeAnswer.PartyIdentification32able] = None,
  DbtrAcct: Option[sepa.sct.generated.paymentRecallNegativeAnswer.CashAccount16able] = None,
  DbtrAgt: Option[sepa.sct.generated.paymentRecallNegativeAnswer.BranchAndFinancialInstitutionIdentification4able] = None,
  CdtrAgt: Option[sepa.sct.generated.paymentRecallNegativeAnswer.BranchAndFinancialInstitutionIdentification4able] = None,
  Cdtr: Option[sepa.sct.generated.paymentRecallNegativeAnswer.PartyIdentification32able] = None,
  CdtrAcct: Option[sepa.sct.generated.paymentRecallNegativeAnswer.CashAccount16able] = None,
  UltmtCdtr: Option[sepa.sct.generated.paymentRecallNegativeAnswer.PartyIdentification32able] = None) extends OriginalTransactionReference13able
      


case class OriginalTransactionReference13_EPC115u4506_SCT_IB_2019_V1u460(IntrBkSttlmAmt: Option[sepa.sct.generated.paymentRecallNegativeAnswer.ActiveOrHistoricCurrencyAndAmountable] = None,
  IntrBkSttlmDt: Option[javax.xml.datatype.XMLGregorianCalendar] = None,
  SttlmInf: Option[sepa.sct.generated.paymentRecallNegativeAnswer.SettlementInformation13] = None,
  PmtTpInf: Option[sepa.sct.generated.paymentRecallNegativeAnswer.PaymentTypeInformation22able] = None,
  RmtInf: Option[sepa.sct.generated.paymentRecallNegativeAnswer.RemittanceInformation5able] = None,
  UltmtDbtr: Option[sepa.sct.generated.paymentRecallNegativeAnswer.PartyIdentification32able] = None,
  Dbtr: Option[sepa.sct.generated.paymentRecallNegativeAnswer.PartyIdentification32able] = None,
  DbtrAcct: Option[sepa.sct.generated.paymentRecallNegativeAnswer.CashAccount16able] = None,
  DbtrAgt: Option[sepa.sct.generated.paymentRecallNegativeAnswer.BranchAndFinancialInstitutionIdentification4able] = None,
  CdtrAgt: Option[sepa.sct.generated.paymentRecallNegativeAnswer.BranchAndFinancialInstitutionIdentification4able] = None,
  Cdtr: Option[sepa.sct.generated.paymentRecallNegativeAnswer.PartyIdentification32able] = None,
  CdtrAcct: Option[sepa.sct.generated.paymentRecallNegativeAnswer.CashAccount16able] = None,
  UltmtCdtr: Option[sepa.sct.generated.paymentRecallNegativeAnswer.PartyIdentification32able] = None) extends OriginalTransactionReference13able
      


/** Party 6ChoiceNature or use of the account.
*/
trait Party6Choicable {
  def party6choicableoption: scalaxb.DataRecord[sepa.sct.generated.paymentRecallNegativeAnswer.Party6ChoicableOption]
}


/** Party 6ChoiceNature or use of the account.
*/
case class Party6Choice(party6choicableoption: scalaxb.DataRecord[sepa.sct.generated.paymentRecallNegativeAnswer.Party6ChoicableOption]) extends Party6Choicable
      

trait Party6ChoicableOption

case class Party6Choice_EPC115u4506_SCT_IB_2019_V1u460(party6choicableoption: scalaxb.DataRecord[sepa.sct.generated.paymentRecallNegativeAnswer.Party6ChoicableOption]) extends Party6Choicable
      

trait Party6Choice_EPC115u4506_SCT_IB_2019_V1u460Option

case class Party6Choice_EPC115u4506_SCT_IB_2019_V1u460_2(party6choicableoption: scalaxb.DataRecord[sepa.sct.generated.paymentRecallNegativeAnswer.Party6ChoicableOption]) extends Party6Choicable
      

trait Party6Choice_EPC115u4506_SCT_IB_2019_V1u460_2Option

/** Party 7ChoiceIdentification of a person, an organisation or a financial institution.
*/
trait Party7Choicable {
  def party7choicableoption: scalaxb.DataRecord[sepa.sct.generated.paymentRecallNegativeAnswer.Party7ChoicableOption]
}


/** Party 7ChoiceIdentification of a person, an organisation or a financial institution.
*/
case class Party7Choice(party7choicableoption: scalaxb.DataRecord[sepa.sct.generated.paymentRecallNegativeAnswer.Party7ChoicableOption]) extends Party7Choicable
      

trait Party7ChoicableOption

case class Party7Choice_EPC115u4506_SCT_IB_2019_V1u460(party7choicableoption: scalaxb.DataRecord[sepa.sct.generated.paymentRecallNegativeAnswer.Party7ChoicableOption]) extends Party7Choicable
      

trait Party7Choice_EPC115u4506_SCT_IB_2019_V1u460Option

/** Party Identification 32Set of elements used to identify a person or an organisation.
*/
trait PartyIdentification32able extends Party7ChoicableOption {
  def Nm: Option[String]
  def PstlAdr: Option[sepa.sct.generated.paymentRecallNegativeAnswer.PostalAddress6able]
  def Id: Option[sepa.sct.generated.paymentRecallNegativeAnswer.Party6Choicable]
}


/** Party Identification 32Set of elements used to identify a person or an organisation.
*/
case class PartyIdentification32(Nm: Option[String] = None,
  PstlAdr: Option[sepa.sct.generated.paymentRecallNegativeAnswer.PostalAddress6able] = None,
  Id: Option[sepa.sct.generated.paymentRecallNegativeAnswer.Party6Choicable] = None) extends PartyIdentification32able
      


case class PartyIdentification32_EPC115u4506_SCT_IB_2019_V1u460(Nm: Option[String] = None,
  PstlAdr: Option[sepa.sct.generated.paymentRecallNegativeAnswer.PostalAddress6able] = None,
  Id: Option[sepa.sct.generated.paymentRecallNegativeAnswer.Party6Choicable] = None) extends PartyIdentification32able with Party7Choice_EPC115u4506_SCT_IB_2019_V1u460Option
      


case class PartyIdentification32_EPC115u4506_SCT_IB_2019_V1u460_2(Nm: Option[String] = None,
  PstlAdr: Option[sepa.sct.generated.paymentRecallNegativeAnswer.PostalAddress6able] = None,
  Id: Option[sepa.sct.generated.paymentRecallNegativeAnswer.Party6Choicable] = None) extends PartyIdentification32able
      


case class PartyIdentification32_EPC115u4506_SCT_IB_2019_V1u460_3(Nm: Option[String] = None,
  PstlAdr: Option[sepa.sct.generated.paymentRecallNegativeAnswer.PostalAddress6able] = None,
  Id: Option[sepa.sct.generated.paymentRecallNegativeAnswer.Party6Choicable] = None) extends PartyIdentification32able
      


case class PartyIdentification32_EPC115u4506_SCT_IB_2019_V1u460_4(Nm: Option[String] = None,
  PstlAdr: Option[sepa.sct.generated.paymentRecallNegativeAnswer.PostalAddress6able] = None,
  Id: Option[sepa.sct.generated.paymentRecallNegativeAnswer.Party6Choicable] = None) extends PartyIdentification32able
      


case class PartyIdentification32_EPC115u4506_SCT_IB_2019_V1u460_5(Nm: Option[String] = None,
  PstlAdr: Option[sepa.sct.generated.paymentRecallNegativeAnswer.PostalAddress6able] = None,
  Id: Option[sepa.sct.generated.paymentRecallNegativeAnswer.Party6Choicable] = None) extends PartyIdentification32able
      

sealed trait PaymentCancellationRejection1Code

object PaymentCancellationRejection1Code {
  def fromString(value: String, scope: scala.xml.NamespaceBinding)(implicit fmt: scalaxb.XMLFormat[sepa.sct.generated.paymentRecallNegativeAnswer.PaymentCancellationRejection1Code]): PaymentCancellationRejection1Code = fmt.reads(scala.xml.Text(value), Nil) match {
    case Right(x: PaymentCancellationRejection1Code) => x
    case x => throw new RuntimeException(s"fromString returned unexpected value $x for input $value")
  }
  lazy val values: Seq[PaymentCancellationRejection1Code] = Seq(AGNT, CUST, LEGL)
}

case object AGNT extends PaymentCancellationRejection1Code { override def toString = "AGNT" }
case object CUST extends PaymentCancellationRejection1Code { override def toString = "CUST" }
case object LEGL extends PaymentCancellationRejection1Code { override def toString = "LEGL" }


/** Payment Transaction Information 33Set of elements used to provide reference and status information on the original transactions, included in the original instruction, to which the cancellation request message applies.
*/
trait PaymentTransactionInformation33able {
  def CxlStsId: Option[String]
  def OrgnlGrpInf: Option[sepa.sct.generated.paymentRecallNegativeAnswer.OriginalGroupInformation3able]
  def OrgnlInstrId: Option[String]
  def OrgnlEndToEndId: Option[String]
  def OrgnlTxId: Option[String]
  def TxCxlSts: Option[sepa.sct.generated.paymentRecallNegativeAnswer.CancellationIndividualStatus1Code]
  def CxlStsRsnInf: Seq[sepa.sct.generated.paymentRecallNegativeAnswer.CancellationStatusReasonInformation1able]
  def OrgnlTxRef: Option[sepa.sct.generated.paymentRecallNegativeAnswer.OriginalTransactionReference13able]
}


/** Payment Transaction Information 33Set of elements used to provide reference and status information on the original transactions, included in the original instruction, to which the cancellation request message applies.
*/
case class PaymentTransactionInformation33(CxlStsId: Option[String] = None,
  OrgnlGrpInf: Option[sepa.sct.generated.paymentRecallNegativeAnswer.OriginalGroupInformation3able] = None,
  OrgnlInstrId: Option[String] = None,
  OrgnlEndToEndId: Option[String] = None,
  OrgnlTxId: Option[String] = None,
  TxCxlSts: Option[sepa.sct.generated.paymentRecallNegativeAnswer.CancellationIndividualStatus1Code] = None,
  CxlStsRsnInf: Seq[sepa.sct.generated.paymentRecallNegativeAnswer.CancellationStatusReasonInformation1able] = Nil,
  OrgnlTxRef: Option[sepa.sct.generated.paymentRecallNegativeAnswer.OriginalTransactionReference13able] = None) extends PaymentTransactionInformation33able
      


case class PaymentTransactionInformation33_EPC115u4506_SCT_IB_2019_V1u460(CxlStsId: Option[String] = None,
  OrgnlGrpInf: Option[sepa.sct.generated.paymentRecallNegativeAnswer.OriginalGroupInformation3able] = None,
  OrgnlInstrId: Option[String] = None,
  OrgnlEndToEndId: Option[String] = None,
  OrgnlTxId: Option[String] = None,
  TxCxlSts: Option[sepa.sct.generated.paymentRecallNegativeAnswer.CancellationIndividualStatus1Code] = None,
  CxlStsRsnInf: Seq[sepa.sct.generated.paymentRecallNegativeAnswer.CancellationStatusReasonInformation1able] = Nil,
  OrgnlTxRef: Option[sepa.sct.generated.paymentRecallNegativeAnswer.OriginalTransactionReference13able] = None) extends PaymentTransactionInformation33able
      


/** Payment Type Information 22Set of elements used to provide further details of the type of payment.
*/
trait PaymentTypeInformation22able {
  def SvcLvl: Option[sepa.sct.generated.paymentRecallNegativeAnswer.ServiceLevel8Choicable]
  def LclInstrm: Option[sepa.sct.generated.paymentRecallNegativeAnswer.LocalInstrument2Choice]
  def CtgyPurp: Option[sepa.sct.generated.paymentRecallNegativeAnswer.CategoryPurpose1Choice]
}


/** Payment Type Information 22Set of elements used to provide further details of the type of payment.
*/
case class PaymentTypeInformation22(SvcLvl: Option[sepa.sct.generated.paymentRecallNegativeAnswer.ServiceLevel8Choicable] = None,
  LclInstrm: Option[sepa.sct.generated.paymentRecallNegativeAnswer.LocalInstrument2Choice] = None,
  CtgyPurp: Option[sepa.sct.generated.paymentRecallNegativeAnswer.CategoryPurpose1Choice] = None) extends PaymentTypeInformation22able
      


case class PaymentTypeInformation22_EPC115u4506_SCT_IB_2019_V1u460(SvcLvl: Option[sepa.sct.generated.paymentRecallNegativeAnswer.ServiceLevel8Choicable] = None,
  LclInstrm: Option[sepa.sct.generated.paymentRecallNegativeAnswer.LocalInstrument2Choice] = None,
  CtgyPurp: Option[sepa.sct.generated.paymentRecallNegativeAnswer.CategoryPurpose1Choice] = None) extends PaymentTypeInformation22able
      


/** Person Identification 5Unique and unambiguous way to identify a person.
*/
trait PersonIdentification5able extends Party6ChoicableOption {
  def DtAndPlcOfBirth: Option[sepa.sct.generated.paymentRecallNegativeAnswer.DateAndPlaceOfBirth]
  def Othr: Seq[sepa.sct.generated.paymentRecallNegativeAnswer.GenericPersonIdentification1]
}


/** Person Identification 5Unique and unambiguous way to identify a person.
*/
case class PersonIdentification5(DtAndPlcOfBirth: Option[sepa.sct.generated.paymentRecallNegativeAnswer.DateAndPlaceOfBirth] = None,
  Othr: Seq[sepa.sct.generated.paymentRecallNegativeAnswer.GenericPersonIdentification1] = Nil) extends PersonIdentification5able
      


case class PersonIdentification5_EPC115u4506_SCT_IB_2019_V1u460(DtAndPlcOfBirth: Option[sepa.sct.generated.paymentRecallNegativeAnswer.DateAndPlaceOfBirth] = None,
  Othr: Seq[sepa.sct.generated.paymentRecallNegativeAnswer.GenericPersonIdentification1] = Nil) extends PersonIdentification5able with Party6Choice_EPC115u4506_SCT_IB_2019_V1u460_2Option
      


/** Person Identification Scheme Name 1ChoiceSets of elements to identify a name of the identification scheme.
*/
case class PersonIdentificationSchemeName1Choice(personidentificationschemename1choiceoption: scalaxb.DataRecord[Any])
      

trait PersonIdentificationSchemeName1ChoiceOption

/** Postal Address 6Information that locates and identifies a specific address, as defined by postal services.
*/
trait PostalAddress6able {
  def Ctry: Option[String]
  def AdrLine: Seq[String]
}


/** Postal Address 6Information that locates and identifies a specific address, as defined by postal services.
*/
case class PostalAddress6(Ctry: Option[String] = None,
  AdrLine: Seq[String] = Nil) extends PostalAddress6able
      


case class PostalAddress6_EPC115u4506_SCT_IB_2019_V1u460(Ctry: Option[String] = None,
  AdrLine: Seq[String] = Nil) extends PostalAddress6able
      


/** Remittance Information 5Information supplied to enable the matching/reconciliation of an entry with the items that the payment is intended to settle, such as commercial invoices in an accounts' receivable system.
*/
trait RemittanceInformation5able {
  def Ustrd: Seq[String]
  def Strd: Seq[sepa.sct.generated.paymentRecallNegativeAnswer.StructuredRemittanceInformation7able]
}


/** Remittance Information 5Information supplied to enable the matching/reconciliation of an entry with the items that the payment is intended to settle, such as commercial invoices in an accounts' receivable system.
*/
case class RemittanceInformation5(Ustrd: Seq[String] = Nil,
  Strd: Seq[sepa.sct.generated.paymentRecallNegativeAnswer.StructuredRemittanceInformation7able] = Nil) extends RemittanceInformation5able
      


case class RemittanceInformation5_EPC115u4506_SCT_IB_2019_V1u460(Ustrd: Seq[String] = Nil,
  Strd: Seq[sepa.sct.generated.paymentRecallNegativeAnswer.StructuredRemittanceInformation7able] = Nil) extends RemittanceInformation5able
      


/** Resolution Of Investigation V03This message allows a Case Assignee to inform the Case Assigner of the result of the investigation process. Sending a Confirmation of Investigation means that the case is re-assigned to the receiver of this Confirmation.
*/
trait ResolutionOfInvestigationV03able {
  def Assgnmt: sepa.sct.generated.paymentRecallNegativeAnswer.CaseAssignment2able
  def Sts: sepa.sct.generated.paymentRecallNegativeAnswer.InvestigationStatus2Choicable
  def CxlDtls: Seq[sepa.sct.generated.paymentRecallNegativeAnswer.UnderlyingTransaction3able]
}


/** Resolution Of Investigation V03This message allows a Case Assignee to inform the Case Assigner of the result of the investigation process. Sending a Confirmation of Investigation means that the case is re-assigned to the receiver of this Confirmation.
*/
case class ResolutionOfInvestigationV03(Assgnmt: sepa.sct.generated.paymentRecallNegativeAnswer.CaseAssignment2able,
  Sts: sepa.sct.generated.paymentRecallNegativeAnswer.InvestigationStatus2Choicable,
  CxlDtls: Seq[sepa.sct.generated.paymentRecallNegativeAnswer.UnderlyingTransaction3able] = Nil) extends ResolutionOfInvestigationV03able
      


case class ResolutionOfInvestigationV03_EPC115u4506_SCT_IB_2019_V1u460(Assgnmt: sepa.sct.generated.paymentRecallNegativeAnswer.CaseAssignment2able,
  Sts: sepa.sct.generated.paymentRecallNegativeAnswer.InvestigationStatus2Choicable,
  CxlDtls: Seq[sepa.sct.generated.paymentRecallNegativeAnswer.UnderlyingTransaction3able] = Nil) extends ResolutionOfInvestigationV03able
      


/** Service Level 8ChoiceSpecifies the service level of the transaction.
*/
trait ServiceLevel8Choicable {
  def servicelevel8choicableoption: scalaxb.DataRecord[String]
}


/** Service Level 8ChoiceSpecifies the service level of the transaction.
*/
case class ServiceLevel8Choice(servicelevel8choicableoption: scalaxb.DataRecord[String]) extends ServiceLevel8Choicable
      

trait ServiceLevel8ChoicableOption

case class ServiceLevel8Choice_EPC115u4506_SCT_IB_2019_V1u460(servicelevel8choicableoption: scalaxb.DataRecord[String]) extends ServiceLevel8Choicable
      

trait ServiceLevel8Choice_EPC115u4506_SCT_IB_2019_V1u460Option

/** Settlement Information 13Set of elements used to provide information on the settlement of the instruction.
*/
case class SettlementInformation13(SttlmMtd: sepa.sct.generated.paymentRecallNegativeAnswer.SettlementMethod1Code,
  SttlmAcct: Option[sepa.sct.generated.paymentRecallNegativeAnswer.CashAccount16able] = None,
  ClrSys: Option[sepa.sct.generated.paymentRecallNegativeAnswer.ClearingSystemIdentification3Choice] = None)
      

sealed trait SettlementMethod1Code

object SettlementMethod1Code {
  def fromString(value: String, scope: scala.xml.NamespaceBinding)(implicit fmt: scalaxb.XMLFormat[sepa.sct.generated.paymentRecallNegativeAnswer.SettlementMethod1Code]): SettlementMethod1Code = fmt.reads(scala.xml.Text(value), Nil) match {
    case Right(x: SettlementMethod1Code) => x
    case x => throw new RuntimeException(s"fromString returned unexpected value $x for input $value")
  }
  lazy val values: Seq[SettlementMethod1Code] = Seq(CLRG, INDA, INGA)
}

case object CLRG extends SettlementMethod1Code { override def toString = "CLRG" }
case object INDA extends SettlementMethod1Code { override def toString = "INDA" }
case object INGA extends SettlementMethod1Code { override def toString = "INGA" }


/** Structured Remittance Information 7Information supplied to enable the matching/reconciliation of an entry with the items that the payment is intended to settle, such as commercial invoices in an accounts' receivable system, in a structured form.
*/
trait StructuredRemittanceInformation7able {
  def CdtrRefInf: Option[sepa.sct.generated.paymentRecallNegativeAnswer.CreditorReferenceInformation2able]
}


/** Structured Remittance Information 7Information supplied to enable the matching/reconciliation of an entry with the items that the payment is intended to settle, such as commercial invoices in an accounts' receivable system, in a structured form.
*/
case class StructuredRemittanceInformation7(CdtrRefInf: Option[sepa.sct.generated.paymentRecallNegativeAnswer.CreditorReferenceInformation2able] = None) extends StructuredRemittanceInformation7able
      


case class StructuredRemittanceInformation7_EPC115u4506_SCT_IB_2019_V1u460(CdtrRefInf: Option[sepa.sct.generated.paymentRecallNegativeAnswer.CreditorReferenceInformation2able] = None) extends StructuredRemittanceInformation7able
      


/** Underlying Transaction 3Set of elements used to identify the underlying (group of) transaction(s) to which the resolution of investigation applies.
*/
trait UnderlyingTransaction3able {
  def TxInfAndSts: Seq[sepa.sct.generated.paymentRecallNegativeAnswer.PaymentTransactionInformation33able]
}


/** Underlying Transaction 3Set of elements used to identify the underlying (group of) transaction(s) to which the resolution of investigation applies.
*/
case class UnderlyingTransaction3(TxInfAndSts: Seq[sepa.sct.generated.paymentRecallNegativeAnswer.PaymentTransactionInformation33able] = Nil) extends UnderlyingTransaction3able
      


case class UnderlyingTransaction3_EPC115u4506_SCT_IB_2019_V1u460(TxInfAndSts: Seq[sepa.sct.generated.paymentRecallNegativeAnswer.PaymentTransactionInformation33able] = Nil) extends UnderlyingTransaction3able
      

