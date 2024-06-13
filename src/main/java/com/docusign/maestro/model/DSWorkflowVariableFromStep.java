package com.docusign.maestro.model;

import java.util.Objects;
import java.util.Arrays;
import com.docusign.maestro.model.DSWorkflowVariableSourceTypesStep;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.Serializable;

/**
 * DS Workflow Variable from a Step.
 *
 */
@Schema(description = "DS Workflow Variable from a Step")

public class DSWorkflowVariableFromStep implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("key")
  private String key = null;

  @JsonProperty("propertyName")
  private String propertyName = null;

  @JsonProperty("source")
  private DSWorkflowVariableSourceTypesStep source = null;

  @JsonProperty("stepId")
  private String stepId = null;


  /**
   * key.
   *
   * @return DSWorkflowVariableFromStep
   **/
  public DSWorkflowVariableFromStep key(String key) {
    this.key = key;
    return this;
  }

  /**
   * Get key.
   * @return key
   **/
  @Schema(required = true, description = "")
  public String getKey() {
    return key;
  }

  /**
   * setKey.
   **/
  public void setKey(String key) {
    this.key = key;
  }


  /**
   * propertyName.
   *
   * @return DSWorkflowVariableFromStep
   **/
  public DSWorkflowVariableFromStep propertyName(String propertyName) {
    this.propertyName = propertyName;
    return this;
  }

  /**
   * Get propertyName.
   * @return propertyName
   **/
  @Schema(required = true, description = "")
  public String getPropertyName() {
    return propertyName;
  }

  /**
   * setPropertyName.
   **/
  public void setPropertyName(String propertyName) {
    this.propertyName = propertyName;
  }


  /**
   * source.
   *
   * @return DSWorkflowVariableFromStep
   **/
  public DSWorkflowVariableFromStep source(DSWorkflowVariableSourceTypesStep source) {
    this.source = source;
    return this;
  }

  /**
   * Get source.
   * @return source
   **/
  @Schema(required = true, description = "")
  public DSWorkflowVariableSourceTypesStep getSource() {
    return source;
  }

  /**
   * setSource.
   **/
  public void setSource(DSWorkflowVariableSourceTypesStep source) {
    this.source = source;
  }


  /**
   * stepId.
   *
   * @return DSWorkflowVariableFromStep
   **/
  public DSWorkflowVariableFromStep stepId(String stepId) {
    this.stepId = stepId;
    return this;
  }

  /**
   * Get stepId.
   * @return stepId
   **/
  @Schema(required = true, description = "")
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
    DSWorkflowVariableFromStep dsWorkflowVariableFromStep = (DSWorkflowVariableFromStep) o;
    return Objects.equals(this.key, dsWorkflowVariableFromStep.key) &&
        Objects.equals(this.propertyName, dsWorkflowVariableFromStep.propertyName) &&
        Objects.equals(this.source, dsWorkflowVariableFromStep.source) &&
        Objects.equals(this.stepId, dsWorkflowVariableFromStep.stepId);
  }

  /**
   * Returns the HashCode.
   */
  @Override
  public int hashCode() {
    return Objects.hash(key, propertyName, source, stepId);
  }


  /**
   * Converts the given object to string.
   */
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DSWorkflowVariableFromStep {\n");
    
    sb.append("    key: ").append(toIndentedString(key)).append("\n");
    sb.append("    propertyName: ").append(toIndentedString(propertyName)).append("\n");
    sb.append("    source: ").append(toIndentedString(source)).append("\n");
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

