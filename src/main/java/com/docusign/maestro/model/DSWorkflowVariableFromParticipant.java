package com.docusign.maestro.model;

import java.util.Objects;
import java.util.Arrays;
import com.docusign.maestro.model.DSWorkflowVariableSourceTypesParticipant;
import com.docusign.maestro.model.ParticipantKeys;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;

/**
 * DS Workflow Variable from a Participant.
 *
 */
@Schema(description = "DS Workflow Variable from a Participant")

public class DSWorkflowVariableFromParticipant {
  @JsonProperty("key")
  private ParticipantKeys key = null;

  @JsonProperty("participantId")
  private String participantId = null;

  @JsonProperty("source")
  private DSWorkflowVariableSourceTypesParticipant source = null;


  /**
   * key.
   *
   * @return DSWorkflowVariableFromParticipant
   **/
  public DSWorkflowVariableFromParticipant key(ParticipantKeys key) {
    this.key = key;
    return this;
  }

  /**
   * Get key.
   * @return key
   **/
  @Schema(required = true, description = "")
  public ParticipantKeys getKey() {
    return key;
  }

  /**
   * setKey.
   **/
  public void setKey(ParticipantKeys key) {
    this.key = key;
  }


  /**
   * participantId.
   *
   * @return DSWorkflowVariableFromParticipant
   **/
  public DSWorkflowVariableFromParticipant participantId(String participantId) {
    this.participantId = participantId;
    return this;
  }

  /**
   * Get participantId.
   * @return participantId
   **/
  @Schema(required = true, description = "")
  public String getParticipantId() {
    return participantId;
  }

  /**
   * setParticipantId.
   **/
  public void setParticipantId(String participantId) {
    this.participantId = participantId;
  }


  /**
   * source.
   *
   * @return DSWorkflowVariableFromParticipant
   **/
  public DSWorkflowVariableFromParticipant source(DSWorkflowVariableSourceTypesParticipant source) {
    this.source = source;
    return this;
  }

  /**
   * Get source.
   * @return source
   **/
  @Schema(required = true, description = "")
  public DSWorkflowVariableSourceTypesParticipant getSource() {
    return source;
  }

  /**
   * setSource.
   **/
  public void setSource(DSWorkflowVariableSourceTypesParticipant source) {
    this.source = source;
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
    DSWorkflowVariableFromParticipant dsWorkflowVariableFromParticipant = (DSWorkflowVariableFromParticipant) o;
    return Objects.equals(this.key, dsWorkflowVariableFromParticipant.key) &&
        Objects.equals(this.participantId, dsWorkflowVariableFromParticipant.participantId) &&
        Objects.equals(this.source, dsWorkflowVariableFromParticipant.source);
  }

  /**
   * Returns the HashCode.
   */
  @Override
  public int hashCode() {
    return Objects.hash(key, participantId, source);
  }


  /**
   * Converts the given object to string.
   */
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DSWorkflowVariableFromParticipant {\n");
    
    sb.append("    key: ").append(toIndentedString(key)).append("\n");
    sb.append("    participantId: ").append(toIndentedString(participantId)).append("\n");
    sb.append("    source: ").append(toIndentedString(source)).append("\n");
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

