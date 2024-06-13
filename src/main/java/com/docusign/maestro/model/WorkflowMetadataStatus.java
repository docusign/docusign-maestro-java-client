package com.docusign.maestro.model;

import java.util.Objects;
import java.util.Arrays;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Workflow Definition Metadata Status
 */
public enum WorkflowMetadataStatus {
  
  ACTIVE("active"),
  
  INACTIVE("inactive"),
  
  PUBLISHING("publishing"),
  
  UNPUBLISHING("unpublishing"),
  
  ARCHIVED("archived"),
  
  ARCHIVING("archiving");

  private String value;

  WorkflowMetadataStatus(String value) {
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
  public static WorkflowMetadataStatus fromValue(String value) {
    for (WorkflowMetadataStatus b : WorkflowMetadataStatus.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }
}

