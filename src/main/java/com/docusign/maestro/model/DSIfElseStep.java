package com.docusign.maestro.model;

import java.util.Objects;
import java.util.Arrays;
import com.docusign.maestro.model.DSWorkflowBooleanExpression;
import com.docusign.maestro.model.DSWorkflowStepTypesDSIfElse;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;

/**
 * DSIfElseStep.
 *
 */

public class DSIfElseStep {
  @JsonProperty("elseSteps")
  private java.util.List<Object> elseSteps = new java.util.ArrayList<>();

  @JsonProperty("expression")
  private DSWorkflowBooleanExpression expression = null;

  @JsonProperty("id")
  private String id = null;

  @JsonProperty("ifSteps")
  private java.util.List<Object> ifSteps = new java.util.ArrayList<>();

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("type")
  private DSWorkflowStepTypesDSIfElse type = null;


  /**
   * elseSteps.
   *
   * @return DSIfElseStep
   **/
  public DSIfElseStep elseSteps(java.util.List<Object> elseSteps) {
    this.elseSteps = elseSteps;
    return this;
  }
  
  /**
   * addElseStepsItem.
   *
   * @return DSIfElseStep
   **/
  public DSIfElseStep addElseStepsItem(Object elseStepsItem) {
    this.elseSteps.add(elseStepsItem);
    return this;
  }

  /**
   * A list of #/definitions/DSWorkflowStep. Each element is: A DS Workflow Step. This object should be any of the following object models: [#/definitions/DSServiceStep, #/definitions/DSTransformationStep, #/definitions/DSDocGenStep, #/definitions/DSSignStep].
   * @return elseSteps
   **/
  @Schema(required = true, description = "A list of #/definitions/DSWorkflowStep. Each element is: A DS Workflow Step. This object should be any of the following object models: [#/definitions/DSServiceStep, #/definitions/DSTransformationStep, #/definitions/DSDocGenStep, #/definitions/DSSignStep]")
  public java.util.List<Object> getElseSteps() {
    return elseSteps;
  }

  /**
   * setElseSteps.
   **/
  public void setElseSteps(java.util.List<Object> elseSteps) {
    this.elseSteps = elseSteps;
  }


  /**
   * expression.
   *
   * @return DSIfElseStep
   **/
  public DSIfElseStep expression(DSWorkflowBooleanExpression expression) {
    this.expression = expression;
    return this;
  }

  /**
   * Get expression.
   * @return expression
   **/
  @Schema(required = true, description = "")
  public DSWorkflowBooleanExpression getExpression() {
    return expression;
  }

  /**
   * setExpression.
   **/
  public void setExpression(DSWorkflowBooleanExpression expression) {
    this.expression = expression;
  }


  /**
   * id.
   *
   * @return DSIfElseStep
   **/
  public DSIfElseStep id(String id) {
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
   * ifSteps.
   *
   * @return DSIfElseStep
   **/
  public DSIfElseStep ifSteps(java.util.List<Object> ifSteps) {
    this.ifSteps = ifSteps;
    return this;
  }
  
  /**
   * addIfStepsItem.
   *
   * @return DSIfElseStep
   **/
  public DSIfElseStep addIfStepsItem(Object ifStepsItem) {
    this.ifSteps.add(ifStepsItem);
    return this;
  }

  /**
   * A list of #/definitions/DSWorkflowStep. Each element is: A DS Workflow Step. This object should be any of the following object models: [#/definitions/DSServiceStep, #/definitions/DSTransformationStep, #/definitions/DSDocGenStep, #/definitions/DSSignStep].
   * @return ifSteps
   **/
  @Schema(required = true, description = "A list of #/definitions/DSWorkflowStep. Each element is: A DS Workflow Step. This object should be any of the following object models: [#/definitions/DSServiceStep, #/definitions/DSTransformationStep, #/definitions/DSDocGenStep, #/definitions/DSSignStep]")
  public java.util.List<Object> getIfSteps() {
    return ifSteps;
  }

  /**
   * setIfSteps.
   **/
  public void setIfSteps(java.util.List<Object> ifSteps) {
    this.ifSteps = ifSteps;
  }


  /**
   * name.
   *
   * @return DSIfElseStep
   **/
  public DSIfElseStep name(String name) {
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
   * @return DSIfElseStep
   **/
  public DSIfElseStep type(DSWorkflowStepTypesDSIfElse type) {
    this.type = type;
    return this;
  }

  /**
   * Get type.
   * @return type
   **/
  @Schema(required = true, description = "")
  public DSWorkflowStepTypesDSIfElse getType() {
    return type;
  }

  /**
   * setType.
   **/
  public void setType(DSWorkflowStepTypesDSIfElse type) {
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
    DSIfElseStep dsIfElseStep = (DSIfElseStep) o;
    return Objects.equals(this.elseSteps, dsIfElseStep.elseSteps) &&
        Objects.equals(this.expression, dsIfElseStep.expression) &&
        Objects.equals(this.id, dsIfElseStep.id) &&
        Objects.equals(this.ifSteps, dsIfElseStep.ifSteps) &&
        Objects.equals(this.name, dsIfElseStep.name) &&
        Objects.equals(this.type, dsIfElseStep.type);
  }

  /**
   * Returns the HashCode.
   */
  @Override
  public int hashCode() {
    return Objects.hash(elseSteps, expression, id, ifSteps, name, type);
  }


  /**
   * Converts the given object to string.
   */
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DSIfElseStep {\n");
    
    sb.append("    elseSteps: ").append(toIndentedString(elseSteps)).append("\n");
    sb.append("    expression: ").append(toIndentedString(expression)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    ifSteps: ").append(toIndentedString(ifSteps)).append("\n");
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

