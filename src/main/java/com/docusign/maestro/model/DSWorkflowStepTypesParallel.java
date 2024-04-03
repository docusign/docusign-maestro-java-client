package com.docusign.maestro.model;

import java.util.Objects;
import java.util.Arrays;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Gets or Sets DSWorkflowStepTypes.Parallel
 */
public enum DSWorkflowStepTypesParallel {
  
  DS_PARALLEL("DS-Parallel");

  private String value;

  DSWorkflowStepTypesParallel(String value) {
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
  public static DSWorkflowStepTypesParallel fromValue(String value) {
    for (DSWorkflowStepTypesParallel b : DSWorkflowStepTypesParallel.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }
}

