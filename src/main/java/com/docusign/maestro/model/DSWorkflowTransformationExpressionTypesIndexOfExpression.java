package com.docusign.maestro.model;

import java.util.Objects;
import java.util.Arrays;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Gets or Sets DSWorkflowTransformationExpressionTypes.IndexOfExpression
 */
public enum DSWorkflowTransformationExpressionTypesIndexOfExpression {
  
  INDEXOFEXPRESSION("IndexOfExpression");

  private String value;

  DSWorkflowTransformationExpressionTypesIndexOfExpression(String value) {
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
  public static DSWorkflowTransformationExpressionTypesIndexOfExpression fromValue(String value) {
    for (DSWorkflowTransformationExpressionTypesIndexOfExpression b : DSWorkflowTransformationExpressionTypesIndexOfExpression.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }
}

