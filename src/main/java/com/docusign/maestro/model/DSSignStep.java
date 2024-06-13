package com.docusign.maestro.model;

import java.util.Objects;
import java.util.Arrays;
import com.docusign.maestro.model.DSSignStepInput;
import com.docusign.maestro.model.DSWorkflowStepTypesDSSign;
import com.docusign.maestro.model.RecordToNever;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.Serializable;

/**
 * DSSignStep.
 *
 */

public class DSSignStep implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("config")
  private RecordToNever config = null;

  @JsonProperty("id")
  private String id = null;

  @JsonProperty("input")
  private DSSignStepInput input = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("output")
  private java.util.Map<String, Object> output = new java.util.HashMap<>();

  @JsonProperty("type")
  private DSWorkflowStepTypesDSSign type = null;


  /**
   * config.
   *
   * @return DSSignStep
   **/
  public DSSignStep config(RecordToNever config) {
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
   * id.
   *
   * @return DSSignStep
   **/
  public DSSignStep id(String id) {
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
   * @return DSSignStep
   **/
  public DSSignStep input(DSSignStepInput input) {
    this.input = input;
    return this;
  }

  /**
   * Get input.
   * @return input
   **/
  @Schema(required = true, description = "")
  public DSSignStepInput getInput() {
    return input;
  }

  /**
   * setInput.
   **/
  public void setInput(DSSignStepInput input) {
    this.input = input;
  }


  /**
   * name.
   *
   * @return DSSignStep
   **/
  public DSSignStep name(String name) {
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
   * @return DSSignStep
   **/
  public DSSignStep output(java.util.Map<String, Object> output) {
    this.output = output;
    return this;
  }

  /**
   * putOutputItem.
   *
   * @return DSSignStep
   **/
  public DSSignStep putOutputItem(String key, Object outputItem) {
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
   * @return DSSignStep
   **/
  public DSSignStep type(DSWorkflowStepTypesDSSign type) {
    this.type = type;
    return this;
  }

  /**
   * Get type.
   * @return type
   **/
  @Schema(required = true, description = "")
  public DSWorkflowStepTypesDSSign getType() {
    return type;
  }

  /**
   * setType.
   **/
  public void setType(DSWorkflowStepTypesDSSign type) {
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
    DSSignStep dsSignStep = (DSSignStep) o;
    return Objects.equals(this.config, dsSignStep.config) &&
        Objects.equals(this.id, dsSignStep.id) &&
        Objects.equals(this.input, dsSignStep.input) &&
        Objects.equals(this.name, dsSignStep.name) &&
        Objects.equals(this.output, dsSignStep.output) &&
        Objects.equals(this.type, dsSignStep.type);
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
    sb.append("class DSSignStep {\n");
    
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

