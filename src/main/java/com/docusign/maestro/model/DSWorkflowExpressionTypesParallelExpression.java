package com.docusign.maestro.model;

import java.util.Objects;
import java.util.Arrays;
import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Gets or Sets DSWorkflowExpressionTypes.ParallelExpression
 */
public enum DSWorkflowExpressionTypesParallelExpression {
  
  PARALLELEXPRESSION("ParallelExpression");

  private String value;

  DSWorkflowExpressionTypesParallelExpression(String value) {
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
  public static DSWorkflowExpressionTypesParallelExpression fromValue(String value) {
    for (DSWorkflowExpressionTypesParallelExpression b : DSWorkflowExpressionTypesParallelExpression.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }
}

