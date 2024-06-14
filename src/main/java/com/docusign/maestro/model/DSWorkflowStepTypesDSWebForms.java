package com.docusign.maestro.model;

import java.util.Objects;
import java.util.Arrays;
import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Gets or Sets DSWorkflowStepTypes.DSWebForms
 */
public enum DSWorkflowStepTypesDSWebForms {
  
  DS_WEBFORMS("DS-WebForms");

  private String value;

  DSWorkflowStepTypesDSWebForms(String value) {
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
  public static DSWorkflowStepTypesDSWebForms fromValue(String value) {
    for (DSWorkflowStepTypesDSWebForms b : DSWorkflowStepTypesDSWebForms.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }
}

