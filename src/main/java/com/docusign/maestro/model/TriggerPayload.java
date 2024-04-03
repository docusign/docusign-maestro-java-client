package com.docusign.maestro.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;

/**
 * JSON payload that will be passed to the triggered workflow.
 *
 */
@Schema(description = "JSON payload that will be passed to the triggered workflow")

public class TriggerPayload {
  @JsonProperty("instanceName")
  private String instanceName = null;

  @JsonProperty("metadata")
  private Object metadata = null;

  @JsonProperty("participants")
  private Object participants = null;

  @JsonProperty("payload")
  private Object payload = null;


  /**
   * instanceName.
   *
   * @return TriggerPayload
   **/
  public TriggerPayload instanceName(String instanceName) {
    this.instanceName = instanceName;
    return this;
  }

  /**
   * Get instanceName.
   * @return instanceName
   **/
  @Schema(description = "")
  public String getInstanceName() {
    return instanceName;
  }

  /**
   * setInstanceName.
   **/
  public void setInstanceName(String instanceName) {
    this.instanceName = instanceName;
  }


  /**
   * metadata.
   *
   * @return TriggerPayload
   **/
  public TriggerPayload metadata(Object metadata) {
    this.metadata = metadata;
    return this;
  }

  /**
   * Get metadata.
   * @return metadata
   **/
  @Schema(description = "")
  public Object getMetadata() {
    return metadata;
  }

  /**
   * setMetadata.
   **/
  public void setMetadata(Object metadata) {
    this.metadata = metadata;
  }


  /**
   * participants.
   *
   * @return TriggerPayload
   **/
  public TriggerPayload participants(Object participants) {
    this.participants = participants;
    return this;
  }

  /**
   * Get participants.
   * @return participants
   **/
  @Schema(description = "")
  public Object getParticipants() {
    return participants;
  }

  /**
   * setParticipants.
   **/
  public void setParticipants(Object participants) {
    this.participants = participants;
  }


  /**
   * payload.
   *
   * @return TriggerPayload
   **/
  public TriggerPayload payload(Object payload) {
    this.payload = payload;
    return this;
  }

  /**
   * Get payload.
   * @return payload
   **/
  @Schema(description = "")
  public Object getPayload() {
    return payload;
  }

  /**
   * setPayload.
   **/
  public void setPayload(Object payload) {
    this.payload = payload;
  }


  /**
   * Compares objects.
   *
   * @return true or false depending on comparison result.
   */
  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TriggerPayload triggerPayload = (TriggerPayload) o;
    return Objects.equals(this.instanceName, triggerPayload.instanceName) &&
        Objects.equals(this.metadata, triggerPayload.metadata) &&
        Objects.equals(this.participants, triggerPayload.participants) &&
        Objects.equals(this.payload, triggerPayload.payload);
  }

  /**
   * Returns the HashCode.
   */
  @Override
  public int hashCode() {
    return Objects.hash(instanceName, metadata, participants, payload);
  }


  /**
   * Converts the given object to string.
   */
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TriggerPayload {\n");
    
    sb.append("    instanceName: ").append(toIndentedString(instanceName)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
    sb.append("    participants: ").append(toIndentedString(participants)).append("\n");
    sb.append("    payload: ").append(toIndentedString(payload)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

