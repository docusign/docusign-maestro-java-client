package com.docusign.maestro.model;

import java.util.Objects;
import java.util.Arrays;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Gets or Sets DSWorkflowStepTypes.Loop
 */
public enum DSWorkflowStepTypesLoop {
  
  DS_LOOP("DS-Loop");

  private String value;

  DSWorkflowStepTypesLoop(String value) {
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
  public static DSWorkflowStepTypesLoop fromValue(String value) {
    for (DSWorkflowStepTypesLoop b : DSWorkflowStepTypesLoop.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }
}

