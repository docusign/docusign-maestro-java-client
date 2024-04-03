package com.docusign.maestro.model;

import java.util.Objects;
import java.util.Arrays;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Gets or Sets DSWorkflowDocGenDocOutputFormat
 */
public enum DSWorkflowDocGenDocOutputFormat {
  
  PDF("pdf"),
  
  DOCX("docx");

  private String value;

  DSWorkflowDocGenDocOutputFormat(String value) {
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
  public static DSWorkflowDocGenDocOutputFormat fromValue(String value) {
    for (DSWorkflowDocGenDocOutputFormat b : DSWorkflowDocGenDocOutputFormat.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }
}

