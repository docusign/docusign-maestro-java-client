package com.docusign.maestro.model;

import java.util.Objects;
import java.util.Arrays;
import com.docusign.maestro.model.ValidationErrors;
import com.docusign.maestro.model.WorkflowDefinition;
import com.docusign.maestro.model.WorkflowMetadataStatus;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import java.time.OffsetDateTime;

/**
 * A DS workflow definition with metadata..
 *
 */
@Schema(description = "A DS workflow definition with metadata.")

public class WorkflowDefinitionWithId {
  @JsonProperty("accountId")
  private String accountId = null;

  @JsonProperty("createdDate")
  private String createdDate = null;

  @JsonProperty("id")
  private String id = null;

  @JsonProperty("isDraft")
  private Boolean isDraft = null;

  @JsonProperty("lastDeployedId")
  private String lastDeployedId = null;

  @JsonProperty("lastDeployedVersion")
  private String lastDeployedVersion = null;

  @JsonProperty("lastDeployedWorkflowDefinition")
  private WorkflowDefinition lastDeployedWorkflowDefinition = null;

  @JsonProperty("lastUpdatedDate")
  private String lastUpdatedDate = null;

  @JsonProperty("status")
  private WorkflowMetadataStatus status = null;

  @JsonProperty("triggerUrl")
  private String triggerUrl = null;

  @JsonProperty("validationErrors")
  private java.util.List<ValidationErrors> validationErrors = null;

  @JsonProperty("workflowDefinition")
  private WorkflowDefinition workflowDefinition = null;


