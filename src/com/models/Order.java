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
@JsonPropertyOrder({ "session", "duration", "orderType", "cancelTime", "complexOrderStrategyType", "quantity",
		"filledQuantity", "remainingQuantity", "requestedDestination", "destinationLinkName", "releaseTime",
		"stopPrice", "stopPriceLinkBasis", "stopPriceLinkType", "stopPriceOffset", "stopType", "priceLinkBasis",
		"priceLinkType", "price", "taxLotMethod", "orderLegCollection", "activationPrice", "specialInstruction",
		"orderStrategyType", "orderId", "cancelable", "editable", "status", "enteredTime", "closeTime", "tag",
		"accountId", "orderActivityCollection", "replacingOrderCollection", "childOrderStrategies",
		"statusDescription" })
public class Order {

	@JsonProperty("session")
	private String session;
	@JsonProperty("duration")
	private String duration;
	@JsonProperty("orderType")
	private String orderType;
	@JsonProperty("cancelTime")
	private CancelTime cancelTime;
	@JsonProperty("complexOrderStrategyType")
	private String complexOrderStrategyType;
	@JsonProperty("quantity")
	private int quantity;
	@JsonProperty("filledQuantity")
	private int filledQuantity;
	@JsonProperty("remainingQuantity")
	private int remainingQuantity;
	@JsonProperty("requestedDestination")
	private String requestedDestination;
	@JsonProperty("destinationLinkName")
	private String destinationLinkName;
	@JsonProperty("releaseTime")
	private String releaseTime;
	@JsonProperty("stopPrice")
	private int stopPrice;
	@JsonProperty("stopPriceLinkBasis")
	private String stopPriceLinkBasis;
	@JsonProperty("stopPriceLinkType")
	private String stopPriceLinkType;
	@JsonProperty("stopPriceOffset")
	private int stopPriceOffset;
	@JsonProperty("stopType")
	private String stopType;
	@JsonProperty("priceLinkBasis")
	private String priceLinkBasis;
	@JsonProperty("priceLinkType")
	private String priceLinkType;
	@JsonProperty("price")
	private int price;
	@JsonProperty("taxLotMethod")
	private String taxLotMethod;
	@JsonProperty("orderLegCollection")
	private List<OrderLegCollection> orderLegCollection = null;
	@JsonProperty("activationPrice")
	private int activationPrice;
	@JsonProperty("specialInstruction")
	private String specialInstruction;
	@JsonProperty("orderStrategyType")
	private String orderStrategyType;
	@JsonProperty("orderId")
	private int orderId;
	@JsonProperty("cancelable")
	private boolean cancelable;
	@JsonProperty("editable")
	private boolean editable;
	@JsonProperty("status")
	private String status;
	@JsonProperty("enteredTime")
	private String enteredTime;
	@JsonProperty("closeTime")
	private String closeTime;
	@JsonProperty("tag")
	private String tag;
	@JsonProperty("accountId")
	private int accountId;
	@JsonProperty("orderActivityCollection")
	private List<String> orderActivityCollection = null;
	@JsonProperty("replacingOrderCollection")
	private List<ReplacingOrderCollection> replacingOrderCollection = null;
	@JsonProperty("childOrderStrategies")
	private List<ChildOrderStrategy> childOrderStrategies = null;
	@JsonProperty("statusDescription")
	private String statusDescription;
	@JsonIgnore
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();

	/**
	 * No args constructor for use in serialization
	 *
	 */
	public Order() {
	}

