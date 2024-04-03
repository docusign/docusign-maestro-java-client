package com.docusign.maestro.model;

import java.util.Objects;
import java.util.Arrays;
import com.docusign.maestro.model.DSWorkflowTransformationExpressionTypesConcatExpression;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;

/**
 * DSWorkflowConcatExpression.
 *
 */

public class DSWorkflowConcatExpression {
  @JsonProperty("inputs")
  private java.util.List<Object> inputs = null;

  @JsonProperty("type")
  private DSWorkflowTransformationExpressionTypesConcatExpression type = null;


  /**
   * inputs.
   *
   * @return DSWorkflowConcatExpression
   **/
  public DSWorkflowConcatExpression inputs(java.util.List<Object> inputs) {
    this.inputs = inputs;
    return this;
  }
  
  /**
   * addInputsItem.
   *
   * @return DSWorkflowConcatExpression
   **/
  public DSWorkflowConcatExpression addInputsItem(Object inputsItem) {
    if (this.inputs == null) {
      this.inputs = new java.util.ArrayList<>();
    }
    this.inputs.add(inputsItem);
    return this;
  }

  /**
   * A list of #/definitions/StringOrVariableOrTransformation. Each element is: Object stands for a String or a Variable or a Transformation. This object should be any of the following object models or types: [string, #/definitions/DSWorkflowVariable, #/definitions/DSWorkflowTransformationExpression].
   * @return inputs
   **/
  @Schema(description = "A list of #/definitions/StringOrVariableOrTransformation. Each element is: Object stands for a String or a Variable or a Transformation. This object should be any of the following object models or types: [string, #/definitions/DSWorkflowVariable, #/definitions/DSWorkflowTransformationExpression]")
  public java.util.List<Object> getInputs() {
    return inputs;
  }

  /**
   * setInputs.
   **/
  public void setInputs(java.util.List<Object> inputs) {
    this.inputs = inputs;
  }


  /**
   * type.
   *
   * @return DSWorkflowConcatExpression
   **/
  public DSWorkflowConcatExpression type(DSWorkflowTransformationExpressionTypesConcatExpression type) {
    this.type = type;
    return this;
  }

  /**
   * Get type.
   * @return type
   **/
  @Schema(required = true, description = "")
  public DSWorkflowTransformationExpressionTypesConcatExpression getType() {
    return type;
  }

  /**
   * setType.
   **/
  public void setType(DSWorkflowTransformationExpressionTypesConcatExpression type) {
    this.type = type;
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
    DSWorkflowConcatExpression dsWorkflowConcatExpression = (DSWorkflowConcatExpression) o;
    return Objects.equals(this.inputs, dsWorkflowConcatExpression.inputs) &&
        Objects.equals(this.type, dsWorkflowConcatExpression.type);
  }

  /**
   * Returns the HashCode.
   */
  @Override
  public int hashCode() {
    return Objects.hash(inputs, type);
  }


  /**
   * Converts the given object to string.
   */
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DSWorkflowConcatExpression {\n");
    
    sb.append("    inputs: ").append(toIndentedString(inputs)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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

