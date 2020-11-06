package com.models;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "accruedInterest", "cashAvailableForTrading", "cashAvailableForWithdrawal", "cashBalance",
		"bondValue", "cashReceipts", "liquidationValue", "longOptionMarketValue", "longStockValue", "moneyMarketFund",
		"mutualFundValue", "shortOptionMarketValue", "shortStockValue", "isInCall", "unsettledCash",
		"cashDebitCallValue", "pendingDeposits", "accountValue" })
public class InitialBalances {

	@JsonProperty("accruedInterest")
	private int accruedInterest;
	@JsonProperty("cashAvailableForTrading")
	private int cashAvailableForTrading;
	@JsonProperty("cashAvailableForWithdrawal")
	private int cashAvailableForWithdrawal;
	@JsonProperty("cashBalance")
	private int cashBalance;
	@JsonProperty("bondValue")
	private int bondValue;
	@JsonProperty("cashReceipts")
	private int cashReceipts;
	@JsonProperty("liquidationValue")
	private int liquidationValue;
	@JsonProperty("longOptionMarketValue")
	private int longOptionMarketValue;
	@JsonProperty("longStockValue")
	private int longStockValue;
	@JsonProperty("moneyMarketFund")
	private int moneyMarketFund;
	@JsonProperty("mutualFundValue")
	private int mutualFundValue;
	@JsonProperty("shortOptionMarketValue")
	private int shortOptionMarketValue;
	@JsonProperty("shortStockValue")
	private int shortStockValue;
	@JsonProperty("isInCall")
	private boolean isInCall;
	@JsonProperty("unsettledCash")
	private int unsettledCash;
	@JsonProperty("cashDebitCallValue")
	private int cashDebitCallValue;
	@JsonProperty("pendingDeposits")
	private int pendingDeposits;
	@JsonProperty("accountValue")
	private int accountValue;
	@JsonIgnore
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();

	/**
	 * No args constructor for use in serialization
	 *
	 */
	public InitialBalances() {
	}

	/**
	 *
	 * @param cashReceipts
	 * @param mutualFundValue
	 * @param pendingDeposits
	 * @param liquidationValue
	 * @param shortOptionMarketValue
	 * @param isInCall
	 * @param longOptionMarketValue
	 * @param cashAvailableForTrading
	 * @param bondValue
	 * @param cashDebitCallValue
	 * @param shortStockValue
	 * @param cashAvailableForWithdrawal
	 * @param unsettledCash
	 * @param accountValue
	 * @param longStockValue
	 * @param moneyMarketFund
	 * @param accruedInterest
	 * @param cashBalance
	 */
	public InitialBalances(int accruedInterest, int cashAvailableForTrading, int cashAvailableForWithdrawal,
			int cashBalance, int bondValue, int cashReceipts, int liquidationValue, int longOptionMarketValue,
			int longStockValue, int moneyMarketFund, int mutualFundValue, int shortOptionMarketValue,
			int shortStockValue, boolean isInCall, int unsettledCash, int cashDebitCallValue, int pendingDeposits,
			int accountValue) {
		super();
		this.accruedInterest = accruedInterest;
		this.cashAvailableForTrading = cashAvailableForTrading;
		this.cashAvailableForWithdrawal = cashAvailableForWithdrawal;
		this.cashBalance = cashBalance;
		this.bondValue = bondValue;
		this.cashReceipts = cashReceipts;
		this.liquidationValue = liquidationValue;
		this.longOptionMarketValue = longOptionMarketValue;
		this.longStockValue = longStockValue;
		this.moneyMarketFund = moneyMarketFund;
		this.mutualFundValue = mutualFundValue;
		this.shortOptionMarketValue = shortOptionMarketValue;
		this.shortStockValue = shortStockValue;
		this.isInCall = isInCall;
		this.unsettledCash = unsettledCash;
		this.cashDebitCallValue = cashDebitCallValue;
		this.pendingDeposits = pendingDeposits;
		this.accountValue = accountValue;
	}

	@JsonProperty("accruedInterest")
	public int getAccruedInterest() {
		return accruedInterest;
	}

	@JsonProperty("accruedInterest")
	public void setAccruedInterest(int accruedInterest) {
		this.accruedInterest = accruedInterest;
	}

	@JsonProperty("cashAvailableForTrading")
	public int getCashAvailableForTrading() {
		return cashAvailableForTrading;
	}

	@JsonProperty("cashAvailableForTrading")
	public void setCashAvailableForTrading(int cashAvailableForTrading) {
		this.cashAvailableForTrading = cashAvailableForTrading;
	}

