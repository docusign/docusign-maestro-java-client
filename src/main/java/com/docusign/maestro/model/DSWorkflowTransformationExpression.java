package com.docusign.maestro.model;

import java.util.Objects;
import java.util.Arrays;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.Serializable;

/**
 * Transformation Expression object. This object should be any of the following object models: [#/definitions/DSWorkflowReplaceExpression, #/definitions/DSWorkflowToLowerExpression, #/definitions/DSWorkflowToUpperExpression, #/components/schemas/DSWorkflowLastIndexOfExpression, #/components/schemas/DSWorkflowIndexOfExpression, #/components/schemas/DSWorkflowSubstringExpression, #/components/schemas/DSWorkflowConcatExpression].
 *
 */
@Schema(description = "Transformation Expression object. This object should be any of the following object models: [#/definitions/DSWorkflowReplaceExpression, #/definitions/DSWorkflowToLowerExpression, #/definitions/DSWorkflowToUpperExpression, #/components/schemas/DSWorkflowLastIndexOfExpression, #/components/schemas/DSWorkflowIndexOfExpression, #/components/schemas/DSWorkflowSubstringExpression, #/components/schemas/DSWorkflowConcatExpression]")

public class DSWorkflowTransformationExpression implements Serializable {
  private static final long serialVersionUID = 1L;


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
    return true;
  }

  /**
   * Returns the HashCode.
   */
  @Override
  public int hashCode() {
    return Objects.hash();
  }


  /**
   * Converts the given object to string.
   */
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DSWorkflowTransformationExpression {\n");
    
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

