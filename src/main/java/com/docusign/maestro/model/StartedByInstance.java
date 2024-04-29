package com.docusign.maestro.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;

/**
 * The started by information for a workflow instance.
 *
 */
@Schema(description = "The started by information for a workflow instance")

public class StartedByInstance {
  @JsonProperty("startedById")
  private String startedById = null;

  @JsonProperty("startedByName")
  private String startedByName = null;

  /**
   * Gets or Sets startedByType
   */
  public enum StartedByTypeEnum {
    ANONYMOUS("Anonymous"),
    
    PREPARER("Preparer"),
    
    PARTICIPANT("Participant"),
    
    ONBEHALFOF("OnBehalfOf");

    private String value;

    StartedByTypeEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static StartedByTypeEnum fromValue(String value) {
      for (StartedByTypeEnum b : StartedByTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("startedByType")
  private StartedByTypeEnum startedByType = null;


  /**
   * startedById.
   *
   * @return StartedByInstance
   **/
  public StartedByInstance startedById(String startedById) {
    this.startedById = startedById;
    return this;
  }

  /**
   * Get startedById.
   * @return startedById
   **/
  @Schema(description = "")
  public String getStartedById() {
    return startedById;
  }

  /**
   * setStartedById.
   **/
  public void setStartedById(String startedById) {
    this.startedById = startedById;
  }


  /**
   * startedByName.
   *
   * @return StartedByInstance
   **/
  public StartedByInstance startedByName(String startedByName) {
    this.startedByName = startedByName;
    return this;
  }

  /**
   * The user name of the person who starts a workflow Instance.
   * @return startedByName
   **/
  @Schema(description = "The user name of the person who starts a workflow Instance")
  public String getStartedByName() {
    return startedByName;
  }

  /**
   * setStartedByName.
   **/
  public void setStartedByName(String startedByName) {
    this.startedByName = startedByName;
  }


  /**
   * startedByType.
   *
   * @return StartedByInstance
   **/
  public StartedByInstance startedByType(StartedByTypeEnum startedByType) {
    this.startedByType = startedByType;
    return this;
  }

  /**
   * Get startedByType.
   * @return startedByType
   **/
  @Schema(description = "")
  public StartedByTypeEnum getStartedByType() {
    return startedByType;
  }

  /**
   * setStartedByType.
   **/
  public void setStartedByType(StartedByTypeEnum startedByType) {
    this.startedByType = startedByType;
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
    StartedByInstance startedByInstance = (StartedByInstance) o;
    return Objects.equals(this.startedById, startedByInstance.startedById) &&
        Objects.equals(this.startedByName, startedByInstance.startedByName) &&
        Objects.equals(this.startedByType, startedByInstance.startedByType);
  }

  /**
   * Returns the HashCode.
   */
  @Override
  public int hashCode() {
    return Objects.hash(startedById, startedByName, startedByType);
  }


  /**
   * Converts the given object to string.
   */
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StartedByInstance {\n");
    
    sb.append("    startedById: ").append(toIndentedString(startedById)).append("\n");
    sb.append("    startedByName: ").append(toIndentedString(startedByName)).append("\n");
    sb.append("    startedByType: ").append(toIndentedString(startedByType)).append("\n");
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

