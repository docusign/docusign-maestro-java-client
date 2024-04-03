package com.docusign.maestro.model;

import java.util.Objects;
import java.util.Arrays;
import com.docusign.maestro.model.DeployStatus;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;

/**
 * DeployRequest.
 *
 */

public class DeployRequest {
  @JsonProperty("deploymentStatus")
  private DeployStatus deploymentStatus = null;


  /**
   * deploymentStatus.
   *
   * @return DeployRequest
   **/
  public DeployRequest deploymentStatus(DeployStatus deploymentStatus) {
    this.deploymentStatus = deploymentStatus;
    return this;
  }

  /**
   * Get deploymentStatus.
   * @return deploymentStatus
   **/
  @Schema(required = true, description = "")
  public DeployStatus getDeploymentStatus() {
    return deploymentStatus;
  }

  /**
   * setDeploymentStatus.
   **/
  public void setDeploymentStatus(DeployStatus deploymentStatus) {
    this.deploymentStatus = deploymentStatus;
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
    DeployRequest deployRequest = (DeployRequest) o;
    return Objects.equals(this.deploymentStatus, deployRequest.deploymentStatus);
  }

  /**
   * Returns the HashCode.
   */
  @Override
  public int hashCode() {
    return Objects.hash(deploymentStatus);
  }


  /**
   * Converts the given object to string.
   */
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DeployRequest {\n");
    
    sb.append("    deploymentStatus: ").append(toIndentedString(deploymentStatus)).append("\n");
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

