package com.models;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "candles", "empty", "symbol" })
public class PriceHistory {

	@JsonProperty("candles")
	private List<Candle> candles = null;
	@JsonProperty("empty")
	private boolean empty;
	@JsonProperty("symbol")
	private String symbol;
	@JsonIgnore
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();

	/**
	 * No args constructor for use in serialization
	 *
	 */
	public PriceHistory() {
	}

	/**
	 *
	 * @param symbol
	 * @param candles
	 * @param empty
	 */
	public PriceHistory(List<Candle> candles, boolean empty, String symbol) {
		super();
		this.candles = candles;
		this.empty = empty;
		this.symbol = symbol;
	}

	@JsonProperty("candles")
	public List<Candle> getCandles() {
		return candles;
	}

	@JsonProperty("candles")
	public void setCandles(List<Candle> candles) {
		this.candles = candles;
	}

	@JsonProperty("empty")
	public boolean isEmpty() {
		return empty;
	}

	@JsonProperty("empty")
	public void setEmpty(boolean empty) {
		this.empty = empty;
	}

	@JsonProperty("symbol")
	public String getSymbol() {
		return symbol;
	}

	@JsonProperty("symbol")
	public void setSymbol(String symbol) {
		this.symbol = symbol;
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