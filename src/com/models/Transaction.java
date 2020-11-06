package com.models;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "type", "clearingReferenceNumber", "subAccount", "settlementDate", "orderId", "sma",
		"requirementReallocationAmount", "dayTradeBuyingPowerEffect", "netAmount", "transactionDate", "orderDate",
		"transactionSubType", "transactionId", "cashBalanceEffectFlag", "description", "achStatus", "accruedInterest",
		"fees", "transactionItem" })
public class Transaction {

	@JsonProperty("type")
	private String type;
	@JsonProperty("clearingReferenceNumber")
	private String clearingReferenceNumber;
	@JsonProperty("subAccount")
	private String subAccount;
	@JsonProperty("settlementDate")
	private String settlementDate;
	@JsonProperty("orderId")
	private String orderId;
	@JsonProperty("sma")
	private int sma;
	@JsonProperty("requirementReallocationAmount")
	private int requirementReallocationAmount;
	@JsonProperty("dayTradeBuyingPowerEffect")
	private int dayTradeBuyingPowerEffect;
	@JsonProperty("netAmount")
	private int netAmount;
	@JsonProperty("transactionDate")
	private String transactionDate;
	@JsonProperty("orderDate")
	private String orderDate;
	@JsonProperty("transactionSubType")
	private String transactionSubType;
	@JsonProperty("transactionId")
	private int transactionId;
	@JsonProperty("cashBalanceEffectFlag")
	private boolean cashBalanceEffectFlag;
	@JsonProperty("description")
	private String description;
	@JsonProperty("achStatus")
	private String achStatus;
	@JsonProperty("accruedInterest")
	private int accruedInterest;
	@JsonProperty("fees")
	private String fees;
	@JsonProperty("transactionItem")
	private TransactionItem transactionItem;

	/**
	 * No args constructor for use in serialization
	 *
	 */
	public Transaction() {
	}

	/**
	 *
	 * @param transactionSubType
	 * @param transactionId
	 * @param orderDate
	 * @param clearingReferenceNumber
	 * @param transactionItem
	 * @param requirementReallocationAmount
	 * @param fees
	 * @param type
	 * @param achStatus
	 * @param transactionDate
	 * @param settlementDate
	 * @param sma
	 * @param cashBalanceEffectFlag
	 * @param description
	 * @param accruedInterest
	 * @param subAccount
	 * @param dayTradeBuyingPowerEffect
	 * @param orderId
	 * @param netAmount
	 */
	public Transaction(String type, String clearingReferenceNumber, String subAccount, String settlementDate,
			String orderId, int sma, int requirementReallocationAmount, int dayTradeBuyingPowerEffect, int netAmount,
			String transactionDate, String orderDate, String transactionSubType, int transactionId,
			boolean cashBalanceEffectFlag, String description, String achStatus, int accruedInterest, String fees,
			TransactionItem transactionItem) {
		super();
		this.type = type;
		this.clearingReferenceNumber = clearingReferenceNumber;
		this.subAccount = subAccount;
		this.settlementDate = settlementDate;
		this.orderId = orderId;
		this.sma = sma;
		this.requirementReallocationAmount = requirementReallocationAmount;
		this.dayTradeBuyingPowerEffect = dayTradeBuyingPowerEffect;
		this.netAmount = netAmount;
		this.transactionDate = transactionDate;
		this.orderDate = orderDate;
		this.transactionSubType = transactionSubType;
		this.transactionId = transactionId;
		this.cashBalanceEffectFlag = cashBalanceEffectFlag;
		this.description = description;
		this.achStatus = achStatus;
		this.accruedInterest = accruedInterest;
		this.fees = fees;
		this.transactionItem = transactionItem;
	}

	@JsonProperty("type")
	public String getType() {
		return type;
	}

	@JsonProperty("type")
	public void setType(String type) {
		this.type = type;
	}

	@JsonProperty("clearingReferenceNumber")
	public String getClearingReferenceNumber() {
		return clearingReferenceNumber;
	}

	@JsonProperty("clearingReferenceNumber")
	public void setClearingReferenceNumber(String clearingReferenceNumber) {
		this.clearingReferenceNumber = clearingReferenceNumber;
	}

