package com.docusign.maestro.model;

import java.util.Objects;
import java.util.Arrays;
import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Gets or Sets DSWorkflowTransformationExpressionTypes.ReplaceExpression
 */
public enum DSWorkflowTransformationExpressionTypesReplaceExpression {
  
  REPLACEEXPRESSION("ReplaceExpression");

  private String value;

  DSWorkflowTransformationExpressionTypesReplaceExpression(String value) {
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
  public static DSWorkflowTransformationExpressionTypesReplaceExpression fromValue(String value) {
    for (DSWorkflowTransformationExpressionTypesReplaceExpression b : DSWorkflowTransformationExpressionTypesReplaceExpression.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }
}

