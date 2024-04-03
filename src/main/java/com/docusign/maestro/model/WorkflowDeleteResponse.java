package com.docusign.maestro.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;

/**
 * WorkflowDeleteResponse.
 *
 */

public class WorkflowDeleteResponse {
  @JsonProperty("pollUrl")
  private String pollUrl = null;

  @JsonProperty("workflowDefinitionId")
  private String workflowDefinitionId = null;


  /**
   * pollUrl.
   *
   * @return WorkflowDeleteResponse
   **/
  public WorkflowDeleteResponse pollUrl(String pollUrl) {
    this.pollUrl = pollUrl;
    return this;
  }

  /**
   * Get pollUrl.
   * @return pollUrl
   **/
  @Schema(required = true, description = "")
  public String getPollUrl() {
    return pollUrl;
  }

  /**
   * setPollUrl.
   **/
  public void setPollUrl(String pollUrl) {
    this.pollUrl = pollUrl;
  }


  /**
   * workflowDefinitionId.
   *
   * @return WorkflowDeleteResponse
   **/
  public WorkflowDeleteResponse workflowDefinitionId(String workflowDefinitionId) {
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
    WorkflowDeleteResponse workflowDeleteResponse = (WorkflowDeleteResponse) o;
    return Objects.equals(this.pollUrl, workflowDeleteResponse.pollUrl) &&
        Objects.equals(this.workflowDefinitionId, workflowDeleteResponse.workflowDefinitionId);
  }

  /**
   * Returns the HashCode.
   */
  @Override
  public int hashCode() {
    return Objects.hash(pollUrl, workflowDefinitionId);
  }


  /**
   * Converts the given object to string.
   */
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WorkflowDeleteResponse {\n");
    
    sb.append("    pollUrl: ").append(toIndentedString(pollUrl)).append("\n");
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