	/**
	 *
	 * @param accountId
	 * @param stopPriceLinkBasis
	 * @param tag
	 * @param activationPrice
	 * @param destinationLinkName
	 * @param filledQuantity
	 * @param taxLotMethod
	 * @param stopType
	 * @param childOrderStrategies
	 * @param cancelable
	 * @param remainingQuantity
	 * @param quantity
	 * @param enteredTime
	 * @param complexOrderStrategyType
	 * @param orderLegCollection
	 * @param orderId
	 * @param priceLinkBasis
	 * @param specialInstruction
	 * @param cancelTime
	 * @param status
	 * @param orderType
	 * @param orderStrategyType
	 * @param stopPriceOffset
	 * @param orderActivityCollection
	 * @param editable
	 * @param statusDescription
	 * @param priceLinkType
	 * @param closeTime
	 * @param duration
	 * @param price
	 * @param stopPrice
	 * @param session
	 * @param requestedDestination
	 * @param releaseTime
	 * @param stopPriceLinkType
	 * @param replacingOrderCollection
	 */
	public Order(String session, String duration, String orderType, CancelTime cancelTime,
			String complexOrderStrategyType, int quantity, int filledQuantity, int remainingQuantity,
			String requestedDestination, String destinationLinkName, String releaseTime, int stopPrice,
			String stopPriceLinkBasis, String stopPriceLinkType, int stopPriceOffset, String stopType,
			String priceLinkBasis, String priceLinkType, int price, String taxLotMethod,
			List<OrderLegCollection> orderLegCollection, int activationPrice, String specialInstruction,
			String orderStrategyType, int orderId, boolean cancelable, boolean editable, String status,
			String enteredTime, String closeTime, String tag, int accountId, List<String> orderActivityCollection,
			List<ReplacingOrderCollection> replacingOrderCollection, List<ChildOrderStrategy> childOrderStrategies,
			String statusDescription) {
		super();
		this.session = session;
		this.duration = duration;
		this.orderType = orderType;
		this.cancelTime = cancelTime;
		this.complexOrderStrategyType = complexOrderStrategyType;
		this.quantity = quantity;
		this.filledQuantity = filledQuantity;
		this.remainingQuantity = remainingQuantity;
		this.requestedDestination = requestedDestination;
		this.destinationLinkName = destinationLinkName;
		this.releaseTime = releaseTime;
		this.stopPrice = stopPrice;
		this.stopPriceLinkBasis = stopPriceLinkBasis;
		this.stopPriceLinkType = stopPriceLinkType;
		this.stopPriceOffset = stopPriceOffset;
		this.stopType = stopType;
		this.priceLinkBasis = priceLinkBasis;
		this.priceLinkType = priceLinkType;
		this.price = price;
		this.taxLotMethod = taxLotMethod;
		this.orderLegCollection = orderLegCollection;
		this.activationPrice = activationPrice;
		this.specialInstruction = specialInstruction;
		this.orderStrategyType = orderStrategyType;
		this.orderId = orderId;
		this.cancelable = cancelable;
		this.editable = editable;
		this.status = status;
		this.enteredTime = enteredTime;
		this.closeTime = closeTime;
		this.tag = tag;
		this.accountId = accountId;
		this.orderActivityCollection = orderActivityCollection;
		this.replacingOrderCollection = replacingOrderCollection;
		this.childOrderStrategies = childOrderStrategies;
		this.statusDescription = statusDescription;
	}

	@JsonProperty("session")
	public String getSession() {
		return session;
	}

	@JsonProperty("session")
	public void setSession(String session) {
		this.session = session;
	}

	@JsonProperty("duration")
	public String getDuration() {
		return duration;
	}

	@JsonProperty("duration")
	public void setDuration(String duration) {
		this.duration = duration;
	}

	@JsonProperty("orderType")
	public String getOrderType() {
		return orderType;
	}

	@JsonProperty("orderType")
	public void setOrderType(String orderType) {
		this.orderType = orderType;
	}

	@JsonProperty("cancelTime")
	public CancelTime getCancelTime() {
		return cancelTime;
	}

	@JsonProperty("cancelTime")
	public void setCancelTime(CancelTime cancelTime) {
		this.cancelTime = cancelTime;
	}

	@JsonProperty("complexOrderStrategyType")
	public String getComplexOrderStrategyType() {
		return complexOrderStrategyType;
	}

	@JsonProperty("complexOrderStrategyType")
	public void setComplexOrderStrategyType(String complexOrderStrategyType) {
		this.complexOrderStrategyType = complexOrderStrategyType;
	}

	@JsonProperty("quantity")
	public int getQuantity() {
		return quantity;
	}

	@JsonProperty("quantity")
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	@JsonProperty("filledQuantity")
	public int getFilledQuantity() {
		return filledQuantity;
	}

	@JsonProperty("filledQuantity")
	public void setFilledQuantity(int filledQuantity) {
		this.filledQuantity = filledQuantity;
	}

	@JsonProperty("remainingQuantity")
	public int getRemainingQuantity() {
		return remainingQuantity;
	}

	@JsonProperty("remainingQuantity")
	public void setRemainingQuantity(int remainingQuantity) {
		this.remainingQuantity = remainingQuantity;
	}

	@JsonProperty("requestedDestination")
	public String getRequestedDestination() {
		return requestedDestination;
	}

	@JsonProperty("requestedDestination")
	public void setRequestedDestination(String requestedDestination) {
		this.requestedDestination = requestedDestination;
	}

	@JsonProperty("destinationLinkName")
	public String getDestinationLinkName() {
		return destinationLinkName;
	}

	@JsonProperty("destinationLinkName")
	public void setDestinationLinkName(String destinationLinkName) {
		this.destinationLinkName = destinationLinkName;
	}

	@JsonProperty("releaseTime")
	public String getReleaseTime() {
		return releaseTime;
	}

	@JsonProperty("releaseTime")
	public void setReleaseTime(String releaseTime) {
		this.releaseTime = releaseTime;
	}

	@JsonProperty("stopPrice")
	public int getStopPrice() {
		return stopPrice;
	}

	@JsonProperty("stopPrice")
	public void setStopPrice(int stopPrice) {
		this.stopPrice = stopPrice;
	}

	@JsonProperty("stopPriceLinkBasis")
	public String getStopPriceLinkBasis() {
		return stopPriceLinkBasis;
	}

	@JsonProperty("stopPriceLinkBasis")
	public void setStopPriceLinkBasis(String stopPriceLinkBasis) {
		this.stopPriceLinkBasis = stopPriceLinkBasis;
	}

	@JsonProperty("stopPriceLinkType")
	public String getStopPriceLinkType() {
		return stopPriceLinkType;
	}

	@JsonProperty("stopPriceLinkType")
	public void setStopPriceLinkType(String stopPriceLinkType) {
		this.stopPriceLinkType = stopPriceLinkType;
	}

	@JsonProperty("stopPriceOffset")
	public int getStopPriceOffset() {
		return stopPriceOffset;
	}

	@JsonProperty("stopPriceOffset")
	public void setStopPriceOffset(int stopPriceOffset) {
		this.stopPriceOffset = stopPriceOffset;
	}

	@JsonProperty("stopType")
	public String getStopType() {
		return stopType;
	}

	@JsonProperty("stopType")
	public void setStopType(String stopType) {
		this.stopType = stopType;
	}

	@JsonProperty("priceLinkBasis")
	public String getPriceLinkBasis() {
		return priceLinkBasis;
	}

	@JsonProperty("priceLinkBasis")
	public void setPriceLinkBasis(String priceLinkBasis) {
		this.priceLinkBasis = priceLinkBasis;
	}

	@JsonProperty("priceLinkType")
	public String getPriceLinkType() {
		return priceLinkType;
	}

	@JsonProperty("priceLinkType")
	public void setPriceLinkType(String priceLinkType) {
		this.priceLinkType = priceLinkType;
	}

	@JsonProperty("price")
	public int getPrice() {
		return price;
	}

	@JsonProperty("price")
	public void setPrice(int price) {
		this.price = price;
	}

	@JsonProperty("taxLotMethod")
	public String getTaxLotMethod() {
		return taxLotMethod;
	}

	@JsonProperty("taxLotMethod")
	public void setTaxLotMethod(String taxLotMethod) {
		this.taxLotMethod = taxLotMethod;
	}

	@JsonProperty("orderLegCollection")
	public List<OrderLegCollection> getOrderLegCollection() {
		return orderLegCollection;
	}

	@JsonProperty("orderLegCollection")
	public void setOrderLegCollection(List<OrderLegCollection> orderLegCollection) {
		this.orderLegCollection = orderLegCollection;
	}

	@JsonProperty("activationPrice")
	public int getActivationPrice() {
		return activationPrice;
	}

	@JsonProperty("activationPrice")
	public void setActivationPrice(int activationPrice) {
		this.activationPrice = activationPrice;
	}

	@JsonProperty("specialInstruction")
	public String getSpecialInstruction() {
		return specialInstruction;
	}

	@JsonProperty("specialInstruction")
	public void setSpecialInstruction(String specialInstruction) {
		this.specialInstruction = specialInstruction;
	}

	@JsonProperty("orderStrategyType")
	public String getOrderStrategyType() {
		return orderStrategyType;
	}

	@JsonProperty("orderStrategyType")
	public void setOrderStrategyType(String orderStrategyType) {
		this.orderStrategyType = orderStrategyType;
	}

	@JsonProperty("orderId")
	public int getOrderId() {
		return orderId;
	}

	@JsonProperty("orderId")
	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}

	@JsonProperty("cancelable")
	public boolean isCancelable() {
		return cancelable;
	}

	@JsonProperty("cancelable")
	public void setCancelable(boolean cancelable) {
		this.cancelable = cancelable;
	}

	@JsonProperty("editable")
	public boolean isEditable() {
		return editable;
	}

	@JsonProperty("editable")
	public void setEditable(boolean editable) {
		this.editable = editable;
	}

	@JsonProperty("status")
	public String getStatus() {
		return status;
	}

	@JsonProperty("status")
	public void setStatus(String status) {
		this.status = status;
	}

	@JsonProperty("enteredTime")
	public String getEnteredTime() {
		return enteredTime;
	}

	@JsonProperty("enteredTime")
	public void setEnteredTime(String enteredTime) {
		this.enteredTime = enteredTime;
	}

	@JsonProperty("closeTime")
	public String getCloseTime() {
		return closeTime;
	}

	@JsonProperty("closeTime")
	public void setCloseTime(String closeTime) {
		this.closeTime = closeTime;
	}

	@JsonProperty("tag")
	public String getTag() {
		return tag;
	}

	@JsonProperty("tag")
	public void setTag(String tag) {
		this.tag = tag;
	}

	@JsonProperty("accountId")
	public int getAccountId() {
		return accountId;
	}

	@JsonProperty("accountId")
	public void setAccountId(int accountId) {
		this.accountId = accountId;
	}

	@JsonProperty("orderActivityCollection")
	public List<String> getOrderActivityCollection() {
		return orderActivityCollection;
	}

	@JsonProperty("orderActivityCollection")
	public void setOrderActivityCollection(List<String> orderActivityCollection) {
		this.orderActivityCollection = orderActivityCollection;
	}

	@JsonProperty("replacingOrderCollection")
	public List<ReplacingOrderCollection> getReplacingOrderCollection() {
		return replacingOrderCollection;
	}

	@JsonProperty("replacingOrderCollection")
	public void setReplacingOrderCollection(List<ReplacingOrderCollection> replacingOrderCollection) {
		this.replacingOrderCollection = replacingOrderCollection;
	}

	@JsonProperty("childOrderStrategies")
	public List<ChildOrderStrategy> getChildOrderStrategies() {
		return childOrderStrategies;
	}

	@JsonProperty("childOrderStrategies")
	public void setChildOrderStrategies(List<ChildOrderStrategy> childOrderStrategies) {
		this.childOrderStrategies = childOrderStrategies;
	}

	@JsonProperty("statusDescription")
	public String getStatusDescription() {
		return statusDescription;
	}

	@JsonProperty("statusDescription")
	public void setStatusDescription(String statusDescription) {
		this.statusDescription = statusDescription;
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