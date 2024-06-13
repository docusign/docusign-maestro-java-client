package com.docusign.maestro.model;

import java.util.Objects;
import java.util.Arrays;
import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Gets or Sets DSWorkflowComparisonOperatorTypes
 */
public enum DSWorkflowComparisonOperatorTypes {
  
  CONTAINS("Contains"),
  
  NOTCONTAINS("NotContains"),
  
  EQUAL("Equal"),
  
  NOTEQUAL("NotEqual"),
  
  GREATERTHAN("GreaterThan"),
  
  GREATERTHANOREQUAL("GreaterThanOrEqual"),
  
  LESSTHAN("LessThan"),
  
  LESSTHANOREQUAL("LessThanOrEqual"),
  
  STARTSWITH("StartsWith"),
  
  NOTSTARTSWITH("NotStartsWith"),
  
  ENDSWITH("EndsWith"),
  
  NOTENDSWITH("NotEndsWith");

  private String value;

  DSWorkflowComparisonOperatorTypes(String value) {
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
  public static DSWorkflowComparisonOperatorTypes fromValue(String value) {
    for (DSWorkflowComparisonOperatorTypes b : DSWorkflowComparisonOperatorTypes.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }
}

