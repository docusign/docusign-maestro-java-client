package com.docusign.maestro.model;

import java.util.Objects;
import java.util.Arrays;
import com.docusign.maestro.model.Participant;
import io.swagger.v3.oas.annotations.media.Schema;

/**
 * A DS Workflow participant record.
 *
 */
@Schema(description = "A DS Workflow participant record")

public class DSWorkflowParticipantRecord extends java.util.HashMap<String, Participant> {

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
    return super.equals(o);
  }

  /**
   * Returns the HashCode.
   */
  @Override
  public int hashCode() {
    return Objects.hash(super.hashCode());
  }


  /**
   * Converts the given object to string.
   */
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DSWorkflowParticipantRecord {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
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

