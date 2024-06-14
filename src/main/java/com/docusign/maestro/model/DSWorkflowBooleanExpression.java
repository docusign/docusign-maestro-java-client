package com.docusign.maestro.model;

import java.util.Objects;
import java.util.Arrays;
import com.docusign.maestro.model.DSWorkflowExpressionTypesBooleanExpression;
import com.docusign.maestro.model.DSWorkflowLogicalOperatorTypes;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.Serializable;

/**
 * DSWorkflowBooleanExpression.
 *
 */

public class DSWorkflowBooleanExpression implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("expressions")
  private java.util.List<Object> expressions = new java.util.ArrayList<>();

  @JsonProperty("logicalOperator")
  private DSWorkflowLogicalOperatorTypes logicalOperator = null;

  @JsonProperty("type")
  private DSWorkflowExpressionTypesBooleanExpression type = null;


  /**
   * expressions.
   *
   * @return DSWorkflowBooleanExpression
   **/
  public DSWorkflowBooleanExpression expressions(java.util.List<Object> expressions) {
    this.expressions = expressions;
    return this;
  }
  
  /**
   * addExpressionsItem.
   *
   * @return DSWorkflowBooleanExpression
   **/
  public DSWorkflowBooleanExpression addExpressionsItem(Object expressionsItem) {
    this.expressions.add(expressionsItem);
    return this;
  }

  /**
   * A list of objects. Each object should contain any of the following object models: [#/definitions/DSWorkflowBooleanExpression, #/definitions/DSWorkflowComparisonExpression].
   * @return expressions
   **/
  @Schema(required = true, description = "A list of objects. Each object should contain any of the following object models: [#/definitions/DSWorkflowBooleanExpression, #/definitions/DSWorkflowComparisonExpression]")
  public java.util.List<Object> getExpressions() {
    return expressions;
  }

  /**
   * setExpressions.
   **/
  public void setExpressions(java.util.List<Object> expressions) {
    this.expressions = expressions;
  }


  /**
   * logicalOperator.
   *
   * @return DSWorkflowBooleanExpression
   **/
  public DSWorkflowBooleanExpression logicalOperator(DSWorkflowLogicalOperatorTypes logicalOperator) {
    this.logicalOperator = logicalOperator;
    return this;
  }

  /**
   * Get logicalOperator.
   * @return logicalOperator
   **/
  @Schema(required = true, description = "")
  public DSWorkflowLogicalOperatorTypes getLogicalOperator() {
    return logicalOperator;
  }

  /**
   * setLogicalOperator.
   **/
  public void setLogicalOperator(DSWorkflowLogicalOperatorTypes logicalOperator) {
    this.logicalOperator = logicalOperator;
  }


  /**
   * type.
   *
   * @return DSWorkflowBooleanExpression
   **/
  public DSWorkflowBooleanExpression type(DSWorkflowExpressionTypesBooleanExpression type) {
    this.type = type;
    return this;
  }

  /**
   * Get type.
   * @return type
   **/
  @Schema(required = true, description = "")
  public DSWorkflowExpressionTypesBooleanExpression getType() {
    return type;
  }

  /**
   * setType.
   **/
  public void setType(DSWorkflowExpressionTypesBooleanExpression type) {
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
    DSWorkflowBooleanExpression dsWorkflowBooleanExpression = (DSWorkflowBooleanExpression) o;
    return Objects.equals(this.expressions, dsWorkflowBooleanExpression.expressions) &&
        Objects.equals(this.logicalOperator, dsWorkflowBooleanExpression.logicalOperator) &&
        Objects.equals(this.type, dsWorkflowBooleanExpression.type);
  }

  /**
   * Returns the HashCode.
   */
  @Override
  public int hashCode() {
    return Objects.hash(expressions, logicalOperator, type);
  }


  /**
   * Converts the given object to string.
   */
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DSWorkflowBooleanExpression {\n");
    
    sb.append("    expressions: ").append(toIndentedString(expressions)).append("\n");
    sb.append("    logicalOperator: ").append(toIndentedString(logicalOperator)).append("\n");
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

