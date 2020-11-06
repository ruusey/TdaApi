
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
@JsonPropertyOrder({ "lastLogin", "userStatus", "socialAccount", "created", "name", "email", "blUserLocale", "updated",
		"objectId", "ownerId", "___class", "user-token" })
public class User {

	@JsonProperty("lastLogin")
	private Long lastLogin;
	@JsonProperty("userStatus")
	private String userStatus;
	@JsonProperty("socialAccount")
	private String socialAccount;
	@JsonProperty("created")
	private Long created;
	@JsonProperty("name")
	private String name;
	@JsonProperty("email")
	private String email;
	@JsonProperty("blUserLocale")
	private String blUserLocale;
	@JsonProperty("updated")
	private Object updated;
	@JsonProperty("objectId")
	private String objectId;
	@JsonProperty("ownerId")
	private String ownerId;
	@JsonProperty("___class")
	private String _class;
	@JsonProperty("user-token")
	private String userToken;
	@JsonIgnore
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();

	/**
	 * No args constructor for use in serialization
	 *
	 */
	public User() {
	}

	/**
	 *
	 * @param lastLogin
	 * @param _class
	 * @param userToken
	 * @param updated
	 * @param email
	 * @param created
	 * @param ownerId
	 * @param objectId
	 * @param blUserLocale
	 * @param name
	 * @param userStatus
	 * @param socialAccount
	 */
	public User(Long lastLogin, String userStatus, String socialAccount, Long created, String name, String email,
			String blUserLocale, Object updated, String objectId, String ownerId, String _class, String userToken) {
		super();
		this.lastLogin = lastLogin;
		this.userStatus = userStatus;
		this.socialAccount = socialAccount;
		this.created = created;
		this.name = name;
		this.email = email;
		this.blUserLocale = blUserLocale;
		this.updated = updated;
		this.objectId = objectId;
		this.ownerId = ownerId;
		this._class = _class;
		this.userToken = userToken;
	}

	@JsonProperty("lastLogin")
	public Long getLastLogin() {
		return lastLogin;
	}

	@JsonProperty("lastLogin")
	public void setLastLogin(Long lastLogin) {
		this.lastLogin = lastLogin;
	}

	@JsonProperty("userStatus")
	public String getUserStatus() {
		return userStatus;
	}

	@JsonProperty("userStatus")
	public void setUserStatus(String userStatus) {
		this.userStatus = userStatus;
	}

	@JsonProperty("socialAccount")
	public String getSocialAccount() {
		return socialAccount;
	}

	@JsonProperty("socialAccount")
	public void setSocialAccount(String socialAccount) {
		this.socialAccount = socialAccount;
	}

	@JsonProperty("created")
	public Long getCreated() {
		return created;
	}

	@JsonProperty("created")
	public void setCreated(Long created) {
		this.created = created;
	}

	@JsonProperty("name")
	public String getName() {
		return name;
	}

	@JsonProperty("name")
	public void setName(String name) {
		this.name = name;
	}

	@JsonProperty("email")
	public String getEmail() {
		return email;
	}

	@JsonProperty("email")
	public void setEmail(String email) {
		this.email = email;
	}

	@JsonProperty("blUserLocale")
	public String getBlUserLocale() {
		return blUserLocale;
	}

	@JsonProperty("blUserLocale")
	public void setBlUserLocale(String blUserLocale) {
		this.blUserLocale = blUserLocale;
	}

	@JsonProperty("updated")
	public Object getUpdated() {
		return updated;
	}

	@JsonProperty("updated")
	public void setUpdated(Object updated) {
		this.updated = updated;
	}

	@JsonProperty("objectId")
	public String getObjectId() {
		return objectId;
	}

	@JsonProperty("objectId")
	public void setObjectId(String objectId) {
		this.objectId = objectId;
	}

	@JsonProperty("ownerId")
	public String getOwnerId() {
		return ownerId;
	}

	@JsonProperty("ownerId")
	public void setOwnerId(String ownerId) {
		this.ownerId = ownerId;
	}

	@JsonProperty("___class")
	public String getClass_() {
		return _class;
	}

	@JsonProperty("___class")
	public void setClass_(String _class) {
		this._class = _class;
	}

	@JsonProperty("user-token")
	public String getUserToken() {
		return userToken;
	}

	@JsonProperty("user-token")
	public void setUserToken(String userToken) {
		this.userToken = userToken;
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