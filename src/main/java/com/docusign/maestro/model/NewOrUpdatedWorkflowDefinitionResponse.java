package com.docusign.maestro.model;

import java.util.Objects;
import java.util.Arrays;
import com.docusign.maestro.model.ValidationErrors;
import com.docusign.maestro.model.WorkflowDefinition;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.Serializable;

/**
 * NewOrUpdatedWorkflowDefinitionResponse.
 *
 */

public class NewOrUpdatedWorkflowDefinitionResponse implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("isValidWorkflowDefinition")
  private Boolean isValidWorkflowDefinition = null;

  @JsonProperty("validationErrors")
  private java.util.List<ValidationErrors> validationErrors = new java.util.ArrayList<>();

  @JsonProperty("workflowDefinition")
  private WorkflowDefinition workflowDefinition = null;

  @JsonProperty("workflowDefinitionId")
  private String workflowDefinitionId = null;


  /**
   * isValidWorkflowDefinition.
   *
   * @return NewOrUpdatedWorkflowDefinitionResponse
   **/
  public NewOrUpdatedWorkflowDefinitionResponse isValidWorkflowDefinition(Boolean isValidWorkflowDefinition) {
    this.isValidWorkflowDefinition = isValidWorkflowDefinition;
    return this;
  }

  /**
   * Get isValidWorkflowDefinition.
   * @return isValidWorkflowDefinition
   **/
  @Schema(required = true, description = "")
  public Boolean isIsValidWorkflowDefinition() {
    return isValidWorkflowDefinition;
  }

  /**
   * setIsValidWorkflowDefinition.
   **/
  public void setIsValidWorkflowDefinition(Boolean isValidWorkflowDefinition) {
    this.isValidWorkflowDefinition = isValidWorkflowDefinition;
  }


  /**
   * validationErrors.
   *
   * @return NewOrUpdatedWorkflowDefinitionResponse
   **/
  public NewOrUpdatedWorkflowDefinitionResponse validationErrors(java.util.List<ValidationErrors> validationErrors) {
    this.validationErrors = validationErrors;
    return this;
  }
  
  /**
   * addValidationErrorsItem.
   *
   * @return NewOrUpdatedWorkflowDefinitionResponse
   **/
  public NewOrUpdatedWorkflowDefinitionResponse addValidationErrorsItem(ValidationErrors validationErrorsItem) {
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
   * workflowDefinition.
   *
   * @return NewOrUpdatedWorkflowDefinitionResponse
   **/
  public NewOrUpdatedWorkflowDefinitionResponse workflowDefinition(WorkflowDefinition workflowDefinition) {
    this.workflowDefinition = workflowDefinition;
    return this;
  }

  /**
   * Get workflowDefinition.
   * @return workflowDefinition
   **/
  @Schema(required = true, description = "")
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
   * workflowDefinitionId.
   *
   * @return NewOrUpdatedWorkflowDefinitionResponse
   **/
  public NewOrUpdatedWorkflowDefinitionResponse workflowDefinitionId(String workflowDefinitionId) {
    this.workflowDefinitionId = workflowDefinitionId;
    return this;
  }

  /**
   * Get workflowDefinitionId.
   * @return workflowDefinitionId
   **/
  @Schema(required = true, description = "")
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
    NewOrUpdatedWorkflowDefinitionResponse newOrUpdatedWorkflowDefinitionResponse = (NewOrUpdatedWorkflowDefinitionResponse) o;
    return Objects.equals(this.isValidWorkflowDefinition, newOrUpdatedWorkflowDefinitionResponse.isValidWorkflowDefinition) &&
        Objects.equals(this.validationErrors, newOrUpdatedWorkflowDefinitionResponse.validationErrors) &&
        Objects.equals(this.workflowDefinition, newOrUpdatedWorkflowDefinitionResponse.workflowDefinition) &&
        Objects.equals(this.workflowDefinitionId, newOrUpdatedWorkflowDefinitionResponse.workflowDefinitionId);
  }

  /**
   * Returns the HashCode.
   */
  @Override
  public int hashCode() {
    return Objects.hash(isValidWorkflowDefinition, validationErrors, workflowDefinition, workflowDefinitionId);
  }


  /**
   * Converts the given object to string.
   */
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NewOrUpdatedWorkflowDefinitionResponse {\n");
    
    sb.append("    isValidWorkflowDefinition: ").append(toIndentedString(isValidWorkflowDefinition)).append("\n");
    sb.append("    validationErrors: ").append(toIndentedString(validationErrors)).append("\n");
    sb.append("    workflowDefinition: ").append(toIndentedString(workflowDefinition)).append("\n");
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

