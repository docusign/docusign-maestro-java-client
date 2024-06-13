package com.docusign.maestro.model;

import java.util.Objects;
import java.util.Arrays;
import com.docusign.maestro.model.ProgressInstance;
import com.docusign.maestro.model.StartedByInstance;
import com.docusign.maestro.model.WorkflowInstanceState;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.Serializable;

/**
 * Details of a Workflow Instance triggered for a Workflow Definition.
 *
 */
@Schema(description = "Details of a Workflow Instance triggered for a Workflow Definition")

public class WorkflowInstance implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("accountId")
  private String accountId = null;

  @JsonProperty("creatorId")
  private String creatorId = null;

  @JsonProperty("dacId")
  private String dacId = null;

  @JsonProperty("endDate")
  private String endDate = null;

  @JsonProperty("instanceName")
  private String instanceName = null;

  @JsonProperty("instanceState")
  private WorkflowInstanceState instanceState = null;

  @JsonProperty("progress")
  private ProgressInstance progress = null;

  @JsonProperty("startDate")
  private String startDate = null;

  @JsonProperty("startedBy")
  private StartedByInstance startedBy = null;

  @JsonProperty("templateId")
  private String templateId = null;

  @JsonProperty("users")
  private java.util.Map<String, String> users = new java.util.HashMap<>();


  /**
   * accountId.
   *
   * @return WorkflowInstance
   **/
  public WorkflowInstance accountId(String accountId) {
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
   * creatorId.
   *
   * @return WorkflowInstance
   **/
  public WorkflowInstance creatorId(String creatorId) {
    this.creatorId = creatorId;
    return this;
  }

  /**
   * Get creatorId.
   * @return creatorId
   **/
  @Schema(required = true, description = "")
  public String getCreatorId() {
    return creatorId;
  }

  /**
   * setCreatorId.
   **/
  public void setCreatorId(String creatorId) {
    this.creatorId = creatorId;
  }


  /**
   * dacId.
   *
   * @return WorkflowInstance
   **/
  public WorkflowInstance dacId(String dacId) {
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
   * endDate.
   *
   * @return WorkflowInstance
   **/
  public WorkflowInstance endDate(String endDate) {
    this.endDate = endDate;
    return this;
  }

  /**
   * Track the End time of the Workflow Instance.
   * @return endDate
   **/
  @Schema(description = "Track the End time of the Workflow Instance")
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
   * instanceName.
   *
   * @return WorkflowInstance
   **/
  public WorkflowInstance instanceName(String instanceName) {
    this.instanceName = instanceName;
    return this;
  }

  /**
   * The friendly name of the particular workflow instance.
   * @return instanceName
   **/
  @Schema(description = "The friendly name of the particular workflow instance")
  public String getInstanceName() {
    return instanceName;
  }

  /**
   * setInstanceName.
   **/
  public void setInstanceName(String instanceName) {
    this.instanceName = instanceName;
  }


  /**
   * instanceState.
   *
   * @return WorkflowInstance
   **/
  public WorkflowInstance instanceState(WorkflowInstanceState instanceState) {
    this.instanceState = instanceState;
    return this;
  }

  /**
   * Get instanceState.
   * @return instanceState
   **/
  @Schema(required = true, description = "")
  public WorkflowInstanceState getInstanceState() {
    return instanceState;
  }

  /**
   * setInstanceState.
   **/
  public void setInstanceState(WorkflowInstanceState instanceState) {
    this.instanceState = instanceState;
  }


  /**
   * progress.
   *
   * @return WorkflowInstance
   **/
  public WorkflowInstance progress(ProgressInstance progress) {
    this.progress = progress;
    return this;
  }

  /**
   * Get progress.
   * @return progress
   **/
  @Schema(description = "")
  public ProgressInstance getProgress() {
    return progress;
  }

  /**
   * setProgress.
   **/
  public void setProgress(ProgressInstance progress) {
    this.progress = progress;
  }


  /**
   * startDate.
   *
   * @return WorkflowInstance
   **/
  public WorkflowInstance startDate(String startDate) {
    this.startDate = startDate;
    return this;
  }

  /**
   * Track the Start time of the Workflow Instance.
   * @return startDate
   **/
  @Schema(description = "Track the Start time of the Workflow Instance")
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
   * startedBy.
   *
   * @return WorkflowInstance
   **/
  public WorkflowInstance startedBy(StartedByInstance startedBy) {
    this.startedBy = startedBy;
    return this;
  }

  /**
   * Get startedBy.
   * @return startedBy
   **/
  @Schema(description = "")
  public StartedByInstance getStartedBy() {
    return startedBy;
  }

  /**
   * setStartedBy.
   **/
  public void setStartedBy(StartedByInstance startedBy) {
    this.startedBy = startedBy;
  }


  /**
   * templateId.
   *
   * @return WorkflowInstance
   **/
  public WorkflowInstance templateId(String templateId) {
    this.templateId = templateId;
    return this;
  }

  /**
   * Get templateId.
   * @return templateId
   **/
  @Schema(required = true, description = "")
  public String getTemplateId() {
    return templateId;
  }

  /**
   * setTemplateId.
   **/
  public void setTemplateId(String templateId) {
    this.templateId = templateId;
  }


  /**
   * users.
   *
   * @return WorkflowInstance
   **/
  public WorkflowInstance users(java.util.Map<String, String> users) {
    this.users = users;
    return this;
  }

  /**
   * putUsersItem.
   *
   * @return WorkflowInstance
   **/
  public WorkflowInstance putUsersItem(String key, String usersItem) {
    this.users.put(key, usersItem);
    return this;
  }

  /**
   * Contains the list of Users and Steps mapping.
   * @return users
   **/
  @Schema(required = true, description = "Contains the list of Users and Steps mapping")
  public java.util.Map<String, String> getUsers() {
    return users;
  }

  /**
   * setUsers.
   **/
  public void setUsers(java.util.Map<String, String> users) {
    this.users = users;
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
    WorkflowInstance workflowInstance = (WorkflowInstance) o;
    return Objects.equals(this.accountId, workflowInstance.accountId) &&
        Objects.equals(this.creatorId, workflowInstance.creatorId) &&
        Objects.equals(this.dacId, workflowInstance.dacId) &&
        Objects.equals(this.endDate, workflowInstance.endDate) &&
        Objects.equals(this.instanceName, workflowInstance.instanceName) &&
        Objects.equals(this.instanceState, workflowInstance.instanceState) &&
        Objects.equals(this.progress, workflowInstance.progress) &&
        Objects.equals(this.startDate, workflowInstance.startDate) &&
        Objects.equals(this.startedBy, workflowInstance.startedBy) &&
        Objects.equals(this.templateId, workflowInstance.templateId) &&
        Objects.equals(this.users, workflowInstance.users);
  }

  /**
   * Returns the HashCode.
   */
  @Override
  public int hashCode() {
    return Objects.hash(accountId, creatorId, dacId, endDate, instanceName, instanceState, progress, startDate, startedBy, templateId, users);
  }


  /**
   * Converts the given object to string.
   */
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WorkflowInstance {\n");
    
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    creatorId: ").append(toIndentedString(creatorId)).append("\n");
    sb.append("    dacId: ").append(toIndentedString(dacId)).append("\n");
    sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
    sb.append("    instanceName: ").append(toIndentedString(instanceName)).append("\n");
    sb.append("    instanceState: ").append(toIndentedString(instanceState)).append("\n");
    sb.append("    progress: ").append(toIndentedString(progress)).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    startedBy: ").append(toIndentedString(startedBy)).append("\n");
    sb.append("    templateId: ").append(toIndentedString(templateId)).append("\n");
    sb.append("    users: ").append(toIndentedString(users)).append("\n");
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

