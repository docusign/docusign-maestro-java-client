package com.docusign.maestro.model;

import java.util.Objects;
import java.util.Arrays;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Gets or Sets DSWorkflowStepTypes.DSSign
 */
public enum DSWorkflowStepTypesDSSign {
  
  DS_SIGN("DS-Sign");

  private String value;

  DSWorkflowStepTypesDSSign(String value) {
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
  public static DSWorkflowStepTypesDSSign fromValue(String value) {
    for (DSWorkflowStepTypesDSSign b : DSWorkflowStepTypesDSSign.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }
}

