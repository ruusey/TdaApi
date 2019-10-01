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
@JsonPropertyOrder({ "symbol", "status", "underlying", "strategy", "interval", "isDelayed", "isIndex",
		"daysToExpiration", "interestRate", "underlyingPrice", "volatility", "callExpDateMap", "putExpDateMap" })
public class Option {

	@JsonProperty("symbol")
	private String symbol;
	@JsonProperty("status")
	private String status;
	@JsonProperty("underlying")
	private Underlying underlying;
	@JsonProperty("strategy")
	private String strategy;
	@JsonProperty("interval")
	private long interval;
	@JsonProperty("isDelayed")
	private boolean isDelayed;
	@JsonProperty("isIndex")
	private boolean isIndex;
	@JsonProperty("daysToExpiration")
	private long daysToExpiration;
	@JsonProperty("interestRate")
	private long interestRate;
	@JsonProperty("underlyingPrice")
	private long underlyingPrice;
	@JsonProperty("volatility")
	private long volatility;
	@JsonProperty("callExpDateMap")
	private CallExpDateMap callExpDateMap;
	@JsonProperty("putExpDateMap")
	private PutExpDateMap putExpDateMap;
	@JsonIgnore
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();

	/**
	 * No args constructor for use in serialization
	 *
	 */
	public Option() {
	}

	/**
	 *
	 * @param putExpDateMap
	 * @param callExpDateMap
	 * @param daysToExpiration
	 * @param symbol
	 * @param interval
	 * @param status
	 * @param isIndex
	 * @param strategy
	 * @param interestRate
	 * @param volatility
	 * @param underlyingPrice
	 * @param underlying
	 * @param isDelayed
	 */
	public Option(String symbol, String status, Underlying underlying, String strategy, long interval,
			boolean isDelayed, boolean isIndex, long daysToExpiration, long interestRate, long underlyingPrice,
			long volatility, CallExpDateMap callExpDateMap, PutExpDateMap putExpDateMap) {
		super();
		this.symbol = symbol;
		this.status = status;
		this.underlying = underlying;
		this.strategy = strategy;
		this.interval = interval;
		this.isDelayed = isDelayed;
		this.isIndex = isIndex;
		this.daysToExpiration = daysToExpiration;
		this.interestRate = interestRate;
		this.underlyingPrice = underlyingPrice;
		this.volatility = volatility;
		this.callExpDateMap = callExpDateMap;
		this.putExpDateMap = putExpDateMap;
	}

	@JsonProperty("symbol")
	public String getSymbol() {
		return symbol;
	}

	@JsonProperty("symbol")
	public void setSymbol(String symbol) {
		this.symbol = symbol;
	}

	@JsonProperty("status")
	public String getStatus() {
		return status;
	}

	@JsonProperty("status")
	public void setStatus(String status) {
		this.status = status;
	}

	@JsonProperty("underlying")
	public Underlying getUnderlying() {
		return underlying;
	}

	@JsonProperty("underlying")
	public void setUnderlying(Underlying underlying) {
		this.underlying = underlying;
	}

	@JsonProperty("strategy")
	public String getStrategy() {
		return strategy;
	}

	@JsonProperty("strategy")
	public void setStrategy(String strategy) {
		this.strategy = strategy;
	}

	@JsonProperty("interval")
	public long getInterval() {
		return interval;
	}

	@JsonProperty("interval")
	public void setInterval(long interval) {
		this.interval = interval;
	}

	@JsonProperty("isDelayed")
	public boolean isIsDelayed() {
		return isDelayed;
	}

	@JsonProperty("isDelayed")
	public void setIsDelayed(boolean isDelayed) {
		this.isDelayed = isDelayed;
	}

	@JsonProperty("isIndex")
	public boolean isIsIndex() {
		return isIndex;
	}

	@JsonProperty("isIndex")
	public void setIsIndex(boolean isIndex) {
		this.isIndex = isIndex;
	}

	@JsonProperty("daysToExpiration")
	public long getDaysToExpiration() {
		return daysToExpiration;
	}

	@JsonProperty("daysToExpiration")
	public void setDaysToExpiration(long daysToExpiration) {
		this.daysToExpiration = daysToExpiration;
	}

	@JsonProperty("interestRate")
	public long getInterestRate() {
		return interestRate;
	}

	@JsonProperty("interestRate")
	public void setInterestRate(long interestRate) {
		this.interestRate = interestRate;
	}

	@JsonProperty("underlyingPrice")
	public long getUnderlyingPrice() {
		return underlyingPrice;
	}

	@JsonProperty("underlyingPrice")
	public void setUnderlyingPrice(long underlyingPrice) {
		this.underlyingPrice = underlyingPrice;
	}

	@JsonProperty("volatility")
	public long getVolatility() {
		return volatility;
	}

	@JsonProperty("volatility")
	public void setVolatility(long volatility) {
		this.volatility = volatility;
	}

	@JsonProperty("callExpDateMap")
	public CallExpDateMap getCallExpDateMap() {
		return callExpDateMap;
	}

	@JsonProperty("callExpDateMap")
	public void setCallExpDateMap(CallExpDateMap callExpDateMap) {
		this.callExpDateMap = callExpDateMap;
	}

	@JsonProperty("putExpDateMap")
	public PutExpDateMap getPutExpDateMap() {
		return putExpDateMap;
	}

	@JsonProperty("putExpDateMap")
	public void setPutExpDateMap(PutExpDateMap putExpDateMap) {
		this.putExpDateMap = putExpDateMap;
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