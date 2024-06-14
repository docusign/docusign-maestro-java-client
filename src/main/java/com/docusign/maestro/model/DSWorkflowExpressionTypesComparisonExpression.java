package com.docusign.maestro.model;

import java.util.Objects;
import java.util.Arrays;
import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Gets or Sets DSWorkflowExpressionTypes.ComparisonExpression
 */
public enum DSWorkflowExpressionTypesComparisonExpression {
  
  COMPARISONEXPRESSION("ComparisonExpression");

  private String value;

  DSWorkflowExpressionTypesComparisonExpression(String value) {
    this.value = value;
  }

  @JsonValue
  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static DSWorkflowExpressionTypesComparisonExpression fromValue(String value) {
    for (DSWorkflowExpressionTypesComparisonExpression b : DSWorkflowExpressionTypesComparisonExpression.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }
}

