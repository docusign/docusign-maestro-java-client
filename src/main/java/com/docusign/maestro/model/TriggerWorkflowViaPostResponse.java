package com.docusign.maestro.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.Serializable;

/**
 * Trigger workflow via POST response details.
 *
 */
@Schema(description = "Trigger workflow via POST response details")

public class TriggerWorkflowViaPostResponse implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("instanceId")
  private String instanceId = null;

  @JsonProperty("workflowInstanceUrl")
  private String workflowInstanceUrl = null;


  /**
   * instanceId.
   *
   * @return TriggerWorkflowViaPostResponse
   **/
  public TriggerWorkflowViaPostResponse instanceId(String instanceId) {
    this.instanceId = instanceId;
    return this;
  }

  /**
   * Get instanceId.
   * @return instanceId
   **/
  @Schema(description = "")
  public String getInstanceId() {
    return instanceId;
  }

  /**
   * setInstanceId.
   **/
  public void setInstanceId(String instanceId) {
    this.instanceId = instanceId;
  }


  /**
   * workflowInstanceUrl.
   *
   * @return TriggerWorkflowViaPostResponse
   **/
  public TriggerWorkflowViaPostResponse workflowInstanceUrl(String workflowInstanceUrl) {
    this.workflowInstanceUrl = workflowInstanceUrl;
    return this;
  }

  /**
   * Instance specific url that can be used to be redirected to a workflow instance.
   * @return workflowInstanceUrl
   **/
  @Schema(description = "Instance specific url that can be used to be redirected to a workflow instance")
  public String getWorkflowInstanceUrl() {
    return workflowInstanceUrl;
  }

  /**
   * setWorkflowInstanceUrl.
   **/
  public void setWorkflowInstanceUrl(String workflowInstanceUrl) {
    this.workflowInstanceUrl = workflowInstanceUrl;
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
    TriggerWorkflowViaPostResponse triggerWorkflowViaPostResponse = (TriggerWorkflowViaPostResponse) o;
    return Objects.equals(this.instanceId, triggerWorkflowViaPostResponse.instanceId) &&
        Objects.equals(this.workflowInstanceUrl, triggerWorkflowViaPostResponse.workflowInstanceUrl);
  }

  /**
   * Returns the HashCode.
   */
  @Override
  public int hashCode() {
    return Objects.hash(instanceId, workflowInstanceUrl);
  }


  /**
   * Converts the given object to string.
   */
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TriggerWorkflowViaPostResponse {\n");
    
    sb.append("    instanceId: ").append(toIndentedString(instanceId)).append("\n");
    sb.append("    workflowInstanceUrl: ").append(toIndentedString(workflowInstanceUrl)).append("\n");
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

