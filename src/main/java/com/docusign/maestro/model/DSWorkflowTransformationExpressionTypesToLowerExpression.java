package com.docusign.maestro.model;

import java.util.Objects;
import java.util.Arrays;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Gets or Sets DSWorkflowTransformationExpressionTypes.ToLowerExpression
 */
public enum DSWorkflowTransformationExpressionTypesToLowerExpression {
  
  TOLOWEREXPRESSION("ToLowerExpression");

  private String value;

  DSWorkflowTransformationExpressionTypesToLowerExpression(String value) {
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
  public static DSWorkflowTransformationExpressionTypesToLowerExpression fromValue(String value) {
    for (DSWorkflowTransformationExpressionTypesToLowerExpression b : DSWorkflowTransformationExpressionTypesToLowerExpression.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }
}

