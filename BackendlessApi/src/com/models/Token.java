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
@JsonPropertyOrder({
"access_token",
"refresh_token",
"expires_in",
"refresh_token_expires_in",
"token_type"
})
public class Token {

@JsonProperty("access_token")
private String accessToken;
@JsonProperty("refresh_token")
private String refreshToken;
@JsonProperty("expires_in")
private int expiresIn;
@JsonProperty("refresh_token_expires_in")
private int refreshTokenExpiresIn;
@JsonProperty("token_type")
private String tokenType;
@JsonIgnore
private Map<String, Object> additionalProperties = new HashMap<String, Object>();

/**
* No args constructor for use in serialization
*
*/
public Token() {
}

/**
*
* @param tokenType
* @param accessToken
* @param expiresIn
* @param refreshToken
* @param refreshTokenExpiresIn
*/
public Token(String accessToken, String refreshToken, int expiresIn, int refreshTokenExpiresIn, String tokenType) {
super();
this.accessToken = accessToken;
this.refreshToken = refreshToken;
this.expiresIn = expiresIn;
this.refreshTokenExpiresIn = refreshTokenExpiresIn;
this.tokenType = tokenType;
}

@JsonProperty("access_token")
public String getAccessToken() {
return accessToken;
}

@JsonProperty("access_token")
public void setAccessToken(String accessToken) {
this.accessToken = accessToken;
}

@JsonProperty("refresh_token")
public String getRefreshToken() {
return refreshToken;
}

@JsonProperty("refresh_token")
public void setRefreshToken(String refreshToken) {
this.refreshToken = refreshToken;
}

@JsonProperty("expires_in")
public int getExpiresIn() {
return expiresIn;
}

@JsonProperty("expires_in")
public void setExpiresIn(int expiresIn) {
this.expiresIn = expiresIn;
}

@JsonProperty("refresh_token_expires_in")
public int getRefreshTokenExpiresIn() {
return refreshTokenExpiresIn;
}

@JsonProperty("refresh_token_expires_in")
public void setRefreshTokenExpiresIn(int refreshTokenExpiresIn) {
this.refreshTokenExpiresIn = refreshTokenExpiresIn;
}

@JsonProperty("token_type")
public String getTokenType() {
return tokenType;
}

@JsonProperty("token_type")
public void setTokenType(String tokenType) {
this.tokenType = tokenType;
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