package com.docusign.maestro.model;

import java.util.Objects;
import java.util.Arrays;
import com.docusign.maestro.model.WorkflowStepErrorError;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;

/**
 * Workflow Step History Error.
 *
 */
@Schema(description = "Workflow Step History Error")

public class WorkflowStepError {
  @JsonProperty("code")
  private String code = null;

  @JsonProperty("endTime")
  private String endTime = null;

  @JsonProperty("error")
  private WorkflowStepErrorError error = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("startTime")
  private String startTime = null;


  /**
   * code.
   *
   * @return WorkflowStepError
   **/
  public WorkflowStepError code(String code) {
    this.code = code;
    return this;
  }

  /**
   * Error code message.
   * @return code
   **/
  @Schema(description = "Error code message")
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
   * endTime.
   *
   * @return WorkflowStepError
   **/
  public WorkflowStepError endTime(String endTime) {
    this.endTime = endTime;
    return this;
  }

  /**
   * Track the End time of the error retry/processed.
   * @return endTime
   **/
  @Schema(description = "Track the End time of the error retry/processed")
  public String getEndTime() {
    return endTime;
  }

  /**
   * setEndTime.
   **/
  public void setEndTime(String endTime) {
    this.endTime = endTime;
  }


  /**
   * error.
   *
   * @return WorkflowStepError
   **/
  public WorkflowStepError error(WorkflowStepErrorError error) {
    this.error = error;
    return this;
  }

  /**
   * Get error.
   * @return error
   **/
  @Schema(description = "")
  public WorkflowStepErrorError getError() {
    return error;
  }

  /**
   * setError.
   **/
  public void setError(WorkflowStepErrorError error) {
    this.error = error;
  }


  /**
   * name.
   *
   * @return WorkflowStepError
   **/
  public WorkflowStepError name(String name) {
    this.name = name;
    return this;
  }

  /**
   * The workflow step name where the error occurred.
   * @return name
   **/
  @Schema(description = "The workflow step name where the error occurred")
  public String getName() {
    return name;
  }

  /**
   * setName.
   **/
  public void setName(String name) {
    this.name = name;
  }


  /**
   * startTime.
   *
   * @return WorkflowStepError
   **/
  public WorkflowStepError startTime(String startTime) {
    this.startTime = startTime;
    return this;
  }

  /**
   * Track Start time of the error occurred.
   * @return startTime
   **/
  @Schema(description = "Track Start time of the error occurred")
  public String getStartTime() {
    return startTime;
  }

  /**
   * setStartTime.
   **/
  public void setStartTime(String startTime) {
    this.startTime = startTime;
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
    WorkflowStepError workflowStepError = (WorkflowStepError) o;
    return Objects.equals(this.code, workflowStepError.code) &&
        Objects.equals(this.endTime, workflowStepError.endTime) &&
        Objects.equals(this.error, workflowStepError.error) &&
        Objects.equals(this.name, workflowStepError.name) &&
        Objects.equals(this.startTime, workflowStepError.startTime);
  }

  /**
   * Returns the HashCode.
   */
  @Override
  public int hashCode() {
    return Objects.hash(code, endTime, error, name, startTime);
  }


  /**
   * Converts the given object to string.
   */
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WorkflowStepError {\n");
    
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
    sb.append("    error: ").append(toIndentedString(error)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
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