  /**
   * accountId.
   *
   * @return WorkflowDefinitionWithId
   **/
  public WorkflowDefinitionWithId accountId(String accountId) {
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
   * createdDate.
   *
   * @return WorkflowDefinitionWithId
   **/
  public WorkflowDefinitionWithId createdDate(String createdDate) {
    this.createdDate = createdDate;
    return this;
  }

  /**
   * The date the workflow was created.
   * @return createdDate
   **/
  @Schema(description = "The date the workflow was created")
  public String getCreatedDate() {
    return createdDate;
  }

  /**
   * setCreatedDate.
   **/
  public void setCreatedDate(String createdDate) {
    this.createdDate = createdDate;
  }


  /**
   * id.
   *
   * @return WorkflowDefinitionWithId
   **/
  public WorkflowDefinitionWithId id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Get id.
   * @return id
   **/
  @Schema(required = true, description = "")
  public String getId() {
    return id;
  }

  /**
   * setId.
   **/
  public void setId(String id) {
    this.id = id;
  }


  /**
   * isDraft.
   *
   * @return WorkflowDefinitionWithId
   **/
  public WorkflowDefinitionWithId isDraft(Boolean isDraft) {
    this.isDraft = isDraft;
    return this;
  }

  /**
   * Get isDraft.
   * @return isDraft
   **/
  @Schema(description = "")
  public Boolean isIsDraft() {
    return isDraft;
  }

  /**
   * setIsDraft.
   **/
  public void setIsDraft(Boolean isDraft) {
    this.isDraft = isDraft;
  }


  /**
   * lastDeployedId.
   *
   * @return WorkflowDefinitionWithId
   **/
  public WorkflowDefinitionWithId lastDeployedId(String lastDeployedId) {
    this.lastDeployedId = lastDeployedId;
    return this;
  }

  /**
   * Get lastDeployedId.
   * @return lastDeployedId
   **/
  @Schema(description = "")
  public String getLastDeployedId() {
    return lastDeployedId;
  }

  /**
   * setLastDeployedId.
   **/
  public void setLastDeployedId(String lastDeployedId) {
    this.lastDeployedId = lastDeployedId;
  }


  /**
   * lastDeployedVersion.
   *
   * @return WorkflowDefinitionWithId
   **/
  public WorkflowDefinitionWithId lastDeployedVersion(String lastDeployedVersion) {
    this.lastDeployedVersion = lastDeployedVersion;
    return this;
  }

  /**
   * Get lastDeployedVersion.
   * @return lastDeployedVersion
   **/
  @Schema(description = "")
  public String getLastDeployedVersion() {
    return lastDeployedVersion;
  }

  /**
   * setLastDeployedVersion.
   **/
  public void setLastDeployedVersion(String lastDeployedVersion) {
    this.lastDeployedVersion = lastDeployedVersion;
  }


  /**
   * lastDeployedWorkflowDefinition.
   *
   * @return WorkflowDefinitionWithId
   **/
  public WorkflowDefinitionWithId lastDeployedWorkflowDefinition(WorkflowDefinition lastDeployedWorkflowDefinition) {
    this.lastDeployedWorkflowDefinition = lastDeployedWorkflowDefinition;
    return this;
  }

  /**
   * Get lastDeployedWorkflowDefinition.
   * @return lastDeployedWorkflowDefinition
   **/
  @Schema(description = "")
  public WorkflowDefinition getLastDeployedWorkflowDefinition() {
    return lastDeployedWorkflowDefinition;
  }

  /**
   * setLastDeployedWorkflowDefinition.
   **/
  public void setLastDeployedWorkflowDefinition(WorkflowDefinition lastDeployedWorkflowDefinition) {
    this.lastDeployedWorkflowDefinition = lastDeployedWorkflowDefinition;
  }


  /**
   * lastUpdatedDate.
   *
   * @return WorkflowDefinitionWithId
   **/
  public WorkflowDefinitionWithId lastUpdatedDate(String lastUpdatedDate) {
    this.lastUpdatedDate = lastUpdatedDate;
    return this;
  }

  /**
   * The date the workflow was last updated.
   * @return lastUpdatedDate
   **/
  @Schema(description = "The date the workflow was last updated")
  public String getLastUpdatedDate() {
    return lastUpdatedDate;
  }

  /**
   * setLastUpdatedDate.
   **/
  public void setLastUpdatedDate(String lastUpdatedDate) {
    this.lastUpdatedDate = lastUpdatedDate;
  }


  /**
   * status.
   *
   * @return WorkflowDefinitionWithId
   **/
  public WorkflowDefinitionWithId status(WorkflowMetadataStatus status) {
    this.status = status;
    return this;
  }

  /**
   * Get status.
   * @return status
   **/
  @Schema(description = "")
  public WorkflowMetadataStatus getStatus() {
    return status;
  }

  /**
   * setStatus.
   **/
  public void setStatus(WorkflowMetadataStatus status) {
    this.status = status;
  }


  /**
   * triggerUrl.
   *
   * @return WorkflowDefinitionWithId
   **/
  public WorkflowDefinitionWithId triggerUrl(String triggerUrl) {
    this.triggerUrl = triggerUrl;
    return this;
  }

  /**
   * Get triggerUrl.
   * @return triggerUrl
   **/
  @Schema(description = "")
  public String getTriggerUrl() {
    return triggerUrl;
  }

  /**
   * setTriggerUrl.
   **/
  public void setTriggerUrl(String triggerUrl) {
    this.triggerUrl = triggerUrl;
  }


  /**
   * validationErrors.
   *
   * @return WorkflowDefinitionWithId
   **/
  public WorkflowDefinitionWithId validationErrors(java.util.List<ValidationErrors> validationErrors) {
    this.validationErrors = validationErrors;
    return this;
  }
  
  /**
   * addValidationErrorsItem.
   *
   * @return WorkflowDefinitionWithId
   **/
  public WorkflowDefinitionWithId addValidationErrorsItem(ValidationErrors validationErrorsItem) {
    if (this.validationErrors == null) {
      this.validationErrors = new java.util.ArrayList<>();
    }
    this.validationErrors.add(validationErrorsItem);
    return this;
  }

  /**
   * Get validationErrors.
   * @return validationErrors
   **/
  @Schema(description = "")
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
   * workflowDefinition.
   *
   * @return WorkflowDefinitionWithId
   **/
  public WorkflowDefinitionWithId workflowDefinition(WorkflowDefinition workflowDefinition) {
    this.workflowDefinition = workflowDefinition;
    return this;
  }

  /**
   * Get workflowDefinition.
   * @return workflowDefinition
   **/
  @Schema(description = "")
  public WorkflowDefinition getWorkflowDefinition() {
    return workflowDefinition;
  }

  /**
   * setWorkflowDefinition.
   **/
  public void setWorkflowDefinition(WorkflowDefinition workflowDefinition) {
    this.workflowDefinition = workflowDefinition;
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
    WorkflowDefinitionWithId workflowDefinitionWithId = (WorkflowDefinitionWithId) o;
    return Objects.equals(this.accountId, workflowDefinitionWithId.accountId) &&
        Objects.equals(this.createdDate, workflowDefinitionWithId.createdDate) &&
        Objects.equals(this.id, workflowDefinitionWithId.id) &&
        Objects.equals(this.isDraft, workflowDefinitionWithId.isDraft) &&
        Objects.equals(this.lastDeployedId, workflowDefinitionWithId.lastDeployedId) &&
        Objects.equals(this.lastDeployedVersion, workflowDefinitionWithId.lastDeployedVersion) &&
        Objects.equals(this.lastDeployedWorkflowDefinition, workflowDefinitionWithId.lastDeployedWorkflowDefinition) &&
        Objects.equals(this.lastUpdatedDate, workflowDefinitionWithId.lastUpdatedDate) &&
        Objects.equals(this.status, workflowDefinitionWithId.status) &&
        Objects.equals(this.triggerUrl, workflowDefinitionWithId.triggerUrl) &&
        Objects.equals(this.validationErrors, workflowDefinitionWithId.validationErrors) &&
        Objects.equals(this.workflowDefinition, workflowDefinitionWithId.workflowDefinition);
  }

  /**
   * Returns the HashCode.
   */
  @Override
  public int hashCode() {
    return Objects.hash(accountId, createdDate, id, isDraft, lastDeployedId, lastDeployedVersion, lastDeployedWorkflowDefinition, lastUpdatedDate, status, triggerUrl, validationErrors, workflowDefinition);
  }


  /**
   * Converts the given object to string.
   */
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WorkflowDefinitionWithId {\n");
    
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    createdDate: ").append(toIndentedString(createdDate)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    isDraft: ").append(toIndentedString(isDraft)).append("\n");
    sb.append("    lastDeployedId: ").append(toIndentedString(lastDeployedId)).append("\n");
    sb.append("    lastDeployedVersion: ").append(toIndentedString(lastDeployedVersion)).append("\n");
    sb.append("    lastDeployedWorkflowDefinition: ").append(toIndentedString(lastDeployedWorkflowDefinition)).append("\n");
    sb.append("    lastUpdatedDate: ").append(toIndentedString(lastUpdatedDate)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    triggerUrl: ").append(toIndentedString(triggerUrl)).append("\n");
    sb.append("    validationErrors: ").append(toIndentedString(validationErrors)).append("\n");
    sb.append("    workflowDefinition: ").append(toIndentedString(workflowDefinition)).append("\n");
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