	@JsonProperty("subAccount")
	public String getSubAccount() {
		return subAccount;
	}

	@JsonProperty("subAccount")
	public void setSubAccount(String subAccount) {
		this.subAccount = subAccount;
	}

	@JsonProperty("settlementDate")
	public String getSettlementDate() {
		return settlementDate;
	}

	@JsonProperty("settlementDate")
	public void setSettlementDate(String settlementDate) {
		this.settlementDate = settlementDate;
	}

	@JsonProperty("orderId")
	public String getOrderId() {
		return orderId;
	}

	@JsonProperty("orderId")
	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

	@JsonProperty("sma")
	public int getSma() {
		return sma;
	}

	@JsonProperty("sma")
	public void setSma(int sma) {
		this.sma = sma;
	}

	@JsonProperty("requirementReallocationAmount")
	public int getRequirementReallocationAmount() {
		return requirementReallocationAmount;
	}

	@JsonProperty("requirementReallocationAmount")
	public void setRequirementReallocationAmount(int requirementReallocationAmount) {
		this.requirementReallocationAmount = requirementReallocationAmount;
	}

	@JsonProperty("dayTradeBuyingPowerEffect")
	public int getDayTradeBuyingPowerEffect() {
		return dayTradeBuyingPowerEffect;
	}

	@JsonProperty("dayTradeBuyingPowerEffect")
	public void setDayTradeBuyingPowerEffect(int dayTradeBuyingPowerEffect) {
		this.dayTradeBuyingPowerEffect = dayTradeBuyingPowerEffect;
	}

	@JsonProperty("netAmount")
	public int getNetAmount() {
		return netAmount;
	}

	@JsonProperty("netAmount")
	public void setNetAmount(int netAmount) {
		this.netAmount = netAmount;
	}

	@JsonProperty("transactionDate")
	public String getTransactionDate() {
		return transactionDate;
	}

	@JsonProperty("transactionDate")
	public void setTransactionDate(String transactionDate) {
		this.transactionDate = transactionDate;
	}

	@JsonProperty("orderDate")
	public String getOrderDate() {
		return orderDate;
	}

	@JsonProperty("orderDate")
	public void setOrderDate(String orderDate) {
		this.orderDate = orderDate;
	}

	@JsonProperty("transactionSubType")
	public String getTransactionSubType() {
		return transactionSubType;
	}

	@JsonProperty("transactionSubType")
	public void setTransactionSubType(String transactionSubType) {
		this.transactionSubType = transactionSubType;
	}

	@JsonProperty("transactionId")
	public int getTransactionId() {
		return transactionId;
	}

	@JsonProperty("transactionId")
	public void setTransactionId(int transactionId) {
		this.transactionId = transactionId;
	}

	@JsonProperty("cashBalanceEffectFlag")
	public boolean isCashBalanceEffectFlag() {
		return cashBalanceEffectFlag;
	}

	@JsonProperty("cashBalanceEffectFlag")
	public void setCashBalanceEffectFlag(boolean cashBalanceEffectFlag) {
		this.cashBalanceEffectFlag = cashBalanceEffectFlag;
	}

	@JsonProperty("description")
	public String getDescription() {
		return description;
	}

	@JsonProperty("description")
	public void setDescription(String description) {
		this.description = description;
	}

	@JsonProperty("achStatus")
	public String getAchStatus() {
		return achStatus;
	}

	@JsonProperty("achStatus")
	public void setAchStatus(String achStatus) {
		this.achStatus = achStatus;
	}

	@JsonProperty("accruedInterest")
	public int getAccruedInterest() {
		return accruedInterest;
	}

	@JsonProperty("accruedInterest")
	public void setAccruedInterest(int accruedInterest) {
		this.accruedInterest = accruedInterest;
	}

	@JsonProperty("fees")
	public String getFees() {
		return fees;
	}

	@JsonProperty("fees")
	public void setFees(String fees) {
		this.fees = fees;
	}

	@JsonProperty("transactionItem")
	public TransactionItem getTransactionItem() {
		return transactionItem;
	}

	@JsonProperty("transactionItem")
	public void setTransactionItem(TransactionItem transactionItem) {
		this.transactionItem = transactionItem;
	}

}