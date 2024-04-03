package com.docusign.maestro.model;

import java.util.Objects;
import java.util.Arrays;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Gets or Sets DSWorkflowVariableSourceTypes.Participant
 */
public enum DSWorkflowVariableSourceTypesParticipant {
  
  PARTICIPANT("participant");

  private String value;

  DSWorkflowVariableSourceTypesParticipant(String value) {
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
  public static DSWorkflowVariableSourceTypesParticipant fromValue(String value) {
    for (DSWorkflowVariableSourceTypesParticipant b : DSWorkflowVariableSourceTypesParticipant.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }
}

