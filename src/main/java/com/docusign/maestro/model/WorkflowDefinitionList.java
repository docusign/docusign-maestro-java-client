package com.docusign.maestro.model;

import java.util.Objects;
import java.util.Arrays;
import com.docusign.maestro.model.WorkflowDefinitionMetadata;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import java.math.BigDecimal;

/**
 * Returns a list of workflow definitions&#39; metadata (0 or more)..
 *
 */
@Schema(description = "Returns a list of workflow definitions' metadata (0 or more).")

public class WorkflowDefinitionList {
  @JsonProperty("count")
  private BigDecimal count = null;

  @JsonProperty("value")
  private java.util.List<WorkflowDefinitionMetadata> value = null;


  /**
   * count.
   *
   * @return WorkflowDefinitionList
   **/
  public WorkflowDefinitionList count(BigDecimal count) {
    this.count = count;
    return this;
  }

  /**
   * Total number of definitions returned.
   * @return count
   **/
  @Schema(example = "1.0", description = "Total number of definitions returned")
  public BigDecimal getCount() {
    return count;
  }

  /**
   * setCount.
   **/
  public void setCount(BigDecimal count) {
    this.count = count;
  }


  /**
   * value.
   *
   * @return WorkflowDefinitionList
   **/
  public WorkflowDefinitionList value(java.util.List<WorkflowDefinitionMetadata> value) {
    this.value = value;
    return this;
  }
  
  /**
   * addValueItem.
   *
   * @return WorkflowDefinitionList
   **/
  public WorkflowDefinitionList addValueItem(WorkflowDefinitionMetadata valueItem) {
    if (this.value == null) {
      this.value = new java.util.ArrayList<>();
    }
    this.value.add(valueItem);
    return this;
  }

  /**
   * Array of workflow definition metadata.
   * @return value
   **/
  @Schema(description = "Array of workflow definition metadata")
  public java.util.List<WorkflowDefinitionMetadata> getValue() {
    return value;
  }

  /**
   * setValue.
   **/
  public void setValue(java.util.List<WorkflowDefinitionMetadata> value) {
    this.value = value;
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
    WorkflowDefinitionList workflowDefinitionList = (WorkflowDefinitionList) o;
    return Objects.equals(this.count, workflowDefinitionList.count) &&
        Objects.equals(this.value, workflowDefinitionList.value);
  }

  /**
   * Returns the HashCode.
   */
  @Override
  public int hashCode() {
    return Objects.hash(count, value);
  }


  /**
   * Converts the given object to string.
   */
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WorkflowDefinitionList {\n");
    
    sb.append("    count: ").append(toIndentedString(count)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
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

