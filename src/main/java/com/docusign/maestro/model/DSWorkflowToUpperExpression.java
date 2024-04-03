package com.docusign.maestro.model;

import java.util.Objects;
import java.util.Arrays;
import com.docusign.maestro.model.DSWorkflowTransformationExpressionTypesToUpperExpression;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;

/**
 * DSWorkflowToUpperExpression.
 *
 */

public class DSWorkflowToUpperExpression {
  @JsonProperty("text")
  private Object text = null;

  @JsonProperty("type")
  private DSWorkflowTransformationExpressionTypesToUpperExpression type = null;


  /**
   * text.
   *
   * @return DSWorkflowToUpperExpression
   **/
  public DSWorkflowToUpperExpression text(Object text) {
    this.text = text;
    return this;
  }

  /**
   * Reference of #/definitions/StringOrVariableOrTransformation. Object stands for a String or a Variable or a Transformation. This object should be any of the following object models or types: [string, #/definitions/DSWorkflowVariable, #/definitions/DSWorkflowTransformationExpression].
   * @return text
   **/
  @Schema(required = true, description = "Reference of #/definitions/StringOrVariableOrTransformation. Object stands for a String or a Variable or a Transformation. This object should be any of the following object models or types: [string, #/definitions/DSWorkflowVariable, #/definitions/DSWorkflowTransformationExpression]")
  public Object getText() {
    return text;
  }

  /**
   * setText.
   **/
  public void setText(Object text) {
    this.text = text;
  }


  /**
   * type.
   *
   * @return DSWorkflowToUpperExpression
   **/
  public DSWorkflowToUpperExpression type(DSWorkflowTransformationExpressionTypesToUpperExpression type) {
    this.type = type;
    return this;
  }

  /**
   * Get type.
   * @return type
   **/
  @Schema(required = true, description = "")
  public DSWorkflowTransformationExpressionTypesToUpperExpression getType() {
    return type;
  }

  /**
   * setType.
   **/
  public void setType(DSWorkflowTransformationExpressionTypesToUpperExpression type) {
    this.type = type;
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
    DSWorkflowToUpperExpression dsWorkflowToUpperExpression = (DSWorkflowToUpperExpression) o;
    return Objects.equals(this.text, dsWorkflowToUpperExpression.text) &&
        Objects.equals(this.type, dsWorkflowToUpperExpression.type);
  }

  /**
   * Returns the HashCode.
   */
  @Override
  public int hashCode() {
    return Objects.hash(text, type);
  }


  /**
   * Converts the given object to string.
   */
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DSWorkflowToUpperExpression {\n");
    
    sb.append("    text: ").append(toIndentedString(text)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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

