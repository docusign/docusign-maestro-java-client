package com.docusign.maestro.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;

/**
 * A DS Workflow participant.
 *
 */
@Schema(description = "A DS Workflow participant")

public class Participant {
  @JsonProperty("participantEmail")
  private String participantEmail = null;

  @JsonProperty("participantFirstName")
  private String participantFirstName = null;

  @JsonProperty("participantLastName")
  private String participantLastName = null;

  @JsonProperty("participantRole")
  private String participantRole = null;


  /**
   * participantEmail.
   *
   * @return Participant
   **/
  public Participant participantEmail(String participantEmail) {
    this.participantEmail = participantEmail;
    return this;
  }

  /**
   * Get participantEmail.
   * @return participantEmail
   **/
  @Schema(required = true, description = "")
  public String getParticipantEmail() {
    return participantEmail;
  }

  /**
   * setParticipantEmail.
   **/
  public void setParticipantEmail(String participantEmail) {
    this.participantEmail = participantEmail;
  }


  /**
   * participantFirstName.
   *
   * @return Participant
   **/
  public Participant participantFirstName(String participantFirstName) {
    this.participantFirstName = participantFirstName;
    return this;
  }

  /**
   * Get participantFirstName.
   * @return participantFirstName
   **/
  @Schema(required = true, description = "")
  public String getParticipantFirstName() {
    return participantFirstName;
  }

  /**
   * setParticipantFirstName.
   **/
  public void setParticipantFirstName(String participantFirstName) {
    this.participantFirstName = participantFirstName;
  }


  /**
   * participantLastName.
   *
   * @return Participant
   **/
  public Participant participantLastName(String participantLastName) {
    this.participantLastName = participantLastName;
    return this;
  }

  /**
   * Get participantLastName.
   * @return participantLastName
   **/
  @Schema(required = true, description = "")
  public String getParticipantLastName() {
    return participantLastName;
  }

  /**
   * setParticipantLastName.
   **/
  public void setParticipantLastName(String participantLastName) {
    this.participantLastName = participantLastName;
  }


  /**
   * participantRole.
   *
   * @return Participant
   **/
  public Participant participantRole(String participantRole) {
    this.participantRole = participantRole;
    return this;
  }

  /**
   * Get participantRole.
   * @return participantRole
   **/
  @Schema(required = true, description = "")
  public String getParticipantRole() {
    return participantRole;
  }

  /**
   * setParticipantRole.
   **/
  public void setParticipantRole(String participantRole) {
    this.participantRole = participantRole;
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
    Participant participant = (Participant) o;
    return Objects.equals(this.participantEmail, participant.participantEmail) &&
        Objects.equals(this.participantFirstName, participant.participantFirstName) &&
        Objects.equals(this.participantLastName, participant.participantLastName) &&
        Objects.equals(this.participantRole, participant.participantRole);
  }

  /**
   * Returns the HashCode.
   */
  @Override
  public int hashCode() {
    return Objects.hash(participantEmail, participantFirstName, participantLastName, participantRole);
  }


  /**
   * Converts the given object to string.
   */
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Participant {\n");
    
    sb.append("    participantEmail: ").append(toIndentedString(participantEmail)).append("\n");
    sb.append("    participantFirstName: ").append(toIndentedString(participantFirstName)).append("\n");
    sb.append("    participantLastName: ").append(toIndentedString(participantLastName)).append("\n");
    sb.append("    participantRole: ").append(toIndentedString(participantRole)).append("\n");
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

