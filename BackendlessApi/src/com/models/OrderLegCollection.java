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
@JsonPropertyOrder({ "orderLegType", "legId", "instrument", "instruction", "positionEffect", "quantity",
		"quantityType" })
public class OrderLegCollection {

	@JsonProperty("orderLegType")
	private String orderLegType;
	@JsonProperty("legId")
	private int legId;
	@JsonProperty("instrument")
	private String instrument;
	@JsonProperty("instruction")
	private String instruction;
	@JsonProperty("positionEffect")
	private String positionEffect;
	@JsonProperty("quantity")
	private int quantity;
	@JsonProperty("quantityType")
	private String quantityType;
	@JsonIgnore
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();

	/**
	 * No args constructor for use in serialization
	 *
	 */
	public OrderLegCollection() {
	}

	/**
	 *
	 * @param orderLegType
	 * @param quantity
	 * @param instruction
	 * @param quantityType
	 * @param instrument
	 * @param positionEffect
	 * @param legId
	 */
	public OrderLegCollection(String orderLegType, int legId, String instrument, String instruction,
			String positionEffect, int quantity, String quantityType) {
		super();
		this.orderLegType = orderLegType;
		this.legId = legId;
		this.instrument = instrument;
		this.instruction = instruction;
		this.positionEffect = positionEffect;
		this.quantity = quantity;
		this.quantityType = quantityType;
	}

	@JsonProperty("orderLegType")
	public String getOrderLegType() {
		return orderLegType;
	}

	@JsonProperty("orderLegType")
	public void setOrderLegType(String orderLegType) {
		this.orderLegType = orderLegType;
	}

	@JsonProperty("legId")
	public int getLegId() {
		return legId;
	}

	@JsonProperty("legId")
	public void setLegId(int legId) {
		this.legId = legId;
	}

	@JsonProperty("instrument")
	public String getInstrument() {
		return instrument;
	}

	@JsonProperty("instrument")
	public void setInstrument(String instrument) {
		this.instrument = instrument;
	}

	@JsonProperty("instruction")
	public String getInstruction() {
		return instruction;
	}

	@JsonProperty("instruction")
	public void setInstruction(String instruction) {
		this.instruction = instruction;
	}

	@JsonProperty("positionEffect")
	public String getPositionEffect() {
		return positionEffect;
	}

	@JsonProperty("positionEffect")
	public void setPositionEffect(String positionEffect) {
		this.positionEffect = positionEffect;
	}

	@JsonProperty("quantity")
	public int getQuantity() {
		return quantity;
	}

	@JsonProperty("quantity")
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	@JsonProperty("quantityType")
	public String getQuantityType() {
		return quantityType;
	}

	@JsonProperty("quantityType")
	public void setQuantityType(String quantityType) {
		this.quantityType = quantityType;
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