package com.docusign.maestro.model;

import java.util.Objects;
import java.util.Arrays;
import com.docusign.maestro.model.WorkflowMetadataStatus;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import java.time.OffsetDateTime;

/**
 * A DS workflow definition&#39;s metadata..
 *
 */
@Schema(description = "A DS workflow definition's metadata.")

public class WorkflowDefinitionMetadata {
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

  @JsonProperty("lastUpdatedDate")
  private String lastUpdatedDate = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("status")
  private WorkflowMetadataStatus status = null;

  @JsonProperty("triggerUrl")
  private String triggerUrl = null;


  /**
   * accountId.
   *
   * @return WorkflowDefinitionMetadata
   **/
  public WorkflowDefinitionMetadata accountId(String accountId) {
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
   * @return WorkflowDefinitionMetadata
   **/
  public WorkflowDefinitionMetadata createdDate(String createdDate) {
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
   * @return WorkflowDefinitionMetadata
   **/
  public WorkflowDefinitionMetadata id(String id) {
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
   * @return WorkflowDefinitionMetadata
   **/
  public WorkflowDefinitionMetadata isDraft(Boolean isDraft) {
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
   * @return WorkflowDefinitionMetadata
   **/
  public WorkflowDefinitionMetadata lastDeployedId(String lastDeployedId) {
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
   * @return WorkflowDefinitionMetadata
   **/
  public WorkflowDefinitionMetadata lastDeployedVersion(String lastDeployedVersion) {
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
   * lastUpdatedDate.
   *
   * @return WorkflowDefinitionMetadata
   **/
  public WorkflowDefinitionMetadata lastUpdatedDate(String lastUpdatedDate) {
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
   * name.
   *
   * @return WorkflowDefinitionMetadata
   **/
  public WorkflowDefinitionMetadata name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Get name.
   * @return name
   **/
  @Schema(description = "")
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
   * status.
   *
   * @return WorkflowDefinitionMetadata
   **/
  public WorkflowDefinitionMetadata status(WorkflowMetadataStatus status) {
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
   * @return WorkflowDefinitionMetadata
   **/
  public WorkflowDefinitionMetadata triggerUrl(String triggerUrl) {
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
    WorkflowDefinitionMetadata workflowDefinitionMetadata = (WorkflowDefinitionMetadata) o;
    return Objects.equals(this.accountId, workflowDefinitionMetadata.accountId) &&
        Objects.equals(this.createdDate, workflowDefinitionMetadata.createdDate) &&
        Objects.equals(this.id, workflowDefinitionMetadata.id) &&
        Objects.equals(this.isDraft, workflowDefinitionMetadata.isDraft) &&
        Objects.equals(this.lastDeployedId, workflowDefinitionMetadata.lastDeployedId) &&
        Objects.equals(this.lastDeployedVersion, workflowDefinitionMetadata.lastDeployedVersion) &&
        Objects.equals(this.lastUpdatedDate, workflowDefinitionMetadata.lastUpdatedDate) &&
        Objects.equals(this.name, workflowDefinitionMetadata.name) &&
        Objects.equals(this.status, workflowDefinitionMetadata.status) &&
        Objects.equals(this.triggerUrl, workflowDefinitionMetadata.triggerUrl);
  }

  /**
   * Returns the HashCode.
   */
  @Override
  public int hashCode() {
    return Objects.hash(accountId, createdDate, id, isDraft, lastDeployedId, lastDeployedVersion, lastUpdatedDate, name, status, triggerUrl);
  }


  /**
   * Converts the given object to string.
   */
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WorkflowDefinitionMetadata {\n");
    
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    createdDate: ").append(toIndentedString(createdDate)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    isDraft: ").append(toIndentedString(isDraft)).append("\n");
    sb.append("    lastDeployedId: ").append(toIndentedString(lastDeployedId)).append("\n");
    sb.append("    lastDeployedVersion: ").append(toIndentedString(lastDeployedVersion)).append("\n");
    sb.append("    lastUpdatedDate: ").append(toIndentedString(lastUpdatedDate)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    triggerUrl: ").append(toIndentedString(triggerUrl)).append("\n");
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

