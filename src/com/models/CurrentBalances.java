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
@JsonPropertyOrder({ "accruedInterest", "cashBalance", "cashReceipts", "longOptionMarketValue", "liquidationValue",
		"longMarketValue", "moneyMarketFund", "savings", "shortMarketValue", "pendingDeposits",
		"cashAvailableForTrading", "cashAvailableForWithdrawal", "cashCall", "longNonMarginableMarketValue",
		"totalCash", "shortOptionMarketValue", "mutualFundValue", "bondValue", "cashDebitCallValue", "unsettledCash" })
public class CurrentBalances {

	@JsonProperty("accruedInterest")
	private int accruedInterest;
	@JsonProperty("cashBalance")
	private int cashBalance;
	@JsonProperty("cashReceipts")
	private int cashReceipts;
	@JsonProperty("longOptionMarketValue")
	private int longOptionMarketValue;
	@JsonProperty("liquidationValue")
	private int liquidationValue;
	@JsonProperty("longMarketValue")
	private int longMarketValue;
	@JsonProperty("moneyMarketFund")
	private int moneyMarketFund;
	@JsonProperty("savings")
	private int savings;
	@JsonProperty("shortMarketValue")
	private int shortMarketValue;
	@JsonProperty("pendingDeposits")
	private int pendingDeposits;
	@JsonProperty("cashAvailableForTrading")
	private int cashAvailableForTrading;
	@JsonProperty("cashAvailableForWithdrawal")
	private int cashAvailableForWithdrawal;
	@JsonProperty("cashCall")
	private int cashCall;
	@JsonProperty("longNonMarginableMarketValue")
	private int longNonMarginableMarketValue;
	@JsonProperty("totalCash")
	private int totalCash;
	@JsonProperty("shortOptionMarketValue")
	private int shortOptionMarketValue;
	@JsonProperty("mutualFundValue")
	private int mutualFundValue;
	@JsonProperty("bondValue")
	private int bondValue;
	@JsonProperty("cashDebitCallValue")
	private int cashDebitCallValue;
	@JsonProperty("unsettledCash")
	private int unsettledCash;
	@JsonIgnore
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();

	/**
	 * No args constructor for use in serialization
	 *
	 */
	public CurrentBalances() {
	}

	/**
	 *
	 * @param mutualFundValue
	 * @param cashReceipts
	 * @param liquidationValue
	 * @param pendingDeposits
	 * @param cashCall
	 * @param shortOptionMarketValue
	 * @param longOptionMarketValue
	 * @param longMarketValue
	 * @param savings
	 * @param cashAvailableForTrading
	 * @param bondValue
	 * @param cashDebitCallValue
	 * @param shortMarketValue
	 * @param cashAvailableForWithdrawal
	 * @param unsettledCash
	 * @param totalCash
	 * @param longNonMarginableMarketValue
	 * @param moneyMarketFund
	 * @param accruedInterest
	 * @param cashBalance
	 */
	public CurrentBalances(int accruedInterest, int cashBalance, int cashReceipts, int longOptionMarketValue,
			int liquidationValue, int longMarketValue, int moneyMarketFund, int savings, int shortMarketValue,
			int pendingDeposits, int cashAvailableForTrading, int cashAvailableForWithdrawal, int cashCall,
			int longNonMarginableMarketValue, int totalCash, int shortOptionMarketValue, int mutualFundValue,
			int bondValue, int cashDebitCallValue, int unsettledCash) {
		super();
		this.accruedInterest = accruedInterest;
		this.cashBalance = cashBalance;
		this.cashReceipts = cashReceipts;
		this.longOptionMarketValue = longOptionMarketValue;
		this.liquidationValue = liquidationValue;
		this.longMarketValue = longMarketValue;
		this.moneyMarketFund = moneyMarketFund;
		this.savings = savings;
		this.shortMarketValue = shortMarketValue;
		this.pendingDeposits = pendingDeposits;
		this.cashAvailableForTrading = cashAvailableForTrading;
		this.cashAvailableForWithdrawal = cashAvailableForWithdrawal;
		this.cashCall = cashCall;
		this.longNonMarginableMarketValue = longNonMarginableMarketValue;
		this.totalCash = totalCash;
		this.shortOptionMarketValue = shortOptionMarketValue;
		this.mutualFundValue = mutualFundValue;
		this.bondValue = bondValue;
		this.cashDebitCallValue = cashDebitCallValue;
		this.unsettledCash = unsettledCash;
	}

	@JsonProperty("accruedInterest")
	public int getAccruedInterest() {
		return accruedInterest;
	}

	@JsonProperty("accruedInterest")
	public void setAccruedInterest(int accruedInterest) {
		this.accruedInterest = accruedInterest;
	}

