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
@JsonPropertyOrder({ "category", "date", "exchange", "isOpen", "marketType", "product", "productName", "sessionHours" })
public class MarketHours {

	@JsonProperty("category")
	private String category;
	@JsonProperty("date")
	private String date;
	@JsonProperty("exchange")
	private String exchange;
	@JsonProperty("isOpen")
	private boolean isOpen;
	@JsonProperty("marketType")
	private String marketType;
	@JsonProperty("product")
	private String product;
	@JsonProperty("productName")
	private String productName;
	@JsonProperty("sessionHours")
	private SessionHours sessionHours;
	@JsonIgnore
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();

	/**
	 * No args constructor for use in serialization
	 *
	 */
	public MarketHours() {
	}

	/**
	 *
	 * @param product
	 * @param category
	 * @param marketType
	 * @param date
	 * @param productName
	 * @param sessionHours
	 * @param exchange
	 * @param isOpen
	 */
	public MarketHours(String category, String date, String exchange, boolean isOpen, String marketType, String product,
			String productName, SessionHours sessionHours) {
		super();
		this.category = category;
		this.date = date;
		this.exchange = exchange;
		this.isOpen = isOpen;
		this.marketType = marketType;
		this.product = product;
		this.productName = productName;
		this.sessionHours = sessionHours;
	}

	@JsonProperty("category")
	public String getCategory() {
		return category;
	}

	@JsonProperty("category")
	public void setCategory(String category) {
		this.category = category;
	}

	@JsonProperty("date")
	public String getDate() {
		return date;
	}

	@JsonProperty("date")
	public void setDate(String date) {
		this.date = date;
	}

	@JsonProperty("exchange")
	public String getExchange() {
		return exchange;
	}

	@JsonProperty("exchange")
	public void setExchange(String exchange) {
		this.exchange = exchange;
	}

	@JsonProperty("isOpen")
	public boolean isIsOpen() {
		return isOpen;
	}

	@JsonProperty("isOpen")
	public void setIsOpen(boolean isOpen) {
		this.isOpen = isOpen;
	}

	@JsonProperty("marketType")
	public String getMarketType() {
		return marketType;
	}

	@JsonProperty("marketType")
	public void setMarketType(String marketType) {
		this.marketType = marketType;
	}

	@JsonProperty("product")
	public String getProduct() {
		return product;
	}

	@JsonProperty("product")
	public void setProduct(String product) {
		this.product = product;
	}

	@JsonProperty("productName")
	public String getProductName() {
		return productName;
	}

	@JsonProperty("productName")
	public void setProductName(String productName) {
		this.productName = productName;
	}

	@JsonProperty("sessionHours")
	public SessionHours getSessionHours() {
		return sessionHours;
	}

	@JsonProperty("sessionHours")
	public void setSessionHours(SessionHours sessionHours) {
		this.sessionHours = sessionHours;
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