package com.docusign.maestro.model;

import java.util.Objects;
import java.util.Arrays;
import com.docusign.maestro.model.DSWorkflowVariableSourceTypesVariable;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;

/**
 * DS Workflow Variable from a Variable.
 *
 */
@Schema(description = "DS Workflow Variable from a Variable")

public class DSWorkflowVariableFromVariable {
  @JsonProperty("key")
  private String key = null;

  @JsonProperty("propertyName")
  private String propertyName = null;

  @JsonProperty("source")
  private DSWorkflowVariableSourceTypesVariable source = null;

  @JsonProperty("stepId")
  private String stepId = null;


  /**
   * key.
   *
   * @return DSWorkflowVariableFromVariable
   **/
  public DSWorkflowVariableFromVariable key(String key) {
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
   * @return DSWorkflowVariableFromVariable
   **/
  public DSWorkflowVariableFromVariable propertyName(String propertyName) {
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
   * @return DSWorkflowVariableFromVariable
   **/
  public DSWorkflowVariableFromVariable source(DSWorkflowVariableSourceTypesVariable source) {
    this.source = source;
    return this;
  }

  /**
   * Get source.
   * @return source
   **/
  @Schema(required = true, description = "")
  public DSWorkflowVariableSourceTypesVariable getSource() {
    return source;
  }

  /**
   * setSource.
   **/
  public void setSource(DSWorkflowVariableSourceTypesVariable source) {
    this.source = source;
  }


  /**
   * stepId.
   *
   * @return DSWorkflowVariableFromVariable
   **/
  public DSWorkflowVariableFromVariable stepId(String stepId) {
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
    DSWorkflowVariableFromVariable dsWorkflowVariableFromVariable = (DSWorkflowVariableFromVariable) o;
    return Objects.equals(this.key, dsWorkflowVariableFromVariable.key) &&
        Objects.equals(this.propertyName, dsWorkflowVariableFromVariable.propertyName) &&
        Objects.equals(this.source, dsWorkflowVariableFromVariable.source) &&
        Objects.equals(this.stepId, dsWorkflowVariableFromVariable.stepId);
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
    sb.append("class DSWorkflowVariableFromVariable {\n");
    
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

