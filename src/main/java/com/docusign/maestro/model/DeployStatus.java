package com.docusign.maestro.model;

import java.util.Objects;
import java.util.Arrays;
import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Gets or Sets DeployStatus
 */
public enum DeployStatus {
  
  PUBLISH("Publish"),
  
  UNPUBLISH("UnPublish"),
  
  DISABLE("Disable");

  private String value;

  DeployStatus(String value) {
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
  public static DeployStatus fromValue(String value) {
    for (DeployStatus b : DeployStatus.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }
}

