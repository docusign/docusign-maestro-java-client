package com.docusign.maestro.model;

import java.util.Objects;
import java.util.Arrays;
import com.docusign.maestro.model.DSWorkflowComparisonExpression;
import com.docusign.maestro.model.DSWorkflowStepTypesLoop;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.Serializable;

/**
 * DSLoopStep.
 *
 */

public class DSLoopStep implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("expression")
  private DSWorkflowComparisonExpression expression = null;

  @JsonProperty("id")
  private String id = null;

  @JsonProperty("loopSteps")
  private java.util.List<Object> loopSteps = new java.util.ArrayList<>();

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("type")
  private DSWorkflowStepTypesLoop type = null;


  /**
   * expression.
   *
   * @return DSLoopStep
   **/
  public DSLoopStep expression(DSWorkflowComparisonExpression expression) {
    this.expression = expression;
    return this;
  }

  /**
   * Get expression.
   * @return expression
   **/
  @Schema(required = true, description = "")
  public DSWorkflowComparisonExpression getExpression() {
    return expression;
  }

  /**
   * setExpression.
   **/
  public void setExpression(DSWorkflowComparisonExpression expression) {
    this.expression = expression;
  }


  /**
   * id.
   *
   * @return DSLoopStep
   **/
  public DSLoopStep id(String id) {
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
   * loopSteps.
   *
   * @return DSLoopStep
   **/
  public DSLoopStep loopSteps(java.util.List<Object> loopSteps) {
    this.loopSteps = loopSteps;
    return this;
  }
  
  /**
   * addLoopStepsItem.
   *
   * @return DSLoopStep
   **/
  public DSLoopStep addLoopStepsItem(Object loopStepsItem) {
    this.loopSteps.add(loopStepsItem);
    return this;
  }

  /**
   * A list of #/definitions/DSWorkflowStep. Each element is: A DS Workflow Step. This object should be any of the following object models: [#/definitions/DSServiceStep, #/definitions/DSTransformationStep, #/definitions/DSDocGenStep, #/definitions/DSSignStep].
   * @return loopSteps
   **/
  @Schema(required = true, description = "A list of #/definitions/DSWorkflowStep. Each element is: A DS Workflow Step. This object should be any of the following object models: [#/definitions/DSServiceStep, #/definitions/DSTransformationStep, #/definitions/DSDocGenStep, #/definitions/DSSignStep]")
  public java.util.List<Object> getLoopSteps() {
    return loopSteps;
  }

  /**
   * setLoopSteps.
   **/
  public void setLoopSteps(java.util.List<Object> loopSteps) {
    this.loopSteps = loopSteps;
  }


  /**
   * name.
   *
   * @return DSLoopStep
   **/
  public DSLoopStep name(String name) {
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
   * @return DSLoopStep
   **/
  public DSLoopStep type(DSWorkflowStepTypesLoop type) {
    this.type = type;
    return this;
  }

  /**
   * Get type.
   * @return type
   **/
  @Schema(required = true, description = "")
  public DSWorkflowStepTypesLoop getType() {
    return type;
  }

  /**
   * setType.
   **/
  public void setType(DSWorkflowStepTypesLoop type) {
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
    DSLoopStep dsLoopStep = (DSLoopStep) o;
    return Objects.equals(this.expression, dsLoopStep.expression) &&
        Objects.equals(this.id, dsLoopStep.id) &&
        Objects.equals(this.loopSteps, dsLoopStep.loopSteps) &&
        Objects.equals(this.name, dsLoopStep.name) &&
        Objects.equals(this.type, dsLoopStep.type);
  }

  /**
   * Returns the HashCode.
   */
  @Override
  public int hashCode() {
    return Objects.hash(expression, id, loopSteps, name, type);
  }


  /**
   * Converts the given object to string.
   */
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DSLoopStep {\n");
    
    sb.append("    expression: ").append(toIndentedString(expression)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    loopSteps: ").append(toIndentedString(loopSteps)).append("\n");
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

