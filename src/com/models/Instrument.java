package com.models;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "symbol", "underlyingSymbol", "optionExpirationDate", "optionStrikePrice", "putCall", "cusip",
		"description", "assetType", "bondMaturityDate", "bondInterestRate" })
public class Instrument {

	@JsonProperty("symbol")
	private String symbol;
	@JsonProperty("underlyingSymbol")
	private String underlyingSymbol;
	@JsonProperty("optionExpirationDate")
	private String optionExpirationDate;
	@JsonProperty("optionStrikePrice")
	private int optionStrikePrice;
	@JsonProperty("putCall")
	private String putCall;
	@JsonProperty("cusip")
	private String cusip;
	@JsonProperty("description")
	private String description;
	@JsonProperty("assetType")
	private String assetType;
	@JsonProperty("bondMaturityDate")
	private String bondMaturityDate;
	@JsonProperty("bondInterestRate")
	private int bondInterestRate;

	/**
	 * No args constructor for use in serialization
	 *
	 */
	public Instrument() {
	}

	/**
	 *
	 * @param bondInterestRate
	 * @param bondMaturityDate
	 * @param underlyingSymbol
	 * @param optionStrikePrice
	 * @param symbol
	 * @param assetType
	 * @param description
	 * @param cusip
	 * @param putCall
	 * @param optionExpirationDate
	 */
	public Instrument(String symbol, String underlyingSymbol, String optionExpirationDate, int optionStrikePrice,
			String putCall, String cusip, String description, String assetType, String bondMaturityDate,
			int bondInterestRate) {
		super();
		this.symbol = symbol;
		this.underlyingSymbol = underlyingSymbol;
		this.optionExpirationDate = optionExpirationDate;
		this.optionStrikePrice = optionStrikePrice;
		this.putCall = putCall;
		this.cusip = cusip;
		this.description = description;
		this.assetType = assetType;
		this.bondMaturityDate = bondMaturityDate;
		this.bondInterestRate = bondInterestRate;
	}

	@JsonProperty("symbol")
	public String getSymbol() {
		return symbol;
	}

	@JsonProperty("symbol")
	public void setSymbol(String symbol) {
		this.symbol = symbol;
	}

	@JsonProperty("underlyingSymbol")
	public String getUnderlyingSymbol() {
		return underlyingSymbol;
	}

	@JsonProperty("underlyingSymbol")
	public void setUnderlyingSymbol(String underlyingSymbol) {
		this.underlyingSymbol = underlyingSymbol;
	}

	@JsonProperty("optionExpirationDate")
	public String getOptionExpirationDate() {
		return optionExpirationDate;
	}

	@JsonProperty("optionExpirationDate")
	public void setOptionExpirationDate(String optionExpirationDate) {
		this.optionExpirationDate = optionExpirationDate;
	}

	@JsonProperty("optionStrikePrice")
	public int getOptionStrikePrice() {
		return optionStrikePrice;
	}

	@JsonProperty("optionStrikePrice")
	public void setOptionStrikePrice(int optionStrikePrice) {
		this.optionStrikePrice = optionStrikePrice;
	}

	@JsonProperty("putCall")
	public String getPutCall() {
		return putCall;
	}

	@JsonProperty("putCall")
	public void setPutCall(String putCall) {
		this.putCall = putCall;
	}

	@JsonProperty("cusip")
	public String getCusip() {
		return cusip;
	}

	@JsonProperty("cusip")
	public void setCusip(String cusip) {
		this.cusip = cusip;
	}

	@JsonProperty("description")
	public String getDescription() {
		return description;
	}

	@JsonProperty("description")
	public void setDescription(String description) {
		this.description = description;
	}

	@JsonProperty("assetType")
	public String getAssetType() {
		return assetType;
	}

	@JsonProperty("assetType")
	public void setAssetType(String assetType) {
		this.assetType = assetType;
	}

	@JsonProperty("bondMaturityDate")
	public String getBondMaturityDate() {
		return bondMaturityDate;
	}

	@JsonProperty("bondMaturityDate")
	public void setBondMaturityDate(String bondMaturityDate) {
		this.bondMaturityDate = bondMaturityDate;
	}

	@JsonProperty("bondInterestRate")
	public int getBondInterestRate() {
		return bondInterestRate;
	}

	@JsonProperty("bondInterestRate")
	public void setBondInterestRate(int bondInterestRate) {
		this.bondInterestRate = bondInterestRate;
	}

}