package com.docusign.maestro.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;

/**
 * GetConfigurationInstanceResponse.
 *
 */

public class GetConfigurationInstanceResponse {
  @JsonProperty("savedValues")
  private Object savedValues = null;

  @JsonProperty("stepId")
  private String stepId = null;

  @JsonProperty("workflowDefinitionId")
  private String workflowDefinitionId = null;


  /**
   * savedValues.
   *
   * @return GetConfigurationInstanceResponse
   **/
  public GetConfigurationInstanceResponse savedValues(Object savedValues) {
    this.savedValues = savedValues;
    return this;
  }

  /**
   * Get savedValues.
   * @return savedValues
   **/
  @Schema(description = "")
  public Object getSavedValues() {
    return savedValues;
  }

  /**
   * setSavedValues.
   **/
  public void setSavedValues(Object savedValues) {
    this.savedValues = savedValues;
  }


  /**
   * stepId.
   *
   * @return GetConfigurationInstanceResponse
   **/
  public GetConfigurationInstanceResponse stepId(String stepId) {
    this.stepId = stepId;
    return this;
  }

  /**
   * Get stepId.
   * @return stepId
   **/
  @Schema(description = "")
  public String getStepId() {
    return stepId;
  }

  /**
   * setStepId.
   **/
  public void setStepId(String stepId) {
    this.stepId = stepId;
  }


  /**
   * workflowDefinitionId.
   *
   * @return GetConfigurationInstanceResponse
   **/
  public GetConfigurationInstanceResponse workflowDefinitionId(String workflowDefinitionId) {
    this.workflowDefinitionId = workflowDefinitionId;
    return this;
  }

  /**
   * Get workflowDefinitionId.
   * @return workflowDefinitionId
   **/
  @Schema(description = "")
  public String getWorkflowDefinitionId() {
    return workflowDefinitionId;
  }

  /**
   * setWorkflowDefinitionId.
   **/
  public void setWorkflowDefinitionId(String workflowDefinitionId) {
    this.workflowDefinitionId = workflowDefinitionId;
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
    GetConfigurationInstanceResponse getConfigurationInstanceResponse = (GetConfigurationInstanceResponse) o;
    return Objects.equals(this.savedValues, getConfigurationInstanceResponse.savedValues) &&
        Objects.equals(this.stepId, getConfigurationInstanceResponse.stepId) &&
        Objects.equals(this.workflowDefinitionId, getConfigurationInstanceResponse.workflowDefinitionId);
  }

  /**
   * Returns the HashCode.
   */
  @Override
  public int hashCode() {
    return Objects.hash(savedValues, stepId, workflowDefinitionId);
  }


  /**
   * Converts the given object to string.
   */
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetConfigurationInstanceResponse {\n");
    
    sb.append("    savedValues: ").append(toIndentedString(savedValues)).append("\n");
    sb.append("    stepId: ").append(toIndentedString(stepId)).append("\n");
    sb.append("    workflowDefinitionId: ").append(toIndentedString(workflowDefinitionId)).append("\n");
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

