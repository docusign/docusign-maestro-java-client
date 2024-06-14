package com.docusign.maestro.model;

import java.util.Objects;
import java.util.Arrays;
import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Gets or Sets DSWorkflowStepTypes.DSIfElse
 */
public enum DSWorkflowStepTypesDSIfElse {
  
  DS_IFELSE("DS-IfElse");

  private String value;

  DSWorkflowStepTypesDSIfElse(String value) {
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
  public static DSWorkflowStepTypesDSIfElse fromValue(String value) {
    for (DSWorkflowStepTypesDSIfElse b : DSWorkflowStepTypesDSIfElse.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }
}

