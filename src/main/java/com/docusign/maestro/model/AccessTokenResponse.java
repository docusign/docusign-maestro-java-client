package com.docusign.maestro.model;

import java.util.Objects;
import java.util.Arrays;
import com.docusign.maestro.model.AccessTokenTokenTypes;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import java.math.BigDecimal;
import java.io.Serializable;

/**
 * Access Token response details.
 *
 */
@Schema(description = "Access Token response details")

public class AccessTokenResponse implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("access_token")
  private String accessToken = null;

  @JsonProperty("expires_in")
  private BigDecimal expiresIn = null;

  @JsonProperty("token_type")
  private AccessTokenTokenTypes tokenType = null;


  /**
   * accessToken.
   *
   * @return AccessTokenResponse
   **/
  public AccessTokenResponse accessToken(String accessToken) {
    this.accessToken = accessToken;
    return this;
  }

  /**
   * JWT access token.
   * @return accessToken
   **/
  @Schema(description = "JWT access token")
  public String getAccessToken() {
    return accessToken;
  }

  /**
   * setAccessToken.
   **/
  public void setAccessToken(String accessToken) {
    this.accessToken = accessToken;
  }


  /**
   * expiresIn.
   *
   * @return AccessTokenResponse
   **/
  public AccessTokenResponse expiresIn(BigDecimal expiresIn) {
    this.expiresIn = expiresIn;
    return this;
  }

  /**
   * Expires in seconds.
   * @return expiresIn
   **/
  @Schema(description = "Expires in seconds")
  public BigDecimal getExpiresIn() {
    return expiresIn;
  }

  /**
   * setExpiresIn.
   **/
  public void setExpiresIn(BigDecimal expiresIn) {
    this.expiresIn = expiresIn;
  }


  /**
   * tokenType.
   *
   * @return AccessTokenResponse
   **/
  public AccessTokenResponse tokenType(AccessTokenTokenTypes tokenType) {
    this.tokenType = tokenType;
    return this;
  }

  /**
   * Get tokenType.
   * @return tokenType
   **/
  @Schema(description = "")
  public AccessTokenTokenTypes getTokenType() {
    return tokenType;
  }

  /**
   * setTokenType.
   **/
  public void setTokenType(AccessTokenTokenTypes tokenType) {
    this.tokenType = tokenType;
  }


  /**
   * Compares objects.
   *
   * @return true or false depending on comparison result.
   */
  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AccessTokenResponse accessTokenResponse = (AccessTokenResponse) o;
    return Objects.equals(this.accessToken, accessTokenResponse.accessToken) &&
        Objects.equals(this.expiresIn, accessTokenResponse.expiresIn) &&
        Objects.equals(this.tokenType, accessTokenResponse.tokenType);
  }

  /**
   * Returns the HashCode.
   */
  @Override
  public int hashCode() {
    return Objects.hash(accessToken, expiresIn, tokenType);
  }


  /**
   * Converts the given object to string.
   */
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AccessTokenResponse {\n");
    
    sb.append("    accessToken: ").append(toIndentedString(accessToken)).append("\n");
    sb.append("    expiresIn: ").append(toIndentedString(expiresIn)).append("\n");
    sb.append("    tokenType: ").append(toIndentedString(tokenType)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