	@JsonProperty("cashAvailableForWithdrawal")
	public int getCashAvailableForWithdrawal() {
		return cashAvailableForWithdrawal;
	}

	@JsonProperty("cashAvailableForWithdrawal")
	public void setCashAvailableForWithdrawal(int cashAvailableForWithdrawal) {
		this.cashAvailableForWithdrawal = cashAvailableForWithdrawal;
	}

	@JsonProperty("cashBalance")
	public int getCashBalance() {
		return cashBalance;
	}

	@JsonProperty("cashBalance")
	public void setCashBalance(int cashBalance) {
		this.cashBalance = cashBalance;
	}

	@JsonProperty("bondValue")
	public int getBondValue() {
		return bondValue;
	}

	@JsonProperty("bondValue")
	public void setBondValue(int bondValue) {
		this.bondValue = bondValue;
	}

	@JsonProperty("cashReceipts")
	public int getCashReceipts() {
		return cashReceipts;
	}

	@JsonProperty("cashReceipts")
	public void setCashReceipts(int cashReceipts) {
		this.cashReceipts = cashReceipts;
	}

	@JsonProperty("liquidationValue")
	public int getLiquidationValue() {
		return liquidationValue;
	}

	@JsonProperty("liquidationValue")
	public void setLiquidationValue(int liquidationValue) {
		this.liquidationValue = liquidationValue;
	}

	@JsonProperty("longOptionMarketValue")
	public int getLongOptionMarketValue() {
		return longOptionMarketValue;
	}

	@JsonProperty("longOptionMarketValue")
	public void setLongOptionMarketValue(int longOptionMarketValue) {
		this.longOptionMarketValue = longOptionMarketValue;
	}

	@JsonProperty("longStockValue")
	public int getLongStockValue() {
		return longStockValue;
	}

	@JsonProperty("longStockValue")
	public void setLongStockValue(int longStockValue) {
		this.longStockValue = longStockValue;
	}

	@JsonProperty("moneyMarketFund")
	public int getMoneyMarketFund() {
		return moneyMarketFund;
	}

	@JsonProperty("moneyMarketFund")
	public void setMoneyMarketFund(int moneyMarketFund) {
		this.moneyMarketFund = moneyMarketFund;
	}

	@JsonProperty("mutualFundValue")
	public int getMutualFundValue() {
		return mutualFundValue;
	}

	@JsonProperty("mutualFundValue")
	public void setMutualFundValue(int mutualFundValue) {
		this.mutualFundValue = mutualFundValue;
	}

	@JsonProperty("shortOptionMarketValue")
	public int getShortOptionMarketValue() {
		return shortOptionMarketValue;
	}

	@JsonProperty("shortOptionMarketValue")
	public void setShortOptionMarketValue(int shortOptionMarketValue) {
		this.shortOptionMarketValue = shortOptionMarketValue;
	}

	@JsonProperty("shortStockValue")
	public int getShortStockValue() {
		return shortStockValue;
	}

	@JsonProperty("shortStockValue")
	public void setShortStockValue(int shortStockValue) {
		this.shortStockValue = shortStockValue;
	}

	@JsonProperty("isInCall")
	public boolean isIsInCall() {
		return isInCall;
	}

	@JsonProperty("isInCall")
	public void setIsInCall(boolean isInCall) {
		this.isInCall = isInCall;
	}

	@JsonProperty("unsettledCash")
	public int getUnsettledCash() {
		return unsettledCash;
	}

	@JsonProperty("unsettledCash")
	public void setUnsettledCash(int unsettledCash) {
		this.unsettledCash = unsettledCash;
	}

	@JsonProperty("cashDebitCallValue")
	public int getCashDebitCallValue() {
		return cashDebitCallValue;
	}

	@JsonProperty("cashDebitCallValue")
	public void setCashDebitCallValue(int cashDebitCallValue) {
		this.cashDebitCallValue = cashDebitCallValue;
	}

	@JsonProperty("pendingDeposits")
	public int getPendingDeposits() {
		return pendingDeposits;
	}

	@JsonProperty("pendingDeposits")
	public void setPendingDeposits(int pendingDeposits) {
		this.pendingDeposits = pendingDeposits;
	}

	@JsonProperty("accountValue")
	public int getAccountValue() {
		return accountValue;
	}

	@JsonProperty("accountValue")
	public void setAccountValue(int accountValue) {
		this.accountValue = accountValue;
	}

	@JsonAnyGetter
	public Map<String, Object> getAdditionalProperties() {
		return this.additionalProperties;
	}

	@JsonAnySetter
	public void setAdditionalProperty(String name, Object value) {
		this.additionalProperties.put(name, value);
	}

}