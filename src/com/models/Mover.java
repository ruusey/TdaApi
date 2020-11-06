package com.models;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "change", "description", "direction", "last", "symbol", "totalVolume" })
public class Mover {

	@JsonProperty("change")
	private double change;
	@JsonProperty("description")
	private String description;
	@JsonProperty("direction")
	private String direction;
	@JsonProperty("last")
	private double last;
	@JsonProperty("symbol")
	private String symbol;
	@JsonProperty("totalVolume")
	private int totalVolume;

	/**
	 * No args constructor for use in serialization
	 *
	 */
	public Mover() {
	}

	/**
	 *
	 * @param totalVolume
	 * @param symbol
	 * @param last
	 * @param direction
	 * @param description
	 * @param change
	 */
	public Mover(double change, String description, String direction, double last, String symbol, int totalVolume) {
		super();
		this.change = change;
		this.description = description;
		this.direction = direction;
		this.last = last;
		this.symbol = symbol;
		this.totalVolume = totalVolume;
	}

	@JsonProperty("change")
	public double getChange() {
		return change;
	}

	@JsonProperty("change")
	public void setChange(double change) {
		this.change = change;
	}

	@JsonProperty("description")
	public String getDescription() {
		return description;
	}

	@JsonProperty("description")
	public void setDescription(String description) {
		this.description = description;
	}

	@JsonProperty("direction")
	public String getDirection() {
		return direction;
	}

	@JsonProperty("direction")
	public void setDirection(String direction) {
		this.direction = direction;
	}

	@JsonProperty("last")
	public double getLast() {
		return last;
	}

	@JsonProperty("last")
	public void setLast(double last) {
		this.last = last;
	}

	@JsonProperty("symbol")
	public String getSymbol() {
		return symbol;
	}

	@JsonProperty("symbol")
	public void setSymbol(String symbol) {
		this.symbol = symbol;
	}

	@JsonProperty("totalVolume")
	public int getTotalVolume() {
		return totalVolume;
	}

	@JsonProperty("totalVolume")
	public void setTotalVolume(int totalVolume) {
		this.totalVolume = totalVolume;
	}

}