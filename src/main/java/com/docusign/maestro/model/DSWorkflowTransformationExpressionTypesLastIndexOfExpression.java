package com.docusign.maestro.model;

import java.util.Objects;
import java.util.Arrays;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Gets or Sets DSWorkflowTransformationExpressionTypes.LastIndexOfExpression
 */
public enum DSWorkflowTransformationExpressionTypesLastIndexOfExpression {
  
  LASTINDEXOFEXPRESSION("LastIndexOfExpression");

  private String value;

  DSWorkflowTransformationExpressionTypesLastIndexOfExpression(String value) {
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
  public static DSWorkflowTransformationExpressionTypesLastIndexOfExpression fromValue(String value) {
    for (DSWorkflowTransformationExpressionTypesLastIndexOfExpression b : DSWorkflowTransformationExpressionTypesLastIndexOfExpression.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }
}

