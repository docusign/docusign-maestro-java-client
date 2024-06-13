package com.docusign.maestro.model;

import java.util.Objects;
import java.util.Arrays;
import com.docusign.maestro.model.WorkflowStepError;
import com.docusign.maestro.model.WorkflowStepHistoryState;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.Serializable;

/**
 * Details (history) of a Workflow Instance Step.
 *
 */
@Schema(description = "Details (history) of a Workflow Instance Step")

public class WorkflowStepHistory implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("accountId")
  private String accountId = null;

  @JsonProperty("dacId")
  private String dacId = null;

  @JsonProperty("dsStepId")
  private String dsStepId = null;

  @JsonProperty("endDate")
  private String endDate = null;

  @JsonProperty("error")
  private WorkflowStepError error = null;

  @JsonProperty("outputModuleProperties")
  private Object outputModuleProperties = null;

  @JsonProperty("startDate")
  private String startDate = null;

  @JsonProperty("stepId")
  private String stepId = null;

  @JsonProperty("stepName")
  private String stepName = null;

  @JsonProperty("stepState")
  private WorkflowStepHistoryState stepState = null;

  @JsonProperty("userId")
  private String userId = null;


  /**
   * accountId.
   *
   * @return WorkflowStepHistory
   **/
  public WorkflowStepHistory accountId(String accountId) {
    this.accountId = accountId;
    return this;
  }

  /**
   * Get accountId.
   * @return accountId
   **/
  @Schema(description = "")
  public String getAccountId() {
    return accountId;
  }

  /**
   * setAccountId.
   **/
  public void setAccountId(String accountId) {
    this.accountId = accountId;
  }


  /**
   * dacId.
   *
   * @return WorkflowStepHistory
   **/
  public WorkflowStepHistory dacId(String dacId) {
    this.dacId = dacId;
    return this;
  }

  /**
   * Get dacId.
   * @return dacId
   **/
  @Schema(required = true, description = "")
  public String getDacId() {
    return dacId;
  }

  /**
   * setDacId.
   **/
  public void setDacId(String dacId) {
    this.dacId = dacId;
  }


  /**
   * dsStepId.
   *
   * @return WorkflowStepHistory
   **/
  public WorkflowStepHistory dsStepId(String dsStepId) {
    this.dsStepId = dsStepId;
    return this;
  }

  /**
   * Get dsStepId.
   * @return dsStepId
   **/
  @Schema(description = "")
  public String getDsStepId() {
    return dsStepId;
  }

  /**
   * setDsStepId.
   **/
  public void setDsStepId(String dsStepId) {
    this.dsStepId = dsStepId;
  }


  /**
   * endDate.
   *
   * @return WorkflowStepHistory
   **/
  public WorkflowStepHistory endDate(String endDate) {
    this.endDate = endDate;
    return this;
  }

  /**
   * Track the End time of the Workflow Step.
   * @return endDate
   **/
  @Schema(description = "Track the End time of the Workflow Step")
  public String getEndDate() {
    return endDate;
  }

  /**
   * setEndDate.
   **/
  public void setEndDate(String endDate) {
    this.endDate = endDate;
  }


  /**
   * error.
   *
   * @return WorkflowStepHistory
   **/
  public WorkflowStepHistory error(WorkflowStepError error) {
    this.error = error;
    return this;
  }

  /**
   * Get error.
   * @return error
   **/
  @Schema(description = "")
  public WorkflowStepError getError() {
    return error;
  }

  /**
   * setError.
   **/
  public void setError(WorkflowStepError error) {
    this.error = error;
  }


  /**
   * outputModuleProperties.
   *
   * @return WorkflowStepHistory
   **/
  public WorkflowStepHistory outputModuleProperties(Object outputModuleProperties) {
    this.outputModuleProperties = outputModuleProperties;
    return this;
  }

  /**
   * Get outputModuleProperties.
   * @return outputModuleProperties
   **/
  @Schema(description = "")
  public Object getOutputModuleProperties() {
    return outputModuleProperties;
  }

  /**
   * setOutputModuleProperties.
   **/
  public void setOutputModuleProperties(Object outputModuleProperties) {
    this.outputModuleProperties = outputModuleProperties;
  }


  /**
   * startDate.
   *
   * @return WorkflowStepHistory
   **/
  public WorkflowStepHistory startDate(String startDate) {
    this.startDate = startDate;
    return this;
  }

  /**
   * Track the Start time of the Workflow Step.
   * @return startDate
   **/
  @Schema(description = "Track the Start time of the Workflow Step")
  public String getStartDate() {
    return startDate;
  }

  /**
   * setStartDate.
   **/
  public void setStartDate(String startDate) {
    this.startDate = startDate;
  }


  /**
   * stepId.
   *
   * @return WorkflowStepHistory
   **/
  public WorkflowStepHistory stepId(String stepId) {
    this.stepId = stepId;
    return this;
  }

  /**
   * The Step Id of the workflow step in the workflow instance.
   * @return stepId
   **/
  @Schema(description = "The Step Id of the workflow step in the workflow instance")
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
   * stepName.
   *
   * @return WorkflowStepHistory
   **/
  public WorkflowStepHistory stepName(String stepName) {
    this.stepName = stepName;
    return this;
  }

  /**
   * Name of the workflow step (DS Scope).
   * @return stepName
   **/
  @Schema(required = true, description = "Name of the workflow step (DS Scope)")
  public String getStepName() {
    return stepName;
  }

  /**
   * setStepName.
   **/
  public void setStepName(String stepName) {
    this.stepName = stepName;
  }


  /**
   * stepState.
   *
   * @return WorkflowStepHistory
   **/
  public WorkflowStepHistory stepState(WorkflowStepHistoryState stepState) {
    this.stepState = stepState;
    return this;
  }

  /**
   * Get stepState.
   * @return stepState
   **/
  @Schema(required = true, description = "")
  public WorkflowStepHistoryState getStepState() {
    return stepState;
  }

  /**
   * setStepState.
   **/
  public void setStepState(WorkflowStepHistoryState stepState) {
    this.stepState = stepState;
  }


  /**
   * userId.
   *
   * @return WorkflowStepHistory
   **/
  public WorkflowStepHistory userId(String userId) {
    this.userId = userId;
    return this;
  }

  /**
   * Get userId.
   * @return userId
   **/
  @Schema(required = true, description = "")
  public String getUserId() {
    return userId;
  }

  /**
   * setUserId.
   **/
  public void setUserId(String userId) {
    this.userId = userId;
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
    WorkflowStepHistory workflowStepHistory = (WorkflowStepHistory) o;
    return Objects.equals(this.accountId, workflowStepHistory.accountId) &&
        Objects.equals(this.dacId, workflowStepHistory.dacId) &&
        Objects.equals(this.dsStepId, workflowStepHistory.dsStepId) &&
        Objects.equals(this.endDate, workflowStepHistory.endDate) &&
        Objects.equals(this.error, workflowStepHistory.error) &&
        Objects.equals(this.outputModuleProperties, workflowStepHistory.outputModuleProperties) &&
        Objects.equals(this.startDate, workflowStepHistory.startDate) &&
        Objects.equals(this.stepId, workflowStepHistory.stepId) &&
        Objects.equals(this.stepName, workflowStepHistory.stepName) &&
        Objects.equals(this.stepState, workflowStepHistory.stepState) &&
        Objects.equals(this.userId, workflowStepHistory.userId);
  }

  /**
   * Returns the HashCode.
   */
  @Override
  public int hashCode() {
    return Objects.hash(accountId, dacId, dsStepId, endDate, error, outputModuleProperties, startDate, stepId, stepName, stepState, userId);
  }


  /**
   * Converts the given object to string.
   */
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WorkflowStepHistory {\n");
    
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    dacId: ").append(toIndentedString(dacId)).append("\n");
    sb.append("    dsStepId: ").append(toIndentedString(dsStepId)).append("\n");
    sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
    sb.append("    error: ").append(toIndentedString(error)).append("\n");
    sb.append("    outputModuleProperties: ").append(toIndentedString(outputModuleProperties)).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    stepId: ").append(toIndentedString(stepId)).append("\n");
    sb.append("    stepName: ").append(toIndentedString(stepName)).append("\n");
    sb.append("    stepState: ").append(toIndentedString(stepState)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
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

