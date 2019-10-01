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
@JsonPropertyOrder({ "close", "datetime", "high", "low", "open", "volume" })
public class Candle {

	@JsonProperty("close")
	private double close;
	@JsonProperty("datetime")
	private Long datetime;
	@JsonProperty("high")
	private double high;
	@JsonProperty("low")
	private double low;
	@JsonProperty("open")
	private double open;
	@JsonProperty("volume")
	private double volume;
	@JsonIgnore
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();

	/**
	 * No args constructor for use in serialization
	 *
	 */
	public Candle() {
	}

	/**
	 *
	 * @param open
	 * @param volume
	 * @param high
	 * @param low
	 * @param datetime
	 * @param close
	 */
	public Candle(double close, Long datetime, double high, double low, double open, double volume) {
		super();
		this.close = close;
		this.datetime = datetime;
		this.high = high;
		this.low = low;
		this.open = open;
		this.volume = volume;
	}

	@JsonProperty("close")
	public double getClose() {
		return close;
	}

	@JsonProperty("close")
	public void setClose(double close) {
		this.close = close;
	}

	@JsonProperty("datetime")
	public Long getDatetime() {
		return datetime;
	}

	@JsonProperty("datetime")
	public void setDatetime(Long datetime) {
		this.datetime = datetime;
	}

	@JsonProperty("high")
	public double getHigh() {
		return high;
	}

	@JsonProperty("high")
	public void setHigh(double high) {
		this.high = high;
	}

	@JsonProperty("low")
	public double getLow() {
		return low;
	}

	@JsonProperty("low")
	public void setLow(double low) {
		this.low = low;
	}

	@JsonProperty("open")
	public double getOpen() {
		return open;
	}

	@JsonProperty("open")
	public void setOpen(double open) {
		this.open = open;
	}

	@JsonProperty("volume")
	public double getVolume() {
		return volume;
	}

	@JsonProperty("volume")
	public void setVolume(double volume) {
		this.volume = volume;
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