package com.docusign.maestro.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;

/**
 * ValidationErrors.
 *
 */

public class ValidationErrors {
  @JsonProperty("code")
  private String code = null;

  @JsonProperty("message")
  private String message = null;


  /**
   * code.
   *
   * @return ValidationErrors
   **/
  public ValidationErrors code(String code) {
    this.code = code;
    return this;
  }

  /**
   * Get code.
   * @return code
   **/
  @Schema(required = true, description = "")
  public String getCode() {
    return code;
  }

  /**
   * setCode.
   **/
  public void setCode(String code) {
    this.code = code;
  }


  /**
   * message.
   *
   * @return ValidationErrors
   **/
  public ValidationErrors message(String message) {
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
    ValidationErrors validationErrors = (ValidationErrors) o;
    return Objects.equals(this.code, validationErrors.code) &&
        Objects.equals(this.message, validationErrors.message);
  }

  /**
   * Returns the HashCode.
   */
  @Override
  public int hashCode() {
    return Objects.hash(code, message);
  }


  /**
   * Converts the given object to string.
   */
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ValidationErrors {\n");
    
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
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

