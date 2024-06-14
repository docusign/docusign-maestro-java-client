package com.docusign.maestro.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.Serializable;

/**
 * WorkflowStepErrorError.
 *
 */

public class WorkflowStepErrorError implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("code")
  private String code = null;

  @JsonProperty("message")
  private String message = null;


  /**
   * code.
   *
   * @return WorkflowStepErrorError
   **/
  public WorkflowStepErrorError code(String code) {
    this.code = code;
    return this;
  }

  /**
   * The Error Code Message.
   * @return code
   **/
  @Schema(description = "The Error Code Message")
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
   * @return WorkflowStepErrorError
   **/
  public WorkflowStepErrorError message(String message) {
    this.message = message;
    return this;
  }

  /**
   * Error Message which shares more details.
   * @return message
   **/
  @Schema(description = "Error Message which shares more details")
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
    WorkflowStepErrorError workflowStepErrorError = (WorkflowStepErrorError) o;
    return Objects.equals(this.code, workflowStepErrorError.code) &&
        Objects.equals(this.message, workflowStepErrorError.message);
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
    sb.append("class WorkflowStepErrorError {\n");
    
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

