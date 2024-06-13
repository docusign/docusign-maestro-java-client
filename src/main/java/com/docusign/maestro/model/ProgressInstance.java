package com.docusign.maestro.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import java.math.BigDecimal;
import java.io.Serializable;

/**
 * The progress information for a workflow instance.
 *
 */
@Schema(description = "The progress information for a workflow instance")

public class ProgressInstance implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("completedSteps")
  private BigDecimal completedSteps = null;

  @JsonProperty("currentCompletedStepName")
  private String currentCompletedStepName = null;

  @JsonProperty("totalSteps")
  private BigDecimal totalSteps = null;


  /**
   * completedSteps.
   *
   * @return ProgressInstance
   **/
  public ProgressInstance completedSteps(BigDecimal completedSteps) {
    this.completedSteps = completedSteps;
    return this;
  }

  /**
   * The number of completed steps for this workflow instance.
   * @return completedSteps
   **/
  @Schema(description = "The number of completed steps for this workflow instance")
  public BigDecimal getCompletedSteps() {
    return completedSteps;
  }

  /**
   * setCompletedSteps.
   **/
  public void setCompletedSteps(BigDecimal completedSteps) {
    this.completedSteps = completedSteps;
  }


  /**
   * currentCompletedStepName.
   *
   * @return ProgressInstance
   **/
  public ProgressInstance currentCompletedStepName(String currentCompletedStepName) {
    this.currentCompletedStepName = currentCompletedStepName;
    return this;
  }

  /**
   * The last completed step name.
   * @return currentCompletedStepName
   **/
  @Schema(description = "The last completed step name")
  public String getCurrentCompletedStepName() {
    return currentCompletedStepName;
  }

  /**
   * setCurrentCompletedStepName.
   **/
  public void setCurrentCompletedStepName(String currentCompletedStepName) {
    this.currentCompletedStepName = currentCompletedStepName;
  }


  /**
   * totalSteps.
   *
   * @return ProgressInstance
   **/
  public ProgressInstance totalSteps(BigDecimal totalSteps) {
    this.totalSteps = totalSteps;
    return this;
  }

  /**
   * The total number of steps for this workflow instance.
   * @return totalSteps
   **/
  @Schema(description = "The total number of steps for this workflow instance")
  public BigDecimal getTotalSteps() {
    return totalSteps;
  }

  /**
   * setTotalSteps.
   **/
  public void setTotalSteps(BigDecimal totalSteps) {
    this.totalSteps = totalSteps;
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
    ProgressInstance progressInstance = (ProgressInstance) o;
    return Objects.equals(this.completedSteps, progressInstance.completedSteps) &&
        Objects.equals(this.currentCompletedStepName, progressInstance.currentCompletedStepName) &&
        Objects.equals(this.totalSteps, progressInstance.totalSteps);
  }

  /**
   * Returns the HashCode.
   */
  @Override
  public int hashCode() {
    return Objects.hash(completedSteps, currentCompletedStepName, totalSteps);
  }


  /**
   * Converts the given object to string.
   */
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProgressInstance {\n");
    
    sb.append("    completedSteps: ").append(toIndentedString(completedSteps)).append("\n");
    sb.append("    currentCompletedStepName: ").append(toIndentedString(currentCompletedStepName)).append("\n");
    sb.append("    totalSteps: ").append(toIndentedString(totalSteps)).append("\n");
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

