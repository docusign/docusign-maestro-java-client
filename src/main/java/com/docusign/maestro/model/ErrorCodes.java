package com.docusign.maestro.model;

import java.util.Objects;
import java.util.Arrays;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Internal Error Codes
 */
public enum ErrorCodes {
  
  _10001("ERR_10001"),
  
  _10002("ERR_10002"),
  
  _10003("ERR_10003"),
  
  _10004("ERR_10004"),
  
  _10005("ERR_10005"),
  
  _10006("ERR_10006"),
  
  _10007("ERR_10007"),
  
  _10008("ERR_10008"),
  
  _10009("ERR_10009"),
  
  _10101("ERR_10101"),
  
  _10201("ERR_10201"),
  
  _10202("ERR_10202"),
  
  _10301("ERR_10301"),
  
  _10302("ERR_10302"),
  
  _10401("ERR_10401"),
  
  _10801("ERR_10801"),
  
  _10802("ERR_10802"),
  
  _10999("ERR_10999");

  private String value;

  ErrorCodes(String value) {
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
  public static ErrorCodes fromValue(String value) {
    for (ErrorCodes b : ErrorCodes.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }
}

