package com.docusign.maestro.model;

import java.util.Objects;
import java.util.Arrays;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Gets or Sets DSWorkflowVariableSourceTypes.Variable
 */
public enum DSWorkflowVariableSourceTypesVariable {
  
  VARIABLE("variable");

  private String value;

  DSWorkflowVariableSourceTypesVariable(String value) {
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
  public static DSWorkflowVariableSourceTypesVariable fromValue(String value) {
    for (DSWorkflowVariableSourceTypesVariable b : DSWorkflowVariableSourceTypesVariable.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }
}

