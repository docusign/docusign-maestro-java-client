package com.docusign.maestro.model;

import java.util.Objects;
import java.util.Arrays;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Gets or Sets ESignDocumentTypes.FromDSTemplate
 */
public enum ESignDocumentTypesFromDSTemplate {
  
  FROMDSTEMPLATE("FromDSTemplate");

  private String value;

  ESignDocumentTypesFromDSTemplate(String value) {
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
  public static ESignDocumentTypesFromDSTemplate fromValue(String value) {
    for (ESignDocumentTypesFromDSTemplate b : ESignDocumentTypesFromDSTemplate.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }
}

