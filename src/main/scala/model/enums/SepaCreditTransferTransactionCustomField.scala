package model.enums

object SepaCreditTransferTransactionCustomField extends Enumeration {
  type SepaCreditTransferTransactionCustomField = Value

  val PAYMENT_RETURN_ORIGINATOR = Value("paymentReturnOriginator")
  val PAYMENT_RETURN_REASON_CODE = Value("paymentReturnReasonCode")
  val PAYMENT_RETURN_ORIGINAL_MESSAGE_ID_IN_SEPA_FILE = Value("paymentReturnOriginalMessageIdInSepaFile")
  val PAYMENT_RETURN_ORIGINAL_MESSAGE_TYPE = Value("paymentReturnOriginalMessageType")
  val PAYMENT_RETURN_CHARGES_AMOUNT = Value("paymentReturnChargesAmount")
  val PAYMENT_RETURN_CHARGES_PARTY = Value("paymentReturnChargesParty")

  val PAYMENT_REJECT_ORIGINATOR = Value("paymentRejectOriginator")
  val PAYMENT_REJECT_REASON_CODE = Value("paymentRejectReasonCode")
  val PAYMENT_REJECT_TRANSACTION_STATUS = Value("paymentRejectTransactionStatus")

  val PAYMENT_RECALL_ORIGINATOR = Value("paymentRecallOriginator")
  val PAYMENT_RECALL_REASON_CODE = Value("paymentRecallReasonCode")
  val PAYMENT_RECALL_ADDITIONAL_INFORMATION = Value("paymentRecallAdditionalInformation")
  val PAYMENT_RECALL_ORIGINAL_MESSAGE_ID_IN_SEPA_FILE = Value("paymentRecallOriginalMessageIdInSepaFile")
  val PAYMENT_RECALL_ORIGINAL_MESSAGE_TYPE = Value("paymentRecallOriginalMessageType")

  val PAYMENT_RECALL_NEGATIVE_ANSWER_ORIGINAL_MESSAGE_ID_IN_SEPA_FILE = Value("paymentRecallNegativeAnswerOriginalMessageIdInSepaFile")
  val PAYMENT_RECALL_NEGATIVE_ANSWER_ORIGINAL_MESSAGE_TYPE = Value("paymentRecallNegativeAnswerOriginalMessageType")
  val PAYMENT_RECALL_NEGATIVE_ANSWER_REASON_INFORMATION = Value("paymentRecallNegativeAnswerReasonInformation")
  val PAYMENT_RECALL_NEGATIVE_ANSWER_REASON_INFORMATION_ORIGINATOR = Value("paymentRecallNegativeAnswerReasonCodeInformationOriginator")
  val PAYMENT_RECALL_NEGATIVE_ANSWER_REASON_INFORMATION_REASON_CODE = Value("paymentRecallNegativeAnswerReasonCodeInformationReasonCode")
  val PAYMENT_RECALL_NEGATIVE_ANSWER_REASON_INFORMATION_ADDITIONAL_INFORMATION = Value("paymentRecallNegativeAnswerReasonCodeInformationAdditionalInformation")

  val INQUIRY_CLAIM_NON_RECEIPT_CASE_ID = Value("inquiryClaimNonReceiptCaseId")
  val INQUIRY_CLAIM_NON_RECEIPT_CASE_CREATOR = Value("inquiryClaimNonReceiptCaseCreator")
  val INQUIRY_CLAIM_NON_RECEIPT_ORIGINAL_MESSAGE_ID_IN_SEPA_FILE = Value("inquiryClaimNonReceiptOriginalMessageIdInSepaFile")
  val INQUIRY_CLAIM_NON_RECEIPT_ORIGINAL_MESSAGE_TYPE = Value("inquiryClaimNonReceiptOriginalMessageType")
  val INQUIRY_CLAIM_NON_RECEIPT_ADDITIONAL_INFORMATION = Value("inquiryClaimNonReceiptAdditionalInformation")

  val INQUIRY_CLAIM_NON_RECEIPT_RESPONSE_CASE_ID = Value("inquiryClaimNonReceiptResponseCaseId")
  val INQUIRY_CLAIM_NON_RECEIPT_RESPONSE_CASE_CREATOR = Value("inquiryClaimNonReceiptResponseCaseCreator")
  val INQUIRY_CLAIM_NON_RECEIPT_RESPONSE_STATUS_CODE = Value("inquiryClaimNonReceiptResponseStatusCode")
  val INQUIRY_CLAIM_NON_RECEIPT_RESPONSE_MODIFICATION_STATUS_ID = Value("inquiryClaimNonReceiptResponseModificationStatusId")
  val INQUIRY_CLAIM_NON_RECEIPT_RESPONSE_ORIGINAL_MESSAGE_ID_IN_SEPA_FILE = Value("inquiryClaimNonReceiptResponseOriginalMessageIdInSepaFile")
  val INQUIRY_CLAIM_NON_RECEIPT_RESPONSE_ORIGINAL_MESSAGE_TYPE = Value("inquiryClaimNonReceiptResponseOriginalMessageType")
  val INQUIRY_CLAIM_NON_RECEIPT_ACCEPTED_DATE_PROCESSED = Value("inquiryClaimNonReceiptAcceptedDateProcessed")
  val INQUIRY_CLAIM_NON_RECEIPT_ACCEPTED_ORIGINAL_NEXT_AGENT = Value("inquiryClaimNonReceiptAcceptedOriginalNextAgent")
  val INQUIRY_CLAIM_NON_RECEIPT_ACCEPTED_CHARGES_AMOUNT = Value("inquiryClaimNonReceiptAcceptedChargesAmount")
  val INQUIRY_CLAIM_NON_RECEIPT_ACCEPTED_CHARGES_AGENT = Value("inquiryClaimNonReceiptAcceptedChargesAgent")
  val INQUIRY_CLAIM_NON_RECEIPT_REJECTED_REASON_CODE = Value("inquiryClaimNonReceiptRejectedReasonCode")

