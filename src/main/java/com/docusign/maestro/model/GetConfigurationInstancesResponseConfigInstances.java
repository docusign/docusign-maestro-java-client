package com.docusign.maestro.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.Serializable;

/**
 * GetConfigurationInstancesResponseConfigInstances.
 *
 */

public class GetConfigurationInstancesResponseConfigInstances implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("savedValues")
  private Object savedValues = null;

  @JsonProperty("stepId")
  private String stepId = null;


  /**
   * savedValues.
   *
   * @return GetConfigurationInstancesResponseConfigInstances
   **/
  public GetConfigurationInstancesResponseConfigInstances savedValues(Object savedValues) {
    this.savedValues = savedValues;
    return this;
  }

  /**
   * Get savedValues.
   * @return savedValues
   **/
  @Schema(description = "")
  public Object getSavedValues() {
    return savedValues;
  }

  /**
   * setSavedValues.
   **/
  public void setSavedValues(Object savedValues) {
    this.savedValues = savedValues;
  }


  /**
   * stepId.
   *
   * @return GetConfigurationInstancesResponseConfigInstances
   **/
  public GetConfigurationInstancesResponseConfigInstances stepId(String stepId) {
    this.stepId = stepId;
    return this;
  }

  /**
   * Get stepId.
   * @return stepId
   **/
  @Schema(description = "")
  public String getStepId() {
    return stepId;
  }

  /**
   * setStepId.
   **/
  public void setStepId(String stepId) {
    this.stepId = stepId;
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
    GetConfigurationInstancesResponseConfigInstances getConfigurationInstancesResponseConfigInstances = (GetConfigurationInstancesResponseConfigInstances) o;
    return Objects.equals(this.savedValues, getConfigurationInstancesResponseConfigInstances.savedValues) &&
        Objects.equals(this.stepId, getConfigurationInstancesResponseConfigInstances.stepId);
  }

  /**
   * Returns the HashCode.
   */
  @Override
  public int hashCode() {
    return Objects.hash(savedValues, stepId);
  }


  /**
   * Converts the given object to string.
   */
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetConfigurationInstancesResponseConfigInstances {\n");
    
    sb.append("    savedValues: ").append(toIndentedString(savedValues)).append("\n");
    sb.append("    stepId: ").append(toIndentedString(stepId)).append("\n");
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

