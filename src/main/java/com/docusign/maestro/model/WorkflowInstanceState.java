package com.docusign.maestro.model;

import java.util.Objects;
import java.util.Arrays;
import io.swagger.v3.oas.annotations.media.Schema;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Current Workflow Instance state (completed, failed, In-progress)
 */
public enum WorkflowInstanceState {
  
  IN_PROGRESS("In Progress"),
  
  COMPLETED("Completed"),
  
  FAILED("Failed");

  private String value;

  WorkflowInstanceState(String value) {
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
  public static WorkflowInstanceState fromValue(String value) {
    for (WorkflowInstanceState b : WorkflowInstanceState.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }
}

