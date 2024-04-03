package com.docusign.maestro.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;

/**
 * DSWorkflowLane.
 *
 */

public class DSWorkflowLane {
  @JsonProperty("laneId")
  private String laneId = null;

  @JsonProperty("laneSteps")
  private java.util.List<Object> laneSteps = new java.util.ArrayList<>();


  /**
   * laneId.
   *
   * @return DSWorkflowLane
   **/
  public DSWorkflowLane laneId(String laneId) {
    this.laneId = laneId;
    return this;
  }

  /**
   * Get laneId.
   * @return laneId
   **/
  @Schema(required = true, description = "")
  public String getLaneId() {
    return laneId;
  }

  /**
   * setLaneId.
   **/
  public void setLaneId(String laneId) {
    this.laneId = laneId;
  }


  /**
   * laneSteps.
   *
   * @return DSWorkflowLane
   **/
  public DSWorkflowLane laneSteps(java.util.List<Object> laneSteps) {
    this.laneSteps = laneSteps;
    return this;
  }
  
  /**
   * addLaneStepsItem.
   *
   * @return DSWorkflowLane
   **/
  public DSWorkflowLane addLaneStepsItem(Object laneStepsItem) {
    this.laneSteps.add(laneStepsItem);
    return this;
  }

  /**
   * A list of #/definitions/DSWorkflowStep. Each element is: A DS Workflow Step. This object should be any of the following object models: [#/definitions/DSServiceStep, #/definitions/DSTransformationStep, #/definitions/DSDocGenStep, #/definitions/DSSignStep].
   * @return laneSteps
   **/
  @Schema(required = true, description = "A list of #/definitions/DSWorkflowStep. Each element is: A DS Workflow Step. This object should be any of the following object models: [#/definitions/DSServiceStep, #/definitions/DSTransformationStep, #/definitions/DSDocGenStep, #/definitions/DSSignStep]")
  public java.util.List<Object> getLaneSteps() {
    return laneSteps;
  }

  /**
   * setLaneSteps.
   **/
  public void setLaneSteps(java.util.List<Object> laneSteps) {
    this.laneSteps = laneSteps;
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
    DSWorkflowLane dsWorkflowLane = (DSWorkflowLane) o;
    return Objects.equals(this.laneId, dsWorkflowLane.laneId) &&
        Objects.equals(this.laneSteps, dsWorkflowLane.laneSteps);
  }

  /**
   * Returns the HashCode.
   */
  @Override
  public int hashCode() {
    return Objects.hash(laneId, laneSteps);
  }


  /**
   * Converts the given object to string.
   */
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DSWorkflowLane {\n");
    
    sb.append("    laneId: ").append(toIndentedString(laneId)).append("\n");
    sb.append("    laneSteps: ").append(toIndentedString(laneSteps)).append("\n");
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

