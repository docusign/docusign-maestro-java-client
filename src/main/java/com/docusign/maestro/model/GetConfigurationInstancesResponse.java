package com.docusign.maestro.model;

import java.util.Objects;
import java.util.Arrays;
import com.docusign.maestro.model.GetConfigurationInstancesResponseConfigInstances;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import java.math.BigDecimal;

/**
 * GetConfigurationInstancesResponse.
 *
 */

public class GetConfigurationInstancesResponse {
  @JsonProperty("configInstances")
  private java.util.List<GetConfigurationInstancesResponseConfigInstances> configInstances = null;

  @JsonProperty("count")
  private BigDecimal count = null;

  @JsonProperty("workflowDefinitionId")
  private String workflowDefinitionId = null;


  /**
   * configInstances.
   *
   * @return GetConfigurationInstancesResponse
   **/
  public GetConfigurationInstancesResponse configInstances(java.util.List<GetConfigurationInstancesResponseConfigInstances> configInstances) {
    this.configInstances = configInstances;
    return this;
  }
  
  /**
   * addConfigInstancesItem.
   *
   * @return GetConfigurationInstancesResponse
   **/
  public GetConfigurationInstancesResponse addConfigInstancesItem(GetConfigurationInstancesResponseConfigInstances configInstancesItem) {
    if (this.configInstances == null) {
      this.configInstances = new java.util.ArrayList<>();
    }
    this.configInstances.add(configInstancesItem);
    return this;
  }

  /**
   * Get configInstances.
   * @return configInstances
   **/
  @Schema(description = "")
  public java.util.List<GetConfigurationInstancesResponseConfigInstances> getConfigInstances() {
    return configInstances;
  }

  /**
   * setConfigInstances.
   **/
  public void setConfigInstances(java.util.List<GetConfigurationInstancesResponseConfigInstances> configInstances) {
    this.configInstances = configInstances;
  }


  /**
   * count.
   *
   * @return GetConfigurationInstancesResponse
   **/
  public GetConfigurationInstancesResponse count(BigDecimal count) {
    this.count = count;
    return this;
  }

  /**
   * Get count.
   * @return count
   **/
  @Schema(description = "")
  public BigDecimal getCount() {
    return count;
  }

  /**
   * setCount.
   **/
  public void setCount(BigDecimal count) {
    this.count = count;
  }


  /**
   * workflowDefinitionId.
   *
   * @return GetConfigurationInstancesResponse
   **/
  public GetConfigurationInstancesResponse workflowDefinitionId(String workflowDefinitionId) {
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
    GetConfigurationInstancesResponse getConfigurationInstancesResponse = (GetConfigurationInstancesResponse) o;
    return Objects.equals(this.configInstances, getConfigurationInstancesResponse.configInstances) &&
        Objects.equals(this.count, getConfigurationInstancesResponse.count) &&
        Objects.equals(this.workflowDefinitionId, getConfigurationInstancesResponse.workflowDefinitionId);
  }

  /**
   * Returns the HashCode.
   */
  @Override
  public int hashCode() {
    return Objects.hash(configInstances, count, workflowDefinitionId);
  }


  /**
   * Converts the given object to string.
   */
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetConfigurationInstancesResponse {\n");
    
    sb.append("    configInstances: ").append(toIndentedString(configInstances)).append("\n");
    sb.append("    count: ").append(toIndentedString(count)).append("\n");
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

