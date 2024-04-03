package com.docusign.maestro.model;

import java.util.Objects;
import java.util.Arrays;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Gets or Sets DSWorkflowExpressionTypes.BooleanExpression
 */
public enum DSWorkflowExpressionTypesBooleanExpression {
  
  BOOLEANEXPRESSION("BooleanExpression");

  private String value;

  DSWorkflowExpressionTypesBooleanExpression(String value) {
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
  public static DSWorkflowExpressionTypesBooleanExpression fromValue(String value) {
    for (DSWorkflowExpressionTypesBooleanExpression b : DSWorkflowExpressionTypesBooleanExpression.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }
}

