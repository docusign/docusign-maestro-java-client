package com.docusign.maestro.model;

import java.util.Objects;
import java.util.Arrays;
import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Gets or Sets DSWorkflowVariableSourceTypes.Step
 */
public enum DSWorkflowVariableSourceTypesStep {
  
  STEP("step");

  private String value;

  DSWorkflowVariableSourceTypesStep(String value) {
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
  public static DSWorkflowVariableSourceTypesStep fromValue(String value) {
    for (DSWorkflowVariableSourceTypesStep b : DSWorkflowVariableSourceTypesStep.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }
}

