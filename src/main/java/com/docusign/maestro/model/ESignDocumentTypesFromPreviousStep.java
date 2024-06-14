package com.docusign.maestro.model;

import java.util.Objects;
import java.util.Arrays;
import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Gets or Sets ESignDocumentTypes.FromPreviousStep
 */
public enum ESignDocumentTypesFromPreviousStep {
  
  FROMPREVIOUSSTEP("FromPreviousStep");

  private String value;

  ESignDocumentTypesFromPreviousStep(String value) {
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
  public static ESignDocumentTypesFromPreviousStep fromValue(String value) {
    for (ESignDocumentTypesFromPreviousStep b : ESignDocumentTypesFromPreviousStep.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }
}

