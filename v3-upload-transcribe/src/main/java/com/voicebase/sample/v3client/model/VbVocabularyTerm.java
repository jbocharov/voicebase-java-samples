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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * VbVocabularyTerm
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-10-12T18:19:19.705-07:00")
public class VbVocabularyTerm {
  @JsonProperty("term")
  private String term = null;

  @JsonProperty("soundsLike")
  private java.util.List<String> soundsLike = new java.util.ArrayList<String>();

  @JsonProperty("weight")
  private Integer weight = null;

  public VbVocabularyTerm term(String term) {
    this.term = term;
    return this;
  }

   /**
   * Get term
   * @return term
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getTerm() {
    return term;
  }

  public void setTerm(String term) {
    this.term = term;
  }

  public VbVocabularyTerm soundsLike(java.util.List<String> soundsLike) {
    this.soundsLike = soundsLike;
    return this;
  }

  public VbVocabularyTerm addSoundsLikeItem(String soundsLikeItem) {
    this.soundsLike.add(soundsLikeItem);
    return this;
  }

   /**
   * Get soundsLike
   * @return soundsLike
  **/
  @ApiModelProperty(example = "null", value = "")
  public java.util.List<String> getSoundsLike() {
    return soundsLike;
  }

  public void setSoundsLike(java.util.List<String> soundsLike) {
    this.soundsLike = soundsLike;
  }

  public VbVocabularyTerm weight(Integer weight) {
    this.weight = weight;
    return this;
  }

   /**
   * Get weight
   * @return weight
  **/
  @ApiModelProperty(example = "null", value = "")
  public Integer getWeight() {
    return weight;
  }

  public void setWeight(Integer weight) {
    this.weight = weight;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VbVocabularyTerm vbVocabularyTerm = (VbVocabularyTerm) o;
    return Objects.equals(this.term, vbVocabularyTerm.term) &&
        Objects.equals(this.soundsLike, vbVocabularyTerm.soundsLike) &&
        Objects.equals(this.weight, vbVocabularyTerm.weight);
  }

  @Override
  public int hashCode() {
    return Objects.hash(term, soundsLike, weight);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VbVocabularyTerm {\n");
    
    sb.append("    term: ").append(toIndentedString(term)).append("\n");
    sb.append("    soundsLike: ").append(toIndentedString(soundsLike)).append("\n");
    sb.append("    weight: ").append(toIndentedString(weight)).append("\n");
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

