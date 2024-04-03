package com.docusign.maestro.model;

import java.util.Objects;
import java.util.Arrays;
import io.swagger.v3.oas.annotations.media.Schema;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * The Trigger Event types
 */
public enum EventTypes {
  
  SENT("Sent"),
  
  DELIVERED("Delivered"),
  
  SIGNED("Signed"),
  
  COMPLETED("Completed");

  private String value;

  EventTypes(String value) {
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
  public static EventTypes fromValue(String value) {
    for (EventTypes b : EventTypes.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }
}

