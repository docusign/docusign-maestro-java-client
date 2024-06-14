package com.docusign.maestro.model;

import java.util.Objects;
import java.util.Arrays;
import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Gets or Sets DSWorkflowStepTypes.DSIdv
 */
public enum DSWorkflowStepTypesDSIdv {
  
  DS_IDV("DS-IDV");

  private String value;

  DSWorkflowStepTypesDSIdv(String value) {
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
  public static DSWorkflowStepTypesDSIdv fromValue(String value) {
    for (DSWorkflowStepTypesDSIdv b : DSWorkflowStepTypesDSIdv.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }
}

