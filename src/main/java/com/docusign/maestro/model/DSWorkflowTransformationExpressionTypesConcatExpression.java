package com.docusign.maestro.model;

import java.util.Objects;
import java.util.Arrays;
import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Gets or Sets DSWorkflowTransformationExpressionTypes.ConcatExpression
 */
public enum DSWorkflowTransformationExpressionTypesConcatExpression {
  
  CONCATEXPRESSION("ConcatExpression");

  private String value;

  DSWorkflowTransformationExpressionTypesConcatExpression(String value) {
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
  public static DSWorkflowTransformationExpressionTypesConcatExpression fromValue(String value) {
    for (DSWorkflowTransformationExpressionTypesConcatExpression b : DSWorkflowTransformationExpressionTypesConcatExpression.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }
}

