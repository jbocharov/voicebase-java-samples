/*
 * Voicebase V3 API
 * APIs for speech recognition and speech analytics, powering insights every business needs.
 *
 * OpenAPI spec version: 3.0.1
 * Contact: support@voicebase.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.voicebase.sample.v3client.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import com.voicebase.sample.v3client.model.VbTaskStatusEnum;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * VbProgressTask
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-10-12T18:19:19.705-07:00")
public class VbProgressTask {
  @JsonProperty("taskId")
  private String taskId = null;

  @JsonProperty("display")
  private String display = null;

  @JsonProperty("phase")
  private String phase = null;

  @JsonProperty("status")
  private VbTaskStatusEnum status = null;

  @JsonProperty("dependencies")
  private java.util.List<String> dependencies = new java.util.ArrayList<String>();

  @JsonProperty("dependents")
  private java.util.List<String> dependents = new java.util.ArrayList<String>();

  public VbProgressTask taskId(String taskId) {
    this.taskId = taskId;
    return this;
  }

   /**
   * Get taskId
   * @return taskId
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getTaskId() {
    return taskId;
  }

  public void setTaskId(String taskId) {
    this.taskId = taskId;
  }

  public VbProgressTask display(String display) {
    this.display = display;
    return this;
  }

   /**
   * Get display
   * @return display
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getDisplay() {
    return display;
  }

  public void setDisplay(String display) {
    this.display = display;
  }

  public VbProgressTask phase(String phase) {
    this.phase = phase;
    return this;
  }

   /**
   * Get phase
   * @return phase
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getPhase() {
    return phase;
  }

  public void setPhase(String phase) {
    this.phase = phase;
  }

  public VbProgressTask status(VbTaskStatusEnum status) {
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @ApiModelProperty(example = "null", value = "")
  public VbTaskStatusEnum getStatus() {
    return status;
  }

  public void setStatus(VbTaskStatusEnum status) {
    this.status = status;
  }

  public VbProgressTask dependencies(java.util.List<String> dependencies) {
    this.dependencies = dependencies;
    return this;
  }

  public VbProgressTask addDependenciesItem(String dependenciesItem) {
    this.dependencies.add(dependenciesItem);
    return this;
  }

   /**
   * Get dependencies
   * @return dependencies
  **/
  @ApiModelProperty(example = "null", value = "")
  public java.util.List<String> getDependencies() {
    return dependencies;
  }

  public void setDependencies(java.util.List<String> dependencies) {
    this.dependencies = dependencies;
  }

  public VbProgressTask dependents(java.util.List<String> dependents) {
    this.dependents = dependents;
    return this;
  }

  public VbProgressTask addDependentsItem(String dependentsItem) {
    this.dependents.add(dependentsItem);
    return this;
  }

   /**
   * Get dependents
   * @return dependents
  **/
  @ApiModelProperty(example = "null", value = "")
  public java.util.List<String> getDependents() {
    return dependents;
  }

  public void setDependents(java.util.List<String> dependents) {
    this.dependents = dependents;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VbProgressTask vbProgressTask = (VbProgressTask) o;
    return Objects.equals(this.taskId, vbProgressTask.taskId) &&
        Objects.equals(this.display, vbProgressTask.display) &&
        Objects.equals(this.phase, vbProgressTask.phase) &&
        Objects.equals(this.status, vbProgressTask.status) &&
        Objects.equals(this.dependencies, vbProgressTask.dependencies) &&
        Objects.equals(this.dependents, vbProgressTask.dependents);
  }

  @Override
  public int hashCode() {
    return Objects.hash(taskId, display, phase, status, dependencies, dependents);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VbProgressTask {\n");
    
    sb.append("    taskId: ").append(toIndentedString(taskId)).append("\n");
    sb.append("    display: ").append(toIndentedString(display)).append("\n");
    sb.append("    phase: ").append(toIndentedString(phase)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    dependencies: ").append(toIndentedString(dependencies)).append("\n");
    sb.append("    dependents: ").append(toIndentedString(dependents)).append("\n");
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

