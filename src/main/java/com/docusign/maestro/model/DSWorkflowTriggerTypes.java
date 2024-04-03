package com.docusign.maestro.model;

import java.util.Objects;
import java.util.Arrays;
import io.swagger.v3.oas.annotations.media.Schema;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * The DS Workflow Trigger types
 */
public enum DSWorkflowTriggerTypes {
  
  HTTP("Http"),
  
  HTTP_API("Http-API");

  private String value;

  DSWorkflowTriggerTypes(String value) {
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
  public static DSWorkflowTriggerTypes fromValue(String value) {
    for (DSWorkflowTriggerTypes b : DSWorkflowTriggerTypes.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }
}

