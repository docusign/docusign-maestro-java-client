package com.docusign.maestro.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import java.time.OffsetDateTime;

/**
 * DeployResponse.
 *
 */

public class DeployResponse {
  @JsonProperty("message")
  private String message = null;

  @JsonProperty("method")
  private String method = null;

  @JsonProperty("pollUrl")
  private String pollUrl = null;

  @JsonProperty("receivedTime")
  private String receivedTime = null;


  /**
   * message.
   *
   * @return DeployResponse
   **/
  public DeployResponse message(String message) {
    this.message = message;
    return this;
  }

  /**
   * Get message.
   * @return message
   **/
  @Schema(required = true, description = "")
  public String getMessage() {
    return message;
  }

  /**
   * setMessage.
   **/
  public void setMessage(String message) {
    this.message = message;
  }


  /**
   * method.
   *
   * @return DeployResponse
   **/
  public DeployResponse method(String method) {
    this.method = method;
    return this;
  }

  /**
   * Get method.
   * @return method
   **/
  @Schema(description = "")
  public String getMethod() {
    return method;
  }

  /**
   * setMethod.
   **/
  public void setMethod(String method) {
    this.method = method;
  }


  /**
   * pollUrl.
   *
   * @return DeployResponse
   **/
  public DeployResponse pollUrl(String pollUrl) {
    this.pollUrl = pollUrl;
    return this;
  }

  /**
   * Get pollUrl.
   * @return pollUrl
   **/
  @Schema(required = true, description = "")
  public String getPollUrl() {
    return pollUrl;
  }

  /**
   * setPollUrl.
   **/
  public void setPollUrl(String pollUrl) {
    this.pollUrl = pollUrl;
  }


  /**
   * receivedTime.
   *
   * @return DeployResponse
   **/
  public DeployResponse receivedTime(String receivedTime) {
    this.receivedTime = receivedTime;
    return this;
  }

  /**
   * Get receivedTime.
   * @return receivedTime
   **/
  @Schema(description = "")
  public String getReceivedTime() {
    return receivedTime;
  }

  /**
   * setReceivedTime.
   **/
  public void setReceivedTime(String receivedTime) {
    this.receivedTime = receivedTime;
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
    DeployResponse deployResponse = (DeployResponse) o;
    return Objects.equals(this.message, deployResponse.message) &&
        Objects.equals(this.method, deployResponse.method) &&
        Objects.equals(this.pollUrl, deployResponse.pollUrl) &&
        Objects.equals(this.receivedTime, deployResponse.receivedTime);
  }

  /**
   * Returns the HashCode.
   */
  @Override
  public int hashCode() {
    return Objects.hash(message, method, pollUrl, receivedTime);
  }


  /**
   * Converts the given object to string.
   */
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DeployResponse {\n");
    
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    method: ").append(toIndentedString(method)).append("\n");
    sb.append("    pollUrl: ").append(toIndentedString(pollUrl)).append("\n");
    sb.append("    receivedTime: ").append(toIndentedString(receivedTime)).append("\n");
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

