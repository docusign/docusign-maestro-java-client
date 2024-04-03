package com.docusign.maestro.model;

import java.util.Objects;
import java.util.Arrays;
import com.docusign.maestro.model.DSWebFormsStepConfig;
import com.docusign.maestro.model.DSWorkflowStepTypesDSWebForms;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;

/**
 * A DS Workflow WebForms Step.
 *
 */
@Schema(description = "A DS Workflow WebForms Step")

public class DSWebFormsStep {
  @JsonProperty("config")
  private DSWebFormsStepConfig config = null;

  @JsonProperty("id")
  private String id = null;

  @JsonProperty("input")
  private java.util.Map<String, Object> input = new java.util.HashMap<>();

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("output")
  private java.util.Map<String, Object> output = new java.util.HashMap<>();

  @JsonProperty("type")
  private DSWorkflowStepTypesDSWebForms type = null;


  /**
   * config.
   *
   * @return DSWebFormsStep
   **/
  public DSWebFormsStep config(DSWebFormsStepConfig config) {
    this.config = config;
    return this;
  }

  /**
   * Get config.
   * @return config
   **/
  @Schema(required = true, description = "")
  public DSWebFormsStepConfig getConfig() {
    return config;
  }

  /**
   * setConfig.
   **/
  public void setConfig(DSWebFormsStepConfig config) {
    this.config = config;
  }


  /**
   * id.
   *
   * @return DSWebFormsStep
   **/
  public DSWebFormsStep id(String id) {
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
   * @return DSWebFormsStep
   **/
  public DSWebFormsStep input(java.util.Map<String, Object> input) {
    this.input = input;
    return this;
  }

  /**
   * putInputItem.
   *
   * @return DSWebFormsStep
   **/
  public DSWebFormsStep putInputItem(String key, Object inputItem) {
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
   * @return DSWebFormsStep
   **/
  public DSWebFormsStep name(String name) {
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
   * @return DSWebFormsStep
   **/
  public DSWebFormsStep output(java.util.Map<String, Object> output) {
    this.output = output;
    return this;
  }

  /**
   * putOutputItem.
   *
   * @return DSWebFormsStep
   **/
  public DSWebFormsStep putOutputItem(String key, Object outputItem) {
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
   * @return DSWebFormsStep
   **/
  public DSWebFormsStep type(DSWorkflowStepTypesDSWebForms type) {
    this.type = type;
    return this;
  }

  /**
   * Get type.
   * @return type
   **/
  @Schema(required = true, description = "")
  public DSWorkflowStepTypesDSWebForms getType() {
    return type;
  }

  /**
   * setType.
   **/
  public void setType(DSWorkflowStepTypesDSWebForms type) {
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
    DSWebFormsStep dsWebFormsStep = (DSWebFormsStep) o;
    return Objects.equals(this.config, dsWebFormsStep.config) &&
        Objects.equals(this.id, dsWebFormsStep.id) &&
        Objects.equals(this.input, dsWebFormsStep.input) &&
        Objects.equals(this.name, dsWebFormsStep.name) &&
        Objects.equals(this.output, dsWebFormsStep.output) &&
        Objects.equals(this.type, dsWebFormsStep.type);
  }

  /**
   * Returns the HashCode.
   */
  @Override
  public int hashCode() {
    return Objects.hash(config, id, input, name, output, type);
  }


  /**
   * Converts the given object to string.
   */
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DSWebFormsStep {\n");
    
    sb.append("    config: ").append(toIndentedString(config)).append("\n");
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

