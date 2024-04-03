package com.docusign.maestro.model;

import java.util.Objects;
import java.util.Arrays;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Gets or Sets DSWorkflowTransformationExpressionTypes.SubstringExpression
 */
public enum DSWorkflowTransformationExpressionTypesSubstringExpression {
  
  SUBSTRINGEXPRESSION("SubstringExpression");

  private String value;

  DSWorkflowTransformationExpressionTypesSubstringExpression(String value) {
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
  public static DSWorkflowTransformationExpressionTypesSubstringExpression fromValue(String value) {
    for (DSWorkflowTransformationExpressionTypesSubstringExpression b : DSWorkflowTransformationExpressionTypesSubstringExpression.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }
}

