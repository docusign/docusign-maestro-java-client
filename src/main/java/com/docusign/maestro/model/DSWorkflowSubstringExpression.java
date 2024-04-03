package com.docusign.maestro.model;

import java.util.Objects;
import java.util.Arrays;
import com.docusign.maestro.model.DSWorkflowTransformationExpressionTypesSubstringExpression;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;

/**
 * DSWorkflowSubstringExpression.
 *
 */

public class DSWorkflowSubstringExpression {
  @JsonProperty("length")
  private Object length = null;

  @JsonProperty("startIndex")
  private Object startIndex = null;

  @JsonProperty("text")
  private Object text = null;

  @JsonProperty("type")
  private DSWorkflowTransformationExpressionTypesSubstringExpression type = null;


  /**
   * length.
   *
   * @return DSWorkflowSubstringExpression
   **/
  public DSWorkflowSubstringExpression length(Object length) {
    this.length = length;
    return this;
  }

  /**
   * Reference of #/definitions/NumberOrVariable. Object stands for a number or a Variable. This object should be any of the following object models or types: [number, #/definitions/DSWorkflowVariable].
   * @return length
   **/
  @Schema(description = "Reference of #/definitions/NumberOrVariable. Object stands for a number or a Variable. This object should be any of the following object models or types: [number, #/definitions/DSWorkflowVariable]")
  public Object getLength() {
    return length;
  }

  /**
   * setLength.
   **/
  public void setLength(Object length) {
    this.length = length;
  }


  /**
   * startIndex.
   *
   * @return DSWorkflowSubstringExpression
   **/
  public DSWorkflowSubstringExpression startIndex(Object startIndex) {
    this.startIndex = startIndex;
    return this;
  }

  /**
   * Reference of #/definitions/NumberOrVariable. Object stands for a number or a Variable. This object should be any of the following object models or types: [number, #/definitions/DSWorkflowVariable].
   * @return startIndex
   **/
  @Schema(required = true, description = "Reference of #/definitions/NumberOrVariable. Object stands for a number or a Variable. This object should be any of the following object models or types: [number, #/definitions/DSWorkflowVariable]")
  public Object getStartIndex() {
    return startIndex;
  }

  /**
   * setStartIndex.
   **/
  public void setStartIndex(Object startIndex) {
    this.startIndex = startIndex;
  }


  /**
   * text.
   *
   * @return DSWorkflowSubstringExpression
   **/
  public DSWorkflowSubstringExpression text(Object text) {
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
   * @return DSWorkflowSubstringExpression
   **/
  public DSWorkflowSubstringExpression type(DSWorkflowTransformationExpressionTypesSubstringExpression type) {
    this.type = type;
    return this;
  }

  /**
   * Get type.
   * @return type
   **/
  @Schema(required = true, description = "")
  public DSWorkflowTransformationExpressionTypesSubstringExpression getType() {
    return type;
  }

  /**
   * setType.
   **/
  public void setType(DSWorkflowTransformationExpressionTypesSubstringExpression type) {
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
    DSWorkflowSubstringExpression dsWorkflowSubstringExpression = (DSWorkflowSubstringExpression) o;
    return Objects.equals(this.length, dsWorkflowSubstringExpression.length) &&
        Objects.equals(this.startIndex, dsWorkflowSubstringExpression.startIndex) &&
        Objects.equals(this.text, dsWorkflowSubstringExpression.text) &&
        Objects.equals(this.type, dsWorkflowSubstringExpression.type);
  }

  /**
   * Returns the HashCode.
   */
  @Override
  public int hashCode() {
    return Objects.hash(length, startIndex, text, type);
  }


  /**
   * Converts the given object to string.
   */
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DSWorkflowSubstringExpression {\n");
    
    sb.append("    length: ").append(toIndentedString(length)).append("\n");
    sb.append("    startIndex: ").append(toIndentedString(startIndex)).append("\n");
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

