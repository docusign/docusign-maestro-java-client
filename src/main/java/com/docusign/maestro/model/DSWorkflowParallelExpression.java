package com.docusign.maestro.model;

import java.util.Objects;
import java.util.Arrays;
import com.docusign.maestro.model.DSWorkflowExpressionTypesParallelExpression;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;

/**
 * DSWorkflowParallelExpression.
 *
 */

public class DSWorkflowParallelExpression {
  @JsonProperty("parallelCompletionSettings")
  private java.util.Map<String, Boolean> parallelCompletionSettings = new java.util.HashMap<>();

  @JsonProperty("type")
  private DSWorkflowExpressionTypesParallelExpression type = null;


  /**
   * parallelCompletionSettings.
   *
   * @return DSWorkflowParallelExpression
   **/
  public DSWorkflowParallelExpression parallelCompletionSettings(java.util.Map<String, Boolean> parallelCompletionSettings) {
    this.parallelCompletionSettings = parallelCompletionSettings;
    return this;
  }

  /**
   * putParallelCompletionSettingsItem.
   *
   * @return DSWorkflowParallelExpression
   **/
  public DSWorkflowParallelExpression putParallelCompletionSettingsItem(String key, Boolean parallelCompletionSettingsItem) {
    this.parallelCompletionSettings.put(key, parallelCompletionSettingsItem);
    return this;
  }

  /**
   * Get parallelCompletionSettings.
   * @return parallelCompletionSettings
   **/
  @Schema(required = true, description = "")
  public java.util.Map<String, Boolean> getParallelCompletionSettings() {
    return parallelCompletionSettings;
  }

  /**
   * setParallelCompletionSettings.
   **/
  public void setParallelCompletionSettings(java.util.Map<String, Boolean> parallelCompletionSettings) {
    this.parallelCompletionSettings = parallelCompletionSettings;
  }


  /**
   * type.
   *
   * @return DSWorkflowParallelExpression
   **/
  public DSWorkflowParallelExpression type(DSWorkflowExpressionTypesParallelExpression type) {
    this.type = type;
    return this;
  }

  /**
   * Get type.
   * @return type
   **/
  @Schema(required = true, description = "")
  public DSWorkflowExpressionTypesParallelExpression getType() {
    return type;
  }

  /**
   * setType.
   **/
  public void setType(DSWorkflowExpressionTypesParallelExpression type) {
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
    DSWorkflowParallelExpression dsWorkflowParallelExpression = (DSWorkflowParallelExpression) o;
    return Objects.equals(this.parallelCompletionSettings, dsWorkflowParallelExpression.parallelCompletionSettings) &&
        Objects.equals(this.type, dsWorkflowParallelExpression.type);
  }

  /**
   * Returns the HashCode.
   */
  @Override
  public int hashCode() {
    return Objects.hash(parallelCompletionSettings, type);
  }


  /**
   * Converts the given object to string.
   */
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DSWorkflowParallelExpression {\n");
    
    sb.append("    parallelCompletionSettings: ").append(toIndentedString(parallelCompletionSettings)).append("\n");
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

