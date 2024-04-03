package com.docusign.maestro.model;

import java.util.Objects;
import java.util.Arrays;
import io.swagger.v3.oas.annotations.media.Schema;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * The workflow replication status
 */
public enum ReplicationStatus {
  
  DEPLOY_REPLICATION_IN_PROGRESS("Deploy Replication In Progress"),
  
  DEPLOY_REPLICATED("Deploy Replicated"),
  
  DEPLOY_REPLICATION_FAILED("Deploy Replication Failed"),
  
  NOT_REPLICATED("Not Replicated"),
  
  DELETE_REPLICATION_IN_PROGRESS("Delete Replication in Progress"),
  
  DELETE_REPLICATED("Delete Replicated"),
  
  DELETE_REPLICATION_FAILED("Delete Replication Failed"),
  
  UNPUBLISH_REPLICATION_IN_PROGRESS("Unpublish replication in Progress"),
  
  UNPUBLISH_REPLICATED("Unpublish Replicated"),
  
  UNPUBLISH_REPLICATION_FAILED("Unpublish Replication Failed");

  private String value;

  ReplicationStatus(String value) {
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
  public static ReplicationStatus fromValue(String value) {
    for (ReplicationStatus b : ReplicationStatus.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }
}

