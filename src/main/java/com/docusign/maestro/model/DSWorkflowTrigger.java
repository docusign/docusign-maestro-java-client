package com.docusign.maestro.model;

import java.util.Objects;
import java.util.Arrays;
import com.docusign.maestro.model.DSWorkflowTriggerTypes;
import com.docusign.maestro.model.EventTypes;
import com.docusign.maestro.model.HttpTypes;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;

/**
 * A DS workflow trigger..
 *
 */
@Schema(description = "A DS workflow trigger.")

public class DSWorkflowTrigger {
  @JsonProperty("eventType")
  private EventTypes eventType = null;

  @JsonProperty("httpType")
  private HttpTypes httpType = null;

  @JsonProperty("id")
  private String id = null;

  @JsonProperty("input")
  private java.util.Map<String, Object> input = new java.util.HashMap<>();

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("output")
  private java.util.Map<String, Object> output = new java.util.HashMap<>();

  @JsonProperty("type")
  private DSWorkflowTriggerTypes type = null;


  /**
   * eventType.
   *
   * @return DSWorkflowTrigger
   **/
  public DSWorkflowTrigger eventType(EventTypes eventType) {
    this.eventType = eventType;
    return this;
  }

  /**
   * Get eventType.
   * @return eventType
   **/
  @Schema(description = "")
  public EventTypes getEventType() {
    return eventType;
  }

  /**
   * setEventType.
   **/
  public void setEventType(EventTypes eventType) {
    this.eventType = eventType;
  }


  /**
   * httpType.
   *
   * @return DSWorkflowTrigger
   **/
  public DSWorkflowTrigger httpType(HttpTypes httpType) {
    this.httpType = httpType;
    return this;
  }

  /**
   * Get httpType.
   * @return httpType
   **/
  @Schema(required = true, description = "")
  public HttpTypes getHttpType() {
    return httpType;
  }

  /**
   * setHttpType.
   **/
  public void setHttpType(HttpTypes httpType) {
    this.httpType = httpType;
  }


  /**
   * id.
   *
   * @return DSWorkflowTrigger
   **/
  public DSWorkflowTrigger id(String id) {
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
   * @return DSWorkflowTrigger
   **/
  public DSWorkflowTrigger input(java.util.Map<String, Object> input) {
    this.input = input;
    return this;
  }

  /**
   * putInputItem.
   *
   * @return DSWorkflowTrigger
   **/
  public DSWorkflowTrigger putInputItem(String key, Object inputItem) {
    this.input.put(key, inputItem);
    return this;
  }

  /**
   * A DS Workflow variable record.
   * @return input
   **/
  @Schema(required = true, description = "A DS Workflow variable record")
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
   * @return DSWorkflowTrigger
   **/
  public DSWorkflowTrigger name(String name) {
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
   * @return DSWorkflowTrigger
   **/
  public DSWorkflowTrigger output(java.util.Map<String, Object> output) {
    this.output = output;
    return this;
  }

  /**
   * putOutputItem.
   *
   * @return DSWorkflowTrigger
   **/
  public DSWorkflowTrigger putOutputItem(String key, Object outputItem) {
    this.output.put(key, outputItem);
    return this;
  }

  /**
   * A DS Workflow variable record.
   * @return output
   **/
  @Schema(required = true, description = "A DS Workflow variable record")
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
   * @return DSWorkflowTrigger
   **/
  public DSWorkflowTrigger type(DSWorkflowTriggerTypes type) {
    this.type = type;
    return this;
  }

  /**
   * Get type.
   * @return type
   **/
  @Schema(required = true, description = "")
  public DSWorkflowTriggerTypes getType() {
    return type;
  }

  /**
   * setType.
   **/
  public void setType(DSWorkflowTriggerTypes type) {
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
    DSWorkflowTrigger dsWorkflowTrigger = (DSWorkflowTrigger) o;
    return Objects.equals(this.eventType, dsWorkflowTrigger.eventType) &&
        Objects.equals(this.httpType, dsWorkflowTrigger.httpType) &&
        Objects.equals(this.id, dsWorkflowTrigger.id) &&
        Objects.equals(this.input, dsWorkflowTrigger.input) &&
        Objects.equals(this.name, dsWorkflowTrigger.name) &&
        Objects.equals(this.output, dsWorkflowTrigger.output) &&
        Objects.equals(this.type, dsWorkflowTrigger.type);
  }

  /**
   * Returns the HashCode.
   */
  @Override
  public int hashCode() {
    return Objects.hash(eventType, httpType, id, input, name, output, type);
  }


  /**
   * Converts the given object to string.
   */
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DSWorkflowTrigger {\n");
    
    sb.append("    eventType: ").append(toIndentedString(eventType)).append("\n");
    sb.append("    httpType: ").append(toIndentedString(httpType)).append("\n");
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

