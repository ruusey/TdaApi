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
@JsonPropertyOrder({ "shortQuantity", "averagePrice", "currentDayProfitLoss", "currentDayProfitLossPercentage",
		"longQuantity", "settledLongQuantity", "settledShortQuantity", "agedQuantity", "instrument", "marketValue" })
public class Position {

	@JsonProperty("shortQuantity")
	private int shortQuantity;
	@JsonProperty("averagePrice")
	private int averagePrice;
	@JsonProperty("currentDayProfitLoss")
	private int currentDayProfitLoss;
	@JsonProperty("currentDayProfitLossPercentage")
	private int currentDayProfitLossPercentage;
	@JsonProperty("longQuantity")
	private int longQuantity;
	@JsonProperty("settledLongQuantity")
	private int settledLongQuantity;
	@JsonProperty("settledShortQuantity")
	private int settledShortQuantity;
	@JsonProperty("agedQuantity")
	private int agedQuantity;
	@JsonProperty("instrument")
	private String instrument;
	@JsonProperty("marketValue")
	private int marketValue;
	@JsonIgnore
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();

	/**
	 * No args constructor for use in serialization
	 *
	 */
	public Position() {
	}

	/**
	 *
	 * @param averagePrice
	 * @param agedQuantity
	 * @param currentDayProfitLossPercentage
	 * @param shortQuantity
	 * @param marketValue
	 * @param longQuantity
	 * @param instrument
	 * @param settledLongQuantity
	 * @param settledShortQuantity
	 * @param currentDayProfitLoss
	 */
	public Position(int shortQuantity, int averagePrice, int currentDayProfitLoss, int currentDayProfitLossPercentage,
			int longQuantity, int settledLongQuantity, int settledShortQuantity, int agedQuantity, String instrument,
			int marketValue) {
		super();
		this.shortQuantity = shortQuantity;
		this.averagePrice = averagePrice;
		this.currentDayProfitLoss = currentDayProfitLoss;
		this.currentDayProfitLossPercentage = currentDayProfitLossPercentage;
		this.longQuantity = longQuantity;
		this.settledLongQuantity = settledLongQuantity;
		this.settledShortQuantity = settledShortQuantity;
		this.agedQuantity = agedQuantity;
		this.instrument = instrument;
		this.marketValue = marketValue;
	}

	@JsonProperty("shortQuantity")
	public int getShortQuantity() {
		return shortQuantity;
	}

	@JsonProperty("shortQuantity")
	public void setShortQuantity(int shortQuantity) {
		this.shortQuantity = shortQuantity;
	}

	@JsonProperty("averagePrice")
	public int getAveragePrice() {
		return averagePrice;
	}

	@JsonProperty("averagePrice")
	public void setAveragePrice(int averagePrice) {
		this.averagePrice = averagePrice;
	}

	@JsonProperty("currentDayProfitLoss")
	public int getCurrentDayProfitLoss() {
		return currentDayProfitLoss;
	}

	@JsonProperty("currentDayProfitLoss")
	public void setCurrentDayProfitLoss(int currentDayProfitLoss) {
		this.currentDayProfitLoss = currentDayProfitLoss;
	}

	@JsonProperty("currentDayProfitLossPercentage")
	public int getCurrentDayProfitLossPercentage() {
		return currentDayProfitLossPercentage;
	}

	@JsonProperty("currentDayProfitLossPercentage")
	public void setCurrentDayProfitLossPercentage(int currentDayProfitLossPercentage) {
		this.currentDayProfitLossPercentage = currentDayProfitLossPercentage;
	}

	@JsonProperty("longQuantity")
	public int getLongQuantity() {
		return longQuantity;
	}

	@JsonProperty("longQuantity")
	public void setLongQuantity(int longQuantity) {
		this.longQuantity = longQuantity;
	}

	@JsonProperty("settledLongQuantity")
	public int getSettledLongQuantity() {
		return settledLongQuantity;
	}

	@JsonProperty("settledLongQuantity")
	public void setSettledLongQuantity(int settledLongQuantity) {
		this.settledLongQuantity = settledLongQuantity;
	}

	@JsonProperty("settledShortQuantity")
	public int getSettledShortQuantity() {
		return settledShortQuantity;
	}

	@JsonProperty("settledShortQuantity")
	public void setSettledShortQuantity(int settledShortQuantity) {
		this.settledShortQuantity = settledShortQuantity;
	}

	@JsonProperty("agedQuantity")
	public int getAgedQuantity() {
		return agedQuantity;
	}

	@JsonProperty("agedQuantity")
	public void setAgedQuantity(int agedQuantity) {
		this.agedQuantity = agedQuantity;
	}

	@JsonProperty("instrument")
	public String getInstrument() {
		return instrument;
	}

	@JsonProperty("instrument")
	public void setInstrument(String instrument) {
		this.instrument = instrument;
	}

	@JsonProperty("marketValue")
	public int getMarketValue() {
		return marketValue;
	}

	@JsonProperty("marketValue")
	public void setMarketValue(int marketValue) {
		this.marketValue = marketValue;
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