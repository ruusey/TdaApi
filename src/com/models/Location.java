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
@JsonPropertyOrder({ "objectId", "categories", "metadata", "latitude", "longitude" })
public class Location {

	@JsonProperty("objectId")
	private String objectId;
	@JsonProperty("categories")
	private List<String> categories = null;
	@JsonProperty("metadata")
	private Metadata metadata;
	@JsonProperty("latitude")
	private double latitude;
	@JsonProperty("longitude")
	private double longitude;
	@JsonIgnore
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();

	/**
	 * No args constructor for use in serialization
	 *
	 */
	public Location() {
	}

	/**
	 *
	 * @param objectId
	 * @param longitude
	 * @param categories
	 * @param latitude
	 * @param metadata
	 */
	public Location(String objectId, List<String> categories, Metadata metadata, double latitude, double longitude) {
		super();
		this.objectId = objectId;
		this.categories = categories;
		this.metadata = metadata;
		this.latitude = latitude;
		this.longitude = longitude;
	}

	@JsonProperty("objectId")
	public String getObjectId() {
		return objectId;
	}

	@JsonProperty("objectId")
	public void setObjectId(String objectId) {
		this.objectId = objectId;
	}

	@JsonProperty("categories")
	public List<String> getCategories() {
		return categories;
	}

	@JsonProperty("categories")
	public void setCategories(List<String> categories) {
		this.categories = categories;
	}

	@JsonProperty("metadata")
	public Metadata getMetadata() {
		return metadata;
	}

	@JsonProperty("metadata")
	public void setMetadata(Metadata metadata) {
		this.metadata = metadata;
	}

	@JsonProperty("latitude")
	public double getLatitude() {
		return latitude;
	}

	@JsonProperty("latitude")
	public void setLatitude(double latitude) {
		this.latitude = latitude;
	}

	@JsonProperty("longitude")
	public double getLongitude() {
		return longitude;
	}

	@JsonProperty("longitude")
	public void setLongitude(double longitude) {
		this.longitude = longitude;
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
