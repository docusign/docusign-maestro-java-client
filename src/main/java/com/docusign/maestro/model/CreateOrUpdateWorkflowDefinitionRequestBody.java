package com.docusign.maestro.model;

import java.util.Objects;
import java.util.Arrays;
import com.docusign.maestro.model.WorkflowDefinition;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.Serializable;

/**
 * A request body that used for create or update workflow definition.
 *
 */
@Schema(description = "A request body that used for create or update workflow definition")

public class CreateOrUpdateWorkflowDefinitionRequestBody implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("workflowDefinition")
  private WorkflowDefinition workflowDefinition = null;


  /**
   * workflowDefinition.
   *
   * @return CreateOrUpdateWorkflowDefinitionRequestBody
   **/
  public CreateOrUpdateWorkflowDefinitionRequestBody workflowDefinition(WorkflowDefinition workflowDefinition) {
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
    CreateOrUpdateWorkflowDefinitionRequestBody createOrUpdateWorkflowDefinitionRequestBody = (CreateOrUpdateWorkflowDefinitionRequestBody) o;
    return Objects.equals(this.workflowDefinition, createOrUpdateWorkflowDefinitionRequestBody.workflowDefinition);
  }

  /**
   * Returns the HashCode.
   */
  @Override
  public int hashCode() {
    return Objects.hash(workflowDefinition);
  }


  /**
   * Converts the given object to string.
   */
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateOrUpdateWorkflowDefinitionRequestBody {\n");
    
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

