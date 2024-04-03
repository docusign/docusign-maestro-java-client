package com.docusign.maestro.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;

/**
 * DSIdvStepInput.
 *
 */

public class DSIdvStepInput {
  @JsonProperty("backgroundColorBranding")
  private Object backgroundColorBranding = null;

  @JsonProperty("expectedFullName")
  private Object expectedFullName = null;

  @JsonProperty("retryLimit")
  private Object retryLimit = null;

  @JsonProperty("textColorBranding")
  private Object textColorBranding = null;


  /**
   * backgroundColorBranding.
   *
   * @return DSIdvStepInput
   **/
  public DSIdvStepInput backgroundColorBranding(Object backgroundColorBranding) {
    this.backgroundColorBranding = backgroundColorBranding;
    return this;
  }

  /**
   * Reference of #/definitions/StringOrVariableOrTransformation. Object stands for a String or a Variable or a Transformation. This object should be any of the following object models or types: [string, #/definitions/DSWorkflowVariable, #/definitions/DSWorkflowTransformationExpression].
   * @return backgroundColorBranding
   **/
  @Schema(required = true, description = "Reference of #/definitions/StringOrVariableOrTransformation. Object stands for a String or a Variable or a Transformation. This object should be any of the following object models or types: [string, #/definitions/DSWorkflowVariable, #/definitions/DSWorkflowTransformationExpression]")
  public Object getBackgroundColorBranding() {
    return backgroundColorBranding;
  }

  /**
   * setBackgroundColorBranding.
   **/
  public void setBackgroundColorBranding(Object backgroundColorBranding) {
    this.backgroundColorBranding = backgroundColorBranding;
  }


  /**
   * expectedFullName.
   *
   * @return DSIdvStepInput
   **/
  public DSIdvStepInput expectedFullName(Object expectedFullName) {
    this.expectedFullName = expectedFullName;
    return this;
  }

  /**
   * Reference of #/definitions/StringOrVariableOrTransformation. Object stands for a String or a Variable or a Transformation. This object should be any of the following object models or types: [string, #/definitions/DSWorkflowVariable, #/definitions/DSWorkflowTransformationExpression].
   * @return expectedFullName
   **/
  @Schema(required = true, description = "Reference of #/definitions/StringOrVariableOrTransformation. Object stands for a String or a Variable or a Transformation. This object should be any of the following object models or types: [string, #/definitions/DSWorkflowVariable, #/definitions/DSWorkflowTransformationExpression]")
  public Object getExpectedFullName() {
    return expectedFullName;
  }

  /**
   * setExpectedFullName.
   **/
  public void setExpectedFullName(Object expectedFullName) {
    this.expectedFullName = expectedFullName;
  }


  /**
   * retryLimit.
   *
   * @return DSIdvStepInput
   **/
  public DSIdvStepInput retryLimit(Object retryLimit) {
    this.retryLimit = retryLimit;
    return this;
  }

  /**
   * This object should be any of the following object models or types: [number, #/definitions/DSWorkflowVariable, #/definitions/DSWorkflowTransformationExpression].
   * @return retryLimit
   **/
  @Schema(required = true, description = "This object should be any of the following object models or types: [number, #/definitions/DSWorkflowVariable, #/definitions/DSWorkflowTransformationExpression]")
  public Object getRetryLimit() {
    return retryLimit;
  }

  /**
   * setRetryLimit.
   **/
  public void setRetryLimit(Object retryLimit) {
    this.retryLimit = retryLimit;
  }


  /**
   * textColorBranding.
   *
   * @return DSIdvStepInput
   **/
  public DSIdvStepInput textColorBranding(Object textColorBranding) {
    this.textColorBranding = textColorBranding;
    return this;
  }

  /**
   * Reference of #/definitions/StringOrVariableOrTransformation. Object stands for a String or a Variable or a Transformation. This object should be any of the following object models or types: [string, #/definitions/DSWorkflowVariable, #/definitions/DSWorkflowTransformationExpression].
   * @return textColorBranding
   **/
  @Schema(required = true, description = "Reference of #/definitions/StringOrVariableOrTransformation. Object stands for a String or a Variable or a Transformation. This object should be any of the following object models or types: [string, #/definitions/DSWorkflowVariable, #/definitions/DSWorkflowTransformationExpression]")
  public Object getTextColorBranding() {
    return textColorBranding;
  }

  /**
   * setTextColorBranding.
   **/
  public void setTextColorBranding(Object textColorBranding) {
    this.textColorBranding = textColorBranding;
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
    DSIdvStepInput dsIdvStepInput = (DSIdvStepInput) o;
    return Objects.equals(this.backgroundColorBranding, dsIdvStepInput.backgroundColorBranding) &&
        Objects.equals(this.expectedFullName, dsIdvStepInput.expectedFullName) &&
        Objects.equals(this.retryLimit, dsIdvStepInput.retryLimit) &&
        Objects.equals(this.textColorBranding, dsIdvStepInput.textColorBranding);
  }

  /**
   * Returns the HashCode.
   */
  @Override
  public int hashCode() {
    return Objects.hash(backgroundColorBranding, expectedFullName, retryLimit, textColorBranding);
  }


  /**
   * Converts the given object to string.
   */
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DSIdvStepInput {\n");
    
    sb.append("    backgroundColorBranding: ").append(toIndentedString(backgroundColorBranding)).append("\n");
    sb.append("    expectedFullName: ").append(toIndentedString(expectedFullName)).append("\n");
    sb.append("    retryLimit: ").append(toIndentedString(retryLimit)).append("\n");
    sb.append("    textColorBranding: ").append(toIndentedString(textColorBranding)).append("\n");
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

