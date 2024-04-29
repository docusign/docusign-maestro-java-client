package com.docusign.maestro.model;

import java.util.Objects;
import java.util.Arrays;
import io.swagger.v3.oas.annotations.media.Schema;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Workflow Step History state (completed, failed, In-progress)
 */
public enum WorkflowStepHistoryState {
  
  IN_PROGRESS("In Progress"),
  
  COMPLETED("Completed"),
  
  FAILED("Failed"),
  
  CANCELED("Canceled");

  private String value;

  WorkflowStepHistoryState(String value) {
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
  public static WorkflowStepHistoryState fromValue(String value) {
    for (WorkflowStepHistoryState b : WorkflowStepHistoryState.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }
}