	@JsonProperty("cashBalance")
	public int getCashBalance() {
		return cashBalance;
	}

	@JsonProperty("cashBalance")
	public void setCashBalance(int cashBalance) {
		this.cashBalance = cashBalance;
	}

	@JsonProperty("cashReceipts")
	public int getCashReceipts() {
		return cashReceipts;
	}

	@JsonProperty("cashReceipts")
	public void setCashReceipts(int cashReceipts) {
		this.cashReceipts = cashReceipts;
	}

	@JsonProperty("longOptionMarketValue")
	public int getLongOptionMarketValue() {
		return longOptionMarketValue;
	}

	@JsonProperty("longOptionMarketValue")
	public void setLongOptionMarketValue(int longOptionMarketValue) {
		this.longOptionMarketValue = longOptionMarketValue;
	}

	@JsonProperty("liquidationValue")
	public int getLiquidationValue() {
		return liquidationValue;
	}

	@JsonProperty("liquidationValue")
	public void setLiquidationValue(int liquidationValue) {
		this.liquidationValue = liquidationValue;
	}

	@JsonProperty("longMarketValue")
	public int getLongMarketValue() {
		return longMarketValue;
	}

	@JsonProperty("longMarketValue")
	public void setLongMarketValue(int longMarketValue) {
		this.longMarketValue = longMarketValue;
	}

	@JsonProperty("moneyMarketFund")
	public int getMoneyMarketFund() {
		return moneyMarketFund;
	}

	@JsonProperty("moneyMarketFund")
	public void setMoneyMarketFund(int moneyMarketFund) {
		this.moneyMarketFund = moneyMarketFund;
	}

	@JsonProperty("savings")
	public int getSavings() {
		return savings;
	}

	@JsonProperty("savings")
	public void setSavings(int savings) {
		this.savings = savings;
	}

	@JsonProperty("shortMarketValue")
	public int getShortMarketValue() {
		return shortMarketValue;
	}

	@JsonProperty("shortMarketValue")
	public void setShortMarketValue(int shortMarketValue) {
		this.shortMarketValue = shortMarketValue;
	}

	@JsonProperty("pendingDeposits")
	public int getPendingDeposits() {
		return pendingDeposits;
	}

	@JsonProperty("pendingDeposits")
	public void setPendingDeposits(int pendingDeposits) {
		this.pendingDeposits = pendingDeposits;
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

	@JsonProperty("cashCall")
	public int getCashCall() {
		return cashCall;
	}

	@JsonProperty("cashCall")
	public void setCashCall(int cashCall) {
		this.cashCall = cashCall;
	}

	@JsonProperty("longNonMarginableMarketValue")
	public int getLongNonMarginableMarketValue() {
		return longNonMarginableMarketValue;
	}

	@JsonProperty("longNonMarginableMarketValue")
	public void setLongNonMarginableMarketValue(int longNonMarginableMarketValue) {
		this.longNonMarginableMarketValue = longNonMarginableMarketValue;
	}

	@JsonProperty("totalCash")
	public int getTotalCash() {
		return totalCash;
	}

	@JsonProperty("totalCash")
	public void setTotalCash(int totalCash) {
		this.totalCash = totalCash;
	}

	@JsonProperty("shortOptionMarketValue")
	public int getShortOptionMarketValue() {
		return shortOptionMarketValue;
	}

	@JsonProperty("shortOptionMarketValue")
	public void setShortOptionMarketValue(int shortOptionMarketValue) {
		this.shortOptionMarketValue = shortOptionMarketValue;
	}

	@JsonProperty("mutualFundValue")
	public int getMutualFundValue() {
		return mutualFundValue;
	}

	@JsonProperty("mutualFundValue")
	public void setMutualFundValue(int mutualFundValue) {
		this.mutualFundValue = mutualFundValue;
	}

	@JsonProperty("bondValue")
	public int getBondValue() {
		return bondValue;
	}

	@JsonProperty("bondValue")
	public void setBondValue(int bondValue) {
		this.bondValue = bondValue;
	}

	@JsonProperty("cashDebitCallValue")
	public int getCashDebitCallValue() {
		return cashDebitCallValue;
	}

	@JsonProperty("cashDebitCallValue")
	public void setCashDebitCallValue(int cashDebitCallValue) {
		this.cashDebitCallValue = cashDebitCallValue;
	}

	@JsonProperty("unsettledCash")
	public int getUnsettledCash() {
		return unsettledCash;
	}

	@JsonProperty("unsettledCash")
	public void setUnsettledCash(int unsettledCash) {
		this.unsettledCash = unsettledCash;
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