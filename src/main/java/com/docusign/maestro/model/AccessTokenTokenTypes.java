package com.docusign.maestro.model;

import java.util.Objects;
import java.util.Arrays;
import io.swagger.v3.oas.annotations.media.Schema;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Access Token token Types
 */
public enum AccessTokenTokenTypes {
  
  BEARER("Bearer"),
  
  APPLICATION("Application"),
  
  RESOURCE("Resource");

  private String value;

  AccessTokenTokenTypes(String value) {
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
  public static AccessTokenTokenTypes fromValue(String value) {
    for (AccessTokenTokenTypes b : AccessTokenTokenTypes.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }
}

