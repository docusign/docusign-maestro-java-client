package com.docusign.maestro.model;

import java.util.Objects;
import java.util.Arrays;
import com.docusign.maestro.model.DSWorkflowTrigger;
import com.docusign.maestro.model.Participant;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;

/**
 * A DS workflow definition..
 *
 */
@Schema(description = "A DS workflow definition.")

public class WorkflowDefinition {
  @JsonProperty("accountId")
  private String accountId = null;

  @JsonProperty("createdByName")
  private String createdByName = null;

  @JsonProperty("documentVersion")
  private String documentVersion = null;

  @JsonProperty("participants")
  private java.util.Map<String, Participant> participants = null;

  @JsonProperty("schemaVersion")
  private String schemaVersion = null;

  @JsonProperty("steps")
  private java.util.List<Object> steps = new java.util.ArrayList<>();

  @JsonProperty("trigger")
  private DSWorkflowTrigger trigger = null;

  @JsonProperty("variables")
  private java.util.Map<String, Object> variables = new java.util.HashMap<>();

  @JsonProperty("workflowDescription")
  private String workflowDescription = null;

  @JsonProperty("workflowName")
  private String workflowName = null;


  /**
   * accountId.
   *
   * @return WorkflowDefinition
   **/
  public WorkflowDefinition accountId(String accountId) {
    this.accountId = accountId;
    return this;
  }

  /**
   * Get accountId.
   * @return accountId
   **/
  @Schema(required = true, description = "")
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
   * createdByName.
   *
   * @return WorkflowDefinition
   **/
  public WorkflowDefinition createdByName(String createdByName) {
    this.createdByName = createdByName;
    return this;
  }

  /**
   * The name of the user who created this workflow definition.
   * @return createdByName
   **/
  @Schema(description = "The name of the user who created this workflow definition")
  public String getCreatedByName() {
    return createdByName;
  }

  /**
   * setCreatedByName.
   **/
  public void setCreatedByName(String createdByName) {
    this.createdByName = createdByName;
  }


  /**
   * documentVersion.
   *
   * @return WorkflowDefinition
   **/
  public WorkflowDefinition documentVersion(String documentVersion) {
    this.documentVersion = documentVersion;
    return this;
  }

  /**
   * Get documentVersion.
   * @return documentVersion
   **/
  @Schema(required = true, description = "")
  public String getDocumentVersion() {
    return documentVersion;
  }

  /**
   * setDocumentVersion.
   **/
  public void setDocumentVersion(String documentVersion) {
    this.documentVersion = documentVersion;
  }


  /**
   * participants.
   *
   * @return WorkflowDefinition
   **/
  public WorkflowDefinition participants(java.util.Map<String, Participant> participants) {
    this.participants = participants;
    return this;
  }

  /**
   * putParticipantsItem.
   *
   * @return WorkflowDefinition
   **/
  public WorkflowDefinition putParticipantsItem(String key, Participant participantsItem) {
    if (this.participants == null) {
      this.participants = new java.util.HashMap<>();
    }
    this.participants.put(key, participantsItem);
    return this;
  }

  /**
   * A DS Workflow participant record.
   * @return participants
   **/
  @Schema(description = "A DS Workflow participant record")
  public java.util.Map<String, Participant> getParticipants() {
    return participants;
  }

  /**
   * setParticipants.
   **/
  public void setParticipants(java.util.Map<String, Participant> participants) {
    this.participants = participants;
  }


  /**
   * schemaVersion.
   *
   * @return WorkflowDefinition
   **/
  public WorkflowDefinition schemaVersion(String schemaVersion) {
    this.schemaVersion = schemaVersion;
    return this;
  }

  /**
   * Get schemaVersion.
   * @return schemaVersion
   **/
  @Schema(required = true, description = "")
  public String getSchemaVersion() {
    return schemaVersion;
  }

  /**
   * setSchemaVersion.
   **/
  public void setSchemaVersion(String schemaVersion) {
    this.schemaVersion = schemaVersion;
  }


  /**
   * steps.
   *
   * @return WorkflowDefinition
   **/
  public WorkflowDefinition steps(java.util.List<Object> steps) {
    this.steps = steps;
    return this;
  }
  
  /**
   * addStepsItem.
   *
   * @return WorkflowDefinition
   **/
  public WorkflowDefinition addStepsItem(Object stepsItem) {
    this.steps.add(stepsItem);
    return this;
  }

  /**
   * A list of #/definitions/DSWorkflowStep. Each element is: A DS Workflow Step. This object should be any of the following object models: [#/definitions/DSServiceStep, #/definitions/DSTransformationStep, #/definitions/DSDocGenStep, #/definitions/DSSignStep].
   * @return steps
   **/
  @Schema(required = true, description = "A list of #/definitions/DSWorkflowStep. Each element is: A DS Workflow Step. This object should be any of the following object models: [#/definitions/DSServiceStep, #/definitions/DSTransformationStep, #/definitions/DSDocGenStep, #/definitions/DSSignStep]")
  public java.util.List<Object> getSteps() {
    return steps;
  }

  /**
   * setSteps.
   **/
  public void setSteps(java.util.List<Object> steps) {
    this.steps = steps;
  }


  /**
   * trigger.
   *
   * @return WorkflowDefinition
   **/
  public WorkflowDefinition trigger(DSWorkflowTrigger trigger) {
    this.trigger = trigger;
    return this;
  }

  /**
   * Get trigger.
   * @return trigger
   **/
  @Schema(required = true, description = "")
  public DSWorkflowTrigger getTrigger() {
    return trigger;
  }

  /**
   * setTrigger.
   **/
  public void setTrigger(DSWorkflowTrigger trigger) {
    this.trigger = trigger;
  }


  /**
   * variables.
   *
   * @return WorkflowDefinition
   **/
  public WorkflowDefinition variables(java.util.Map<String, Object> variables) {
    this.variables = variables;
    return this;
  }

  /**
   * putVariablesItem.
   *
   * @return WorkflowDefinition
   **/
  public WorkflowDefinition putVariablesItem(String key, Object variablesItem) {
    this.variables.put(key, variablesItem);
    return this;
  }

  /**
   * A DS Workflow variable record.
   * @return variables
   **/
  @Schema(required = true, description = "A DS Workflow variable record")
  public java.util.Map<String, Object> getVariables() {
    return variables;
  }

  /**
   * setVariables.
   **/
  public void setVariables(java.util.Map<String, Object> variables) {
    this.variables = variables;
  }


  /**
   * workflowDescription.
   *
   * @return WorkflowDefinition
   **/
  public WorkflowDefinition workflowDescription(String workflowDescription) {
    this.workflowDescription = workflowDescription;
    return this;
  }

  /**
   * Get workflowDescription.
   * @return workflowDescription
   **/
  @Schema(required = true, description = "")
  public String getWorkflowDescription() {
    return workflowDescription;
  }

  /**
   * setWorkflowDescription.
   **/
  public void setWorkflowDescription(String workflowDescription) {
    this.workflowDescription = workflowDescription;
  }


  /**
   * workflowName.
   *
   * @return WorkflowDefinition
   **/
  public WorkflowDefinition workflowName(String workflowName) {
    this.workflowName = workflowName;
    return this;
  }

  /**
   * Get workflowName.
   * @return workflowName
   **/
  @Schema(required = true, description = "")
  public String getWorkflowName() {
    return workflowName;
  }

  /**
   * setWorkflowName.
   **/
  public void setWorkflowName(String workflowName) {
    this.workflowName = workflowName;
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
    WorkflowDefinition workflowDefinition = (WorkflowDefinition) o;
    return Objects.equals(this.accountId, workflowDefinition.accountId) &&
        Objects.equals(this.createdByName, workflowDefinition.createdByName) &&
        Objects.equals(this.documentVersion, workflowDefinition.documentVersion) &&
        Objects.equals(this.participants, workflowDefinition.participants) &&
        Objects.equals(this.schemaVersion, workflowDefinition.schemaVersion) &&
        Objects.equals(this.steps, workflowDefinition.steps) &&
        Objects.equals(this.trigger, workflowDefinition.trigger) &&
        Objects.equals(this.variables, workflowDefinition.variables) &&
        Objects.equals(this.workflowDescription, workflowDefinition.workflowDescription) &&
        Objects.equals(this.workflowName, workflowDefinition.workflowName);
  }

  /**
   * Returns the HashCode.
   */
  @Override
  public int hashCode() {
    return Objects.hash(accountId, createdByName, documentVersion, participants, schemaVersion, steps, trigger, variables, workflowDescription, workflowName);
  }


  /**
   * Converts the given object to string.
   */
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WorkflowDefinition {\n");
    
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    createdByName: ").append(toIndentedString(createdByName)).append("\n");
    sb.append("    documentVersion: ").append(toIndentedString(documentVersion)).append("\n");
    sb.append("    participants: ").append(toIndentedString(participants)).append("\n");
    sb.append("    schemaVersion: ").append(toIndentedString(schemaVersion)).append("\n");
    sb.append("    steps: ").append(toIndentedString(steps)).append("\n");
    sb.append("    trigger: ").append(toIndentedString(trigger)).append("\n");
    sb.append("    variables: ").append(toIndentedString(variables)).append("\n");
    sb.append("    workflowDescription: ").append(toIndentedString(workflowDescription)).append("\n");
    sb.append("    workflowName: ").append(toIndentedString(workflowName)).append("\n");
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

