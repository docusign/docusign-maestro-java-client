package com.docusign.maestro.model;

import java.util.Objects;
import java.util.Arrays;
import com.docusign.maestro.model.ErrorCodes;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.Serializable;

/**
 * Returns error with a status message.
 *
 */
@Schema(description = "Returns error with a status message")

public class ErrorResponse implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("errorCode")
  private ErrorCodes errorCode = null;

  @JsonProperty("message")
  private String message = null;


  /**
   * errorCode.
   *
   * @return ErrorResponse
   **/
  public ErrorResponse errorCode(ErrorCodes errorCode) {
    this.errorCode = errorCode;
    return this;
  }

  /**
   * Get errorCode.
   * @return errorCode
   **/
  @Schema(description = "")
  public ErrorCodes getErrorCode() {
    return errorCode;
  }

  /**
   * setErrorCode.
   **/
  public void setErrorCode(ErrorCodes errorCode) {
    this.errorCode = errorCode;
  }


  /**
   * message.
   *
   * @return ErrorResponse
   **/
  public ErrorResponse message(String message) {
    this.message = message;
    return this;
  }

  /**
   * Get message.
   * @return message
   **/
  @Schema(description = "")
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
    ErrorResponse errorResponse = (ErrorResponse) o;
    return Objects.equals(this.errorCode, errorResponse.errorCode) &&
        Objects.equals(this.message, errorResponse.message);
  }

  /**
   * Returns the HashCode.
   */
  @Override
  public int hashCode() {
    return Objects.hash(errorCode, message);
  }


  /**
   * Converts the given object to string.
   */
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ErrorResponse {\n");
    
    sb.append("    errorCode: ").append(toIndentedString(errorCode)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
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

