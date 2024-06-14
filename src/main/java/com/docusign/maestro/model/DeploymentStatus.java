package com.docusign.maestro.model;

import java.util.Objects;
import java.util.Arrays;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * The workflow deployment status
 */
public enum DeploymentStatus {
  
  DEPLOYMENT_IN_PROGRESS("Deployment In Progress"),
  
  DEPLOYED("Deployed"),
  
  FAILED("Failed"),
  
  DELETE_IN_PROGRESS("Delete in Progress"),
  
  DELETED("Deleted"),
  
  NOT_DEPLOYED("Not Deployed"),
  
  UNPUBLISH_IN_PROGRESS("Unpublish in Progress"),
  
  UNPUBLISHED("Unpublished");

  private String value;

  DeploymentStatus(String value) {
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
  public static DeploymentStatus fromValue(String value) {
    for (DeploymentStatus b : DeploymentStatus.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }
}

