package com.docusign.maestro.model;

import java.util.Objects;
import java.util.Arrays;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Gets or Sets DSWorkflowLogicalOperatorTypes
 */
public enum DSWorkflowLogicalOperatorTypes {
  
  AND("And"),
  
  OR("Or");

  private String value;

  DSWorkflowLogicalOperatorTypes(String value) {
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
  public static DSWorkflowLogicalOperatorTypes fromValue(String value) {
    for (DSWorkflowLogicalOperatorTypes b : DSWorkflowLogicalOperatorTypes.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }
}

