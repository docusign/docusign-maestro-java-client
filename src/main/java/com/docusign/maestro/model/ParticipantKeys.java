package com.docusign.maestro.model;

import java.util.Objects;
import java.util.Arrays;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Gets or Sets ParticipantKeys
 */
public enum ParticipantKeys {
  
  PARTICIPANTEMAIL("participantEmail"),
  
  PARTICIPANTFIRSTNAME("participantFirstName"),
  
  PARTICIPANTLASTNAME("participantLastName");

  private String value;

  ParticipantKeys(String value) {
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
  public static ParticipantKeys fromValue(String value) {
    for (ParticipantKeys b : ParticipantKeys.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }
}

