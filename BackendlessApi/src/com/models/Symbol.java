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
@JsonPropertyOrder({ "cusip", "symbol", "description", "exchange", "assetType" })
public class Symbol {

	@JsonProperty("cusip")
	private String cusip;
	@JsonProperty("symbol")
	private String symbol;
	@JsonProperty("description")
	private String description;
	@JsonProperty("exchange")
	private String exchange;
	@JsonProperty("assetType")
	private String assetType;
	@JsonIgnore
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();

	/**
	 * No args constructor for use in serialization
	 *
	 */
	public Symbol() {
	}

	/**
	 *
	 * @param symbol
	 * @param assetType
	 * @param description
	 * @param cusip
	 * @param exchange
	 */
	public Symbol(String cusip, String symbol, String description, String exchange, String assetType) {
		super();
		this.cusip = cusip;
		this.symbol = symbol;
		this.description = description;
		this.exchange = exchange;
		this.assetType = assetType;
	}

	@JsonProperty("cusip")
	public String getCusip() {
		return cusip;
	}

	@JsonProperty("cusip")
	public void setCusip(String cusip) {
		this.cusip = cusip;
	}

	@JsonProperty("symbol")
	public String getSymbol() {
		return symbol;
	}

	@JsonProperty("symbol")
	public void setSymbol(String symbol) {
		this.symbol = symbol;
	}

	@JsonProperty("description")
	public String getDescription() {
		return description;
	}

	@JsonProperty("description")
	public void setDescription(String description) {
		this.description = description;
	}

	@JsonProperty("exchange")
	public String getExchange() {
		return exchange;
	}

	@JsonProperty("exchange")
	public void setExchange(String exchange) {
		this.exchange = exchange;
	}

	@JsonProperty("assetType")
	public String getAssetType() {
		return assetType;
	}

	@JsonProperty("assetType")
	public void setAssetType(String assetType) {
		this.assetType = assetType;
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