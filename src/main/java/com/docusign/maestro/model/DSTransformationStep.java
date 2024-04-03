package com.docusign.maestro.model;

import java.util.Objects;
import java.util.Arrays;
import com.docusign.maestro.model.DSWorkflowStepTypesDSTransformation;
import com.docusign.maestro.model.RecordToNever;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;

/**
 * DSTransformationStep.
 *
 */

public class DSTransformationStep {
  @JsonProperty("config")
  private RecordToNever config = null;

  @JsonProperty("expression")
  private Object expression = null;

  @JsonProperty("id")
  private String id = null;

  @JsonProperty("input")
  private java.util.Map<String, Object> input = new java.util.HashMap<>();

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("output")
  private java.util.Map<String, Object> output = new java.util.HashMap<>();

  @JsonProperty("type")
  private DSWorkflowStepTypesDSTransformation type = null;


  /**
   * config.
   *
   * @return DSTransformationStep
   **/
  public DSTransformationStep config(RecordToNever config) {
    this.config = config;
    return this;
  }

  /**
   * Get config.
   * @return config
   **/
  @Schema(required = true, description = "")
  public RecordToNever getConfig() {
    return config;
  }

  /**
   * setConfig.
   **/
  public void setConfig(RecordToNever config) {
    this.config = config;
  }


  /**
   * expression.
   *
   * @return DSTransformationStep
   **/
  public DSTransformationStep expression(Object expression) {
    this.expression = expression;
    return this;
  }

  /**
   * Reference of #/definitions/DSWorkflowTransformationExpression. Transformation Expression object. This object should be any of the following object models: [#/definitions/DSWorkflowReplaceExpression, #/definitions/DSWorkflowToLowerExpression, #/definitions/DSWorkflowToUpperExpression, #/components/schemas/DSWorkflowLastIndexOfExpression, #/components/schemas/DSWorkflowIndexOfExpression, #/components/schemas/DSWorkflowSubstringExpression, #/components/schemas/DSWorkflowConcatExpression].
   * @return expression
   **/
  @Schema(required = true, description = "Reference of #/definitions/DSWorkflowTransformationExpression. Transformation Expression object. This object should be any of the following object models: [#/definitions/DSWorkflowReplaceExpression, #/definitions/DSWorkflowToLowerExpression, #/definitions/DSWorkflowToUpperExpression, #/components/schemas/DSWorkflowLastIndexOfExpression, #/components/schemas/DSWorkflowIndexOfExpression, #/components/schemas/DSWorkflowSubstringExpression, #/components/schemas/DSWorkflowConcatExpression]")
  public Object getExpression() {
    return expression;
  }

  /**
   * setExpression.
   **/
  public void setExpression(Object expression) {
    this.expression = expression;
  }


  /**
   * id.
   *
   * @return DSTransformationStep
   **/
  public DSTransformationStep id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Get id.
   * @return id
   **/
  @Schema(required = true, description = "")
  public String getId() {
    return id;
  }

  /**
   * setId.
   **/
  public void setId(String id) {
    this.id = id;
  }


  /**
   * input.
   *
   * @return DSTransformationStep
   **/
  public DSTransformationStep input(java.util.Map<String, Object> input) {
    this.input = input;
    return this;
  }

  /**
   * putInputItem.
   *
   * @return DSTransformationStep
   **/
  public DSTransformationStep putInputItem(String key, Object inputItem) {
    this.input.put(key, inputItem);
    return this;
  }

  /**
   * A Record of strings to Strings, Variables, or Transformation Expressions.
   * @return input
   **/
  @Schema(required = true, description = "A Record of strings to Strings, Variables, or Transformation Expressions")
  public java.util.Map<String, Object> getInput() {
    return input;
  }

  /**
   * setInput.
   **/
  public void setInput(java.util.Map<String, Object> input) {
    this.input = input;
  }


  /**
   * name.
   *
   * @return DSTransformationStep
   **/
  public DSTransformationStep name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Get name.
   * @return name
   **/
  @Schema(required = true, description = "")
  public String getName() {
    return name;
  }

  /**
   * setName.
   **/
  public void setName(String name) {
    this.name = name;
  }


  /**
   * output.
   *
   * @return DSTransformationStep
   **/
  public DSTransformationStep output(java.util.Map<String, Object> output) {
    this.output = output;
    return this;
  }

  /**
   * putOutputItem.
   *
   * @return DSTransformationStep
   **/
  public DSTransformationStep putOutputItem(String key, Object outputItem) {
    this.output.put(key, outputItem);
    return this;
  }

  /**
   * A Record of strings to Strings, Variables, or Transformation Expressions.
   * @return output
   **/
  @Schema(required = true, description = "A Record of strings to Strings, Variables, or Transformation Expressions")
  public java.util.Map<String, Object> getOutput() {
    return output;
  }

  /**
   * setOutput.
   **/
  public void setOutput(java.util.Map<String, Object> output) {
    this.output = output;
  }


  /**
   * type.
   *
   * @return DSTransformationStep
   **/
  public DSTransformationStep type(DSWorkflowStepTypesDSTransformation type) {
    this.type = type;
    return this;
  }

  /**
   * Get type.
   * @return type
   **/
  @Schema(required = true, description = "")
  public DSWorkflowStepTypesDSTransformation getType() {
    return type;
  }

  /**
   * setType.
   **/
  public void setType(DSWorkflowStepTypesDSTransformation type) {
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
    DSTransformationStep dsTransformationStep = (DSTransformationStep) o;
    return Objects.equals(this.config, dsTransformationStep.config) &&
        Objects.equals(this.expression, dsTransformationStep.expression) &&
        Objects.equals(this.id, dsTransformationStep.id) &&
        Objects.equals(this.input, dsTransformationStep.input) &&
        Objects.equals(this.name, dsTransformationStep.name) &&
        Objects.equals(this.output, dsTransformationStep.output) &&
        Objects.equals(this.type, dsTransformationStep.type);
  }

  /**
   * Returns the HashCode.
   */
  @Override
  public int hashCode() {
    return Objects.hash(config, expression, id, input, name, output, type);
  }


  /**
   * Converts the given object to string.
   */
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DSTransformationStep {\n");
    
    sb.append("    config: ").append(toIndentedString(config)).append("\n");
    sb.append("    expression: ").append(toIndentedString(expression)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    input: ").append(toIndentedString(input)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    output: ").append(toIndentedString(output)).append("\n");
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

