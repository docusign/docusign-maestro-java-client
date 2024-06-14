package com.docusign.maestro.model;

import java.util.Objects;
import java.util.Arrays;
import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Gets or Sets DSWorkflowStepTypes.DoUntil
 */
public enum DSWorkflowStepTypesDoUntil {
  
  DS_DOUNTIL("DS-DoUntil");

  private String value;

  DSWorkflowStepTypesDoUntil(String value) {
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
  public static DSWorkflowStepTypesDoUntil fromValue(String value) {
    for (DSWorkflowStepTypesDoUntil b : DSWorkflowStepTypesDoUntil.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }
}

