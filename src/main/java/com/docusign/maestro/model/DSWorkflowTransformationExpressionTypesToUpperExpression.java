package com.docusign.maestro.model;

import java.util.Objects;
import java.util.Arrays;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Gets or Sets DSWorkflowTransformationExpressionTypes.ToUpperExpression
 */
public enum DSWorkflowTransformationExpressionTypesToUpperExpression {
  
  TOUPPEREXPRESSION("ToUpperExpression");

  private String value;

  DSWorkflowTransformationExpressionTypesToUpperExpression(String value) {
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
  public static DSWorkflowTransformationExpressionTypesToUpperExpression fromValue(String value) {
    for (DSWorkflowTransformationExpressionTypesToUpperExpression b : DSWorkflowTransformationExpressionTypesToUpperExpression.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }
}

