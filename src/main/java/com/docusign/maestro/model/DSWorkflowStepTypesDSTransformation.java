package com.docusign.maestro.model;

import java.util.Objects;
import java.util.Arrays;
import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Gets or Sets DSWorkflowStepTypes.DSTransformation
 */
public enum DSWorkflowStepTypesDSTransformation {
  
  DS_TRANSFORMATION("DS-Transformation");

  private String value;

  DSWorkflowStepTypesDSTransformation(String value) {
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
  public static DSWorkflowStepTypesDSTransformation fromValue(String value) {
    for (DSWorkflowStepTypesDSTransformation b : DSWorkflowStepTypesDSTransformation.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }
}