  val INQUIRY_CLAIM_VALUE_DATE_CORRECTION_CASE_ID = Value("inquiryClaimValueDateCorrectionCaseId")
  val INQUIRY_CLAIM_VALUE_DATE_CORRECTION_CASE_CREATOR = Value("inquiryClaimValueDateCorrectionCaseCreator")
  val INQUIRY_CLAIM_VALUE_DATE_CORRECTION_ORIGINAL_MESSAGE_ID_IN_SEPA_FILE = Value("inquiryClaimValueDateCorrectionOriginalMessageIdInSepaFile")
  val INQUIRY_CLAIM_VALUE_DATE_CORRECTION_ORIGINAL_MESSAGE_TYPE = Value("inquiryClaimValueDateCorrectionOriginalMessageType")
  val INQUIRY_CLAIM_VALUE_DATE_CORRECTION_NEW_SETTLEMENT_DATE = Value("inquiryClaimValueDateCorrectionNewSettlementDate")
  val INQUIRY_CLAIM_VALUE_DATE_CORRECTION_ADDITIONAL_INFORMATION = Value("inquiryClaimValueDateCorrectionAdditionalInformation")

  val INQUIRY_CLAIM_VALUE_DATE_CORRECTION_RESPONSE_CASE_ID = Value("inquiryClaimValueDateCorrectionResponseCaseId")
  val INQUIRY_CLAIM_VALUE_DATE_CORRECTION_RESPONSE_CASE_CREATOR = Value("inquiryClaimValueDateCorrectionResponseCaseCreator")
  val INQUIRY_CLAIM_VALUE_DATE_CORRECTION_RESPONSE_STATUS_CODE = Value("inquiryClaimValueDateCorrectionResponseStatusCode")
  val INQUIRY_CLAIM_VALUE_DATE_CORRECTION_RESPONSE_MODIFICATION_STATUS_ID = Value("inquiryClaimValueDateCorrectionResponseModificationStatusId")
  val INQUIRY_CLAIM_VALUE_DATE_CORRECTION_RESPONSE_ORIGINAL_MESSAGE_ID_IN_SEPA_FILE = Value("inquiryClaimValueDateCorrectionResponseOriginalMessageIdInSepaFile")
  val INQUIRY_CLAIM_VALUE_DATE_CORRECTION_RESPONSE_ORIGINAL_MESSAGE_TYPE = Value("inquiryClaimValueDateCorrectionResponseOriginalMessageType")
  val INQUIRY_CLAIM_VALUE_DATE_CORRECTION_ACCEPTED_NEW_SETTLEMENT_DATE = Value("inquiryClaimValueDateCorrectionAcceptedNewSettlementDate")
  val INQUIRY_CLAIM_VALUE_DATE_CORRECTION_ACCEPTED_COMPENSATION_AMOUNT = Value("inquiryClaimValueDateCorrectionAcceptedCompensationAmount")
  val INQUIRY_CLAIM_VALUE_DATE_CORRECTION_ACCEPTED_COMPENSATION_DEBTOR_AGENT = Value("inquiryClaimValueDateCorrectionAcceptedCompensationDebtorAgent")
  val INQUIRY_CLAIM_VALUE_DATE_CORRECTION_ACCEPTED_COMPENSATION_CREDITOR_AGENT = Value("inquiryClaimValueDateCorrectionAcceptedCompensationCreditorAgent")
  val INQUIRY_CLAIM_VALUE_DATE_CORRECTION_ACCEPTED_COMPENSATION_REASON_CODE = Value("inquiryClaimValueDateCorrectionAcceptedCompensationReasonCode")
  val INQUIRY_CLAIM_VALUE_DATE_CORRECTION_ACCEPTED_CHARGES_AMOUNT = Value("inquiryClaimValueDateCorrectionAcceptedChargesAmount")
  val INQUIRY_CLAIM_VALUE_DATE_CORRECTION_ACCEPTED_CHARGES_AGENT = Value("inquiryClaimValueDateCorrectionAcceptedChargesAgent")

  val REQUEST_STATUS_UPDATE_ORIGINAL_MESSAGE_ID_IN_SEPA_FILE = Value("requestStatusUpdateOriginalMessageIdInSepaFile")
  val REQUEST_STATUS_UPDATE_ORIGINAL_MESSAGE_TYPE = Value("requestStatusUpdateOriginalMessageType")
}
