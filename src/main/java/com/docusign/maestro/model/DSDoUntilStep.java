package com.docusign.maestro.model;

import java.util.Objects;
import java.util.Arrays;
import com.docusign.maestro.model.DSWorkflowComparisonExpression;
import com.docusign.maestro.model.DSWorkflowStepTypesDoUntil;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;

/**
 * DSDoUntilStep.
 *
 */

public class DSDoUntilStep {
  @JsonProperty("doSteps")
  private java.util.List<Object> doSteps = new java.util.ArrayList<>();

  @JsonProperty("expression")
  private DSWorkflowComparisonExpression expression = null;

  @JsonProperty("id")
  private String id = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("type")
  private DSWorkflowStepTypesDoUntil type = null;


  /**
   * doSteps.
   *
   * @return DSDoUntilStep
   **/
  public DSDoUntilStep doSteps(java.util.List<Object> doSteps) {
    this.doSteps = doSteps;
    return this;
  }
  
  /**
   * addDoStepsItem.
   *
   * @return DSDoUntilStep
   **/
  public DSDoUntilStep addDoStepsItem(Object doStepsItem) {
    this.doSteps.add(doStepsItem);
    return this;
  }

  /**
   * A list of #/definitions/DSWorkflowStep. Each element is: A DS Workflow Step. This object should be any of the following object models: [#/definitions/DSServiceStep, #/definitions/DSTransformationStep, #/definitions/DSDocGenStep, #/definitions/DSSignStep].
   * @return doSteps
   **/
  @Schema(required = true, description = "A list of #/definitions/DSWorkflowStep. Each element is: A DS Workflow Step. This object should be any of the following object models: [#/definitions/DSServiceStep, #/definitions/DSTransformationStep, #/definitions/DSDocGenStep, #/definitions/DSSignStep]")
  public java.util.List<Object> getDoSteps() {
    return doSteps;
  }

  /**
   * setDoSteps.
   **/
  public void setDoSteps(java.util.List<Object> doSteps) {
    this.doSteps = doSteps;
  }


  /**
   * expression.
   *
   * @return DSDoUntilStep
   **/
  public DSDoUntilStep expression(DSWorkflowComparisonExpression expression) {
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
   * @return DSDoUntilStep
   **/
  public DSDoUntilStep id(String id) {
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
   * name.
   *
   * @return DSDoUntilStep
   **/
  public DSDoUntilStep name(String name) {
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
   * @return DSDoUntilStep
   **/
  public DSDoUntilStep type(DSWorkflowStepTypesDoUntil type) {
    this.type = type;
    return this;
  }

  /**
   * Get type.
   * @return type
   **/
  @Schema(required = true, description = "")
  public DSWorkflowStepTypesDoUntil getType() {
    return type;
  }

  /**
   * setType.
   **/
  public void setType(DSWorkflowStepTypesDoUntil type) {
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
    DSDoUntilStep dsDoUntilStep = (DSDoUntilStep) o;
    return Objects.equals(this.doSteps, dsDoUntilStep.doSteps) &&
        Objects.equals(this.expression, dsDoUntilStep.expression) &&
        Objects.equals(this.id, dsDoUntilStep.id) &&
        Objects.equals(this.name, dsDoUntilStep.name) &&
        Objects.equals(this.type, dsDoUntilStep.type);
  }

  /**
   * Returns the HashCode.
   */
  @Override
  public int hashCode() {
    return Objects.hash(doSteps, expression, id, name, type);
  }


  /**
   * Converts the given object to string.
   */
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DSDoUntilStep {\n");
    
    sb.append("    doSteps: ").append(toIndentedString(doSteps)).append("\n");
    sb.append("    expression: ").append(toIndentedString(expression)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
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

