package com.docusign.maestro.model;

import java.util.Objects;
import java.util.Arrays;
import com.docusign.maestro.model.ValidationErrors;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;

/**
 * InvalidWorkflowResponse.
 *
 */

public class InvalidWorkflowResponse {
  @JsonProperty("message")
  private String message = null;

  @JsonProperty("validationErrors")
  private java.util.List<ValidationErrors> validationErrors = new java.util.ArrayList<>();


  /**
   * message.
   *
   * @return InvalidWorkflowResponse
   **/
  public InvalidWorkflowResponse message(String message) {
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
   * validationErrors.
   *
   * @return InvalidWorkflowResponse
   **/
  public InvalidWorkflowResponse validationErrors(java.util.List<ValidationErrors> validationErrors) {
    this.validationErrors = validationErrors;
    return this;
  }
  
  /**
   * addValidationErrorsItem.
   *
   * @return InvalidWorkflowResponse
   **/
  public InvalidWorkflowResponse addValidationErrorsItem(ValidationErrors validationErrorsItem) {
    this.validationErrors.add(validationErrorsItem);
    return this;
  }

  /**
   * Get validationErrors.
   * @return validationErrors
   **/
  @Schema(required = true, description = "")
  public java.util.List<ValidationErrors> getValidationErrors() {
    return validationErrors;
  }

  /**
   * setValidationErrors.
   **/
  public void setValidationErrors(java.util.List<ValidationErrors> validationErrors) {
    this.validationErrors = validationErrors;
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
    InvalidWorkflowResponse invalidWorkflowResponse = (InvalidWorkflowResponse) o;
    return Objects.equals(this.message, invalidWorkflowResponse.message) &&
        Objects.equals(this.validationErrors, invalidWorkflowResponse.validationErrors);
  }

  /**
   * Returns the HashCode.
   */
  @Override
  public int hashCode() {
    return Objects.hash(message, validationErrors);
  }


  /**
   * Converts the given object to string.
   */
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InvalidWorkflowResponse {\n");
    
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    validationErrors: ").append(toIndentedString(validationErrors)).append("\n");
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

