package com.docusign.maestro.model;

import java.util.Objects;
import java.util.Arrays;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Gets or Sets DSWorkflowStepTypes.DSDocGen
 */
public enum DSWorkflowStepTypesDSDocGen {
  
  DS_DOCGEN("DS-DocGen");

  private String value;

  DSWorkflowStepTypesDSDocGen(String value) {
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
  public static DSWorkflowStepTypesDSDocGen fromValue(String value) {
    for (DSWorkflowStepTypesDSDocGen b : DSWorkflowStepTypesDSDocGen.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }
}

