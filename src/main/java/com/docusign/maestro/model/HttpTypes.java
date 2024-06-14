package com.docusign.maestro.model;

import java.util.Objects;
import java.util.Arrays;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * The Trigger Http types
 */
public enum HttpTypes {
  
  GET("Get"),
  
  POST("Post"),
  
  PUT("Put"),
  
  DELETE("Delete");

  private String value;

  HttpTypes(String value) {
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
  public static HttpTypes fromValue(String value) {
    for (HttpTypes b : HttpTypes.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }
}

