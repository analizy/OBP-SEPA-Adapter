package model.enums

import model.enums

object SepaCreditTransferTransactionStatus extends Enumeration {
  type SepaCreditTransferTransactionStatus = Value

  val PROCESSED: SepaCreditTransferTransactionStatus.Value = Value
  val UNPROCESSED: SepaCreditTransferTransactionStatus.Value = Value
  val PROCESSING_ERROR: SepaCreditTransferTransactionStatus.Value = Value

  val TO_TRANSFER: SepaCreditTransferTransactionStatus.Value = Value
  val TRANSFERED: SepaCreditTransferTransactionStatus.Value = Value
  val TRANSFER_ERROR: SepaCreditTransferTransactionStatus.Value = Value

  val TO_RETURN: enums.SepaCreditTransferTransactionStatus.Value = Value
  val RETURNED: enums.SepaCreditTransferTransactionStatus.Value = Value
  val RETURN_ERROR: enums.SepaCreditTransferTransactionStatus.Value = Value

  val REJECTED: enums.SepaCreditTransferTransactionStatus.Value = Value
  val REJECT_ERROR: enums.SepaCreditTransferTransactionStatus.Value = Value

  val TO_RECALL: enums.SepaCreditTransferTransactionStatus.Value = Value
  val RECALLED: enums.SepaCreditTransferTransactionStatus.Value = Value
  val TO_RECALL_REJECT: enums.SepaCreditTransferTransactionStatus.Value = Value
  val RECALL_REJECTED: enums.SepaCreditTransferTransactionStatus.Value = Value
  val RECALL_ERROR: enums.SepaCreditTransferTransactionStatus.Value = Value

  val CLAIMED_NON_RECEIPT: enums.SepaCreditTransferTransactionStatus.Value = Value
  val CLAIMED_VALUE_DATE_CORRECTION: enums.SepaCreditTransferTransactionStatus.Value = Value

  val CLAIM_NON_RECEIPT_ACCEPTED: enums.SepaCreditTransferTransactionStatus.Value = Value
  val CLAIM_NON_RECEIPT_REJECTED: enums.SepaCreditTransferTransactionStatus.Value = Value

  val CLAIM_VALUE_DATE_CORRECTION_ACCEPTED: enums.SepaCreditTransferTransactionStatus.Value = Value
  val CLAIM_VALUE_DATE_CORRECTION_REJECTED: enums.SepaCreditTransferTransactionStatus.Value = Value

  val REQUESTED_STATUS_UPDATE: enums.SepaCreditTransferTransactionStatus.Value = Value
}
