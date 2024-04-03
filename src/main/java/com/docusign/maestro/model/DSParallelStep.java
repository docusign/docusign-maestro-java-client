package com.docusign.maestro.model;

import java.util.Objects;
import java.util.Arrays;
import com.docusign.maestro.model.DSWorkflowLane;
import com.docusign.maestro.model.DSWorkflowParallelExpression;
import com.docusign.maestro.model.DSWorkflowStepTypesParallel;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;

/**
 * DSParallelStep.
 *
 */

public class DSParallelStep {
  @JsonProperty("expression")
  private DSWorkflowParallelExpression expression = null;

  @JsonProperty("id")
  private String id = null;

  @JsonProperty("lanes")
  private java.util.Map<String, DSWorkflowLane> lanes = new java.util.HashMap<>();

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("type")
  private DSWorkflowStepTypesParallel type = null;


  /**
   * expression.
   *
   * @return DSParallelStep
   **/
  public DSParallelStep expression(DSWorkflowParallelExpression expression) {
    this.expression = expression;
    return this;
  }

  /**
   * Get expression.
   * @return expression
   **/
  @Schema(required = true, description = "")
  public DSWorkflowParallelExpression getExpression() {
    return expression;
  }

  /**
   * setExpression.
   **/
  public void setExpression(DSWorkflowParallelExpression expression) {
    this.expression = expression;
  }


  /**
   * id.
   *
   * @return DSParallelStep
   **/
  public DSParallelStep id(String id) {
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
   * lanes.
   *
   * @return DSParallelStep
   **/
  public DSParallelStep lanes(java.util.Map<String, DSWorkflowLane> lanes) {
    this.lanes = lanes;
    return this;
  }

  /**
   * putLanesItem.
   *
   * @return DSParallelStep
   **/
  public DSParallelStep putLanesItem(String key, DSWorkflowLane lanesItem) {
    this.lanes.put(key, lanesItem);
    return this;
  }

  /**
   * Get lanes.
   * @return lanes
   **/
  @Schema(required = true, description = "")
  public java.util.Map<String, DSWorkflowLane> getLanes() {
    return lanes;
  }

  /**
   * setLanes.
   **/
  public void setLanes(java.util.Map<String, DSWorkflowLane> lanes) {
    this.lanes = lanes;
  }


  /**
   * name.
   *
   * @return DSParallelStep
   **/
  public DSParallelStep name(String name) {
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
   * type.
   *
   * @return DSParallelStep
   **/
  public DSParallelStep type(DSWorkflowStepTypesParallel type) {
    this.type = type;
    return this;
  }

  /**
   * Get type.
   * @return type
   **/
  @Schema(required = true, description = "")
  public DSWorkflowStepTypesParallel getType() {
    return type;
  }

  /**
   * setType.
   **/
  public void setType(DSWorkflowStepTypesParallel type) {
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
    DSParallelStep dsParallelStep = (DSParallelStep) o;
    return Objects.equals(this.expression, dsParallelStep.expression) &&
        Objects.equals(this.id, dsParallelStep.id) &&
        Objects.equals(this.lanes, dsParallelStep.lanes) &&
        Objects.equals(this.name, dsParallelStep.name) &&
        Objects.equals(this.type, dsParallelStep.type);
  }

  /**
   * Returns the HashCode.
   */
  @Override
  public int hashCode() {
    return Objects.hash(expression, id, lanes, name, type);
  }


  /**
   * Converts the given object to string.
   */
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DSParallelStep {\n");
    
    sb.append("    expression: ").append(toIndentedString(expression)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    lanes: ").append(toIndentedString(lanes)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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

