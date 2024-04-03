package com.docusign.maestro.model;

import java.util.Objects;
import java.util.Arrays;
import com.docusign.maestro.model.DSIdvStepInput;
import com.docusign.maestro.model.DSWorkflowStepTypesDSIdv;
import com.docusign.maestro.model.RecordToNever;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;

/**
 * DSIdvStep.
 *
 */

public class DSIdvStep {
  @JsonProperty("config")
  private RecordToNever config = null;

  @JsonProperty("id")
  private String id = null;

  @JsonProperty("input")
  private DSIdvStepInput input = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("output")
  private java.util.Map<String, Object> output = new java.util.HashMap<>();

  @JsonProperty("type")
  private DSWorkflowStepTypesDSIdv type = null;


  /**
   * config.
   *
   * @return DSIdvStep
   **/
  public DSIdvStep config(RecordToNever config) {
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
   * @return DSIdvStep
   **/
  public DSIdvStep id(String id) {
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
   * @return DSIdvStep
   **/
  public DSIdvStep input(DSIdvStepInput input) {
    this.input = input;
    return this;
  }

  /**
   * Get input.
   * @return input
   **/
  @Schema(required = true, description = "")
  public DSIdvStepInput getInput() {
    return input;
  }

  /**
   * setInput.
   **/
  public void setInput(DSIdvStepInput input) {
    this.input = input;
  }


  /**
   * name.
   *
   * @return DSIdvStep
   **/
  public DSIdvStep name(String name) {
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
   * @return DSIdvStep
   **/
  public DSIdvStep output(java.util.Map<String, Object> output) {
    this.output = output;
    return this;
  }

  /**
   * putOutputItem.
   *
   * @return DSIdvStep
   **/
  public DSIdvStep putOutputItem(String key, Object outputItem) {
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
   * @return DSIdvStep
   **/
  public DSIdvStep type(DSWorkflowStepTypesDSIdv type) {
    this.type = type;
    return this;
  }

  /**
   * Get type.
   * @return type
   **/
  @Schema(required = true, description = "")
  public DSWorkflowStepTypesDSIdv getType() {
    return type;
  }

  /**
   * setType.
   **/
  public void setType(DSWorkflowStepTypesDSIdv type) {
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
    DSIdvStep dsIdvStep = (DSIdvStep) o;
    return Objects.equals(this.config, dsIdvStep.config) &&
        Objects.equals(this.id, dsIdvStep.id) &&
        Objects.equals(this.input, dsIdvStep.input) &&
        Objects.equals(this.name, dsIdvStep.name) &&
        Objects.equals(this.output, dsIdvStep.output) &&
        Objects.equals(this.type, dsIdvStep.type);
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
    sb.append("class DSIdvStep {\n");
    
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

