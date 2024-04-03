package com.docusign.maestro.model;

import java.util.Objects;
import java.util.Arrays;
import com.docusign.maestro.model.DSWorkflowTransformationExpressionTypesReplaceExpression;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;

/**
 * DSWorkflowReplaceExpression.
 *
 */

public class DSWorkflowReplaceExpression {
  @JsonProperty("newText")
  private Object newText = null;

  @JsonProperty("oldText")
  private Object oldText = null;

  @JsonProperty("text")
  private Object text = null;

  @JsonProperty("type")
  private DSWorkflowTransformationExpressionTypesReplaceExpression type = null;


  /**
   * newText.
   *
   * @return DSWorkflowReplaceExpression
   **/
  public DSWorkflowReplaceExpression newText(Object newText) {
    this.newText = newText;
    return this;
  }

  /**
   * Reference of #/definitions/StringOrVariableOrTransformation. Object stands for a String or a Variable or a Transformation. This object should be any of the following object models or types: [string, #/definitions/DSWorkflowVariable, #/definitions/DSWorkflowTransformationExpression].
   * @return newText
   **/
  @Schema(required = true, description = "Reference of #/definitions/StringOrVariableOrTransformation. Object stands for a String or a Variable or a Transformation. This object should be any of the following object models or types: [string, #/definitions/DSWorkflowVariable, #/definitions/DSWorkflowTransformationExpression]")
  public Object getNewText() {
    return newText;
  }

  /**
   * setNewText.
   **/
  public void setNewText(Object newText) {
    this.newText = newText;
  }


  /**
   * oldText.
   *
   * @return DSWorkflowReplaceExpression
   **/
  public DSWorkflowReplaceExpression oldText(Object oldText) {
    this.oldText = oldText;
    return this;
  }

  /**
   * Reference of #/definitions/StringOrVariableOrTransformation. Object stands for a String or a Variable or a Transformation. This object should be any of the following object models or types: [string, #/definitions/DSWorkflowVariable, #/definitions/DSWorkflowTransformationExpression].
   * @return oldText
   **/
  @Schema(required = true, description = "Reference of #/definitions/StringOrVariableOrTransformation. Object stands for a String or a Variable or a Transformation. This object should be any of the following object models or types: [string, #/definitions/DSWorkflowVariable, #/definitions/DSWorkflowTransformationExpression]")
  public Object getOldText() {
    return oldText;
  }

  /**
   * setOldText.
   **/
  public void setOldText(Object oldText) {
    this.oldText = oldText;
  }


  /**
   * text.
   *
   * @return DSWorkflowReplaceExpression
   **/
  public DSWorkflowReplaceExpression text(Object text) {
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
   * @return DSWorkflowReplaceExpression
   **/
  public DSWorkflowReplaceExpression type(DSWorkflowTransformationExpressionTypesReplaceExpression type) {
    this.type = type;
    return this;
  }

  /**
   * Get type.
   * @return type
   **/
  @Schema(required = true, description = "")
  public DSWorkflowTransformationExpressionTypesReplaceExpression getType() {
    return type;
  }

  /**
   * setType.
   **/
  public void setType(DSWorkflowTransformationExpressionTypesReplaceExpression type) {
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
    DSWorkflowReplaceExpression dsWorkflowReplaceExpression = (DSWorkflowReplaceExpression) o;
    return Objects.equals(this.newText, dsWorkflowReplaceExpression.newText) &&
        Objects.equals(this.oldText, dsWorkflowReplaceExpression.oldText) &&
        Objects.equals(this.text, dsWorkflowReplaceExpression.text) &&
        Objects.equals(this.type, dsWorkflowReplaceExpression.type);
  }

  /**
   * Returns the HashCode.
   */
  @Override
  public int hashCode() {
    return Objects.hash(newText, oldText, text, type);
  }


  /**
   * Converts the given object to string.
   */
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DSWorkflowReplaceExpression {\n");
    
    sb.append("    newText: ").append(toIndentedString(newText)).append("\n");
    sb.append("    oldText: ").append(toIndentedString(oldText)).append("\n");
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

