package com.docusign.maestro.model;

import java.util.Objects;
import java.util.Arrays;
import com.docusign.maestro.model.DSWorkflowComparisonOperatorTypes;
import com.docusign.maestro.model.DSWorkflowExpressionTypesComparisonExpression;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;

/**
 * DSWorkflowComparisonExpression.
 *
 */

public class DSWorkflowComparisonExpression {
  @JsonProperty("comparisonOperator")
  private DSWorkflowComparisonOperatorTypes comparisonOperator = null;

  @JsonProperty("leftOperand")
  private Object leftOperand = null;

  @JsonProperty("rightOperand")
  private Object rightOperand = null;

  @JsonProperty("type")
  private DSWorkflowExpressionTypesComparisonExpression type = null;


  /**
   * comparisonOperator.
   *
   * @return DSWorkflowComparisonExpression
   **/
  public DSWorkflowComparisonExpression comparisonOperator(DSWorkflowComparisonOperatorTypes comparisonOperator) {
    this.comparisonOperator = comparisonOperator;
    return this;
  }

  /**
   * Get comparisonOperator.
   * @return comparisonOperator
   **/
  @Schema(required = true, description = "")
  public DSWorkflowComparisonOperatorTypes getComparisonOperator() {
    return comparisonOperator;
  }

  /**
   * setComparisonOperator.
   **/
  public void setComparisonOperator(DSWorkflowComparisonOperatorTypes comparisonOperator) {
    this.comparisonOperator = comparisonOperator;
  }


  /**
   * leftOperand.
   *
   * @return DSWorkflowComparisonExpression
   **/
  public DSWorkflowComparisonExpression leftOperand(Object leftOperand) {
    this.leftOperand = leftOperand;
    return this;
  }

  /**
   * This model should be any of the following object models or types: [number, boolean, #/definitions/StringOrVariableOrTransformation].
   * @return leftOperand
   **/
  @Schema(required = true, description = "This model should be any of the following object models or types: [number, boolean, #/definitions/StringOrVariableOrTransformation]")
  public Object getLeftOperand() {
    return leftOperand;
  }

  /**
   * setLeftOperand.
   **/
  public void setLeftOperand(Object leftOperand) {
    this.leftOperand = leftOperand;
  }


  /**
   * rightOperand.
   *
   * @return DSWorkflowComparisonExpression
   **/
  public DSWorkflowComparisonExpression rightOperand(Object rightOperand) {
    this.rightOperand = rightOperand;
    return this;
  }

  /**
   * This model should be any of the following object models or types: [number, boolean, #/definitions/StringOrVariableOrTransformation].
   * @return rightOperand
   **/
  @Schema(required = true, description = "This model should be any of the following object models or types: [number, boolean, #/definitions/StringOrVariableOrTransformation]")
  public Object getRightOperand() {
    return rightOperand;
  }

  /**
   * setRightOperand.
   **/
  public void setRightOperand(Object rightOperand) {
    this.rightOperand = rightOperand;
  }


  /**
   * type.
   *
   * @return DSWorkflowComparisonExpression
   **/
  public DSWorkflowComparisonExpression type(DSWorkflowExpressionTypesComparisonExpression type) {
    this.type = type;
    return this;
  }

  /**
   * Get type.
   * @return type
   **/
  @Schema(required = true, description = "")
  public DSWorkflowExpressionTypesComparisonExpression getType() {
    return type;
  }

  /**
   * setType.
   **/
  public void setType(DSWorkflowExpressionTypesComparisonExpression type) {
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
    DSWorkflowComparisonExpression dsWorkflowComparisonExpression = (DSWorkflowComparisonExpression) o;
    return Objects.equals(this.comparisonOperator, dsWorkflowComparisonExpression.comparisonOperator) &&
        Objects.equals(this.leftOperand, dsWorkflowComparisonExpression.leftOperand) &&
        Objects.equals(this.rightOperand, dsWorkflowComparisonExpression.rightOperand) &&
        Objects.equals(this.type, dsWorkflowComparisonExpression.type);
  }

  /**
   * Returns the HashCode.
   */
  @Override
  public int hashCode() {
    return Objects.hash(comparisonOperator, leftOperand, rightOperand, type);
  }


  /**
   * Converts the given object to string.
   */
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DSWorkflowComparisonExpression {\n");
    
    sb.append("    comparisonOperator: ").append(toIndentedString(comparisonOperator)).append("\n");
    sb.append("    leftOperand: ").append(toIndentedString(leftOperand)).append("\n");
    sb.append("    rightOperand: ").append(toIndentedString(rightOperand)).append("\n");
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

