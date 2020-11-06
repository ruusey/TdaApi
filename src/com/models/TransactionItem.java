package com.models;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "accountId", "amount", "price", "cost", "parentOrderKey", "parentChildIndicator", "instruction",
		"positionEffect", "instrument" })
public class TransactionItem {

	@JsonProperty("accountId")
	private int accountId;
	@JsonProperty("amount")
	private int amount;
	@JsonProperty("price")
	private int price;
	@JsonProperty("cost")
	private int cost;
	@JsonProperty("parentOrderKey")
	private int parentOrderKey;
	@JsonProperty("parentChildIndicator")
	private String parentChildIndicator;
	@JsonProperty("instruction")
	private String instruction;
	@JsonProperty("positionEffect")
	private String positionEffect;
	@JsonProperty("instrument")
	private Instrument instrument;

	/**
	 * No args constructor for use in serialization
	 *
	 */
	public TransactionItem() {
	}

	/**
	 *
	 * @param amount
	 * @param price
	 * @param accountId
	 * @param parentChildIndicator
	 * @param instruction
	 * @param instrument
	 * @param positionEffect
	 * @param cost
	 * @param parentOrderKey
	 */
	public TransactionItem(int accountId, int amount, int price, int cost, int parentOrderKey,
			String parentChildIndicator, String instruction, String positionEffect, Instrument instrument) {
		super();
		this.accountId = accountId;
		this.amount = amount;
		this.price = price;
		this.cost = cost;
		this.parentOrderKey = parentOrderKey;
		this.parentChildIndicator = parentChildIndicator;
		this.instruction = instruction;
		this.positionEffect = positionEffect;
		this.instrument = instrument;
	}

	@JsonProperty("accountId")
	public int getAccountId() {
		return accountId;
	}

	@JsonProperty("accountId")
	public void setAccountId(int accountId) {
		this.accountId = accountId;
	}

	@JsonProperty("amount")
	public int getAmount() {
		return amount;
	}

	@JsonProperty("amount")
	public void setAmount(int amount) {
		this.amount = amount;
	}

	@JsonProperty("price")
	public int getPrice() {
		return price;
	}

	@JsonProperty("price")
	public void setPrice(int price) {
		this.price = price;
	}

	@JsonProperty("cost")
	public int getCost() {
		return cost;
	}

	@JsonProperty("cost")
	public void setCost(int cost) {
		this.cost = cost;
	}

	@JsonProperty("parentOrderKey")
	public int getParentOrderKey() {
		return parentOrderKey;
	}

	@JsonProperty("parentOrderKey")
	public void setParentOrderKey(int parentOrderKey) {
		this.parentOrderKey = parentOrderKey;
	}

	@JsonProperty("parentChildIndicator")
	public String getParentChildIndicator() {
		return parentChildIndicator;
	}

	@JsonProperty("parentChildIndicator")
	public void setParentChildIndicator(String parentChildIndicator) {
		this.parentChildIndicator = parentChildIndicator;
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

	@JsonProperty("instrument")
	public Instrument getInstrument() {
		return instrument;
	}

	@JsonProperty("instrument")
	public void setInstrument(Instrument instrument) {
		this.instrument = instrument;
	}

}