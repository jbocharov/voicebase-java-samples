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
import com.voicebase.sample.v3client.model.ArrayList;
import com.voicebase.sample.v3client.model.VbChannelConfiguration;
import com.voicebase.sample.v3client.model.VbStereoConfiguration;
import com.voicebase.sample.v3client.model.VbTrackConfiguration;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * VbIngestConfiguration
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-10-12T18:19:19.705-07:00")
public class VbIngestConfiguration {
  @JsonProperty("speakerName")
  private String speakerName = null;

  @JsonProperty("speakerRole")
  private String speakerRole = null;

  @JsonProperty("channels")
  private java.util.List<VbChannelConfiguration> channels = new java.util.ArrayList<VbChannelConfiguration>();

  @JsonProperty("stereo")
  private VbStereoConfiguration stereo = null;

  @JsonProperty("tracks")
  private java.util.List<VbTrackConfiguration> tracks = new java.util.ArrayList<VbTrackConfiguration>();

  public VbIngestConfiguration speakerName(String speakerName) {
    this.speakerName = speakerName;
    return this;
  }

   /**
   * Speaker name. Defaults to \"Speaker\". If this attribute is specified, all channels are mixed into a single one.
   * @return speakerName
  **/
  @ApiModelProperty(example = "null", value = "Speaker name. Defaults to \"Speaker\". If this attribute is specified, all channels are mixed into a single one.")
  public String getSpeakerName() {
    return speakerName;
  }

  public void setSpeakerName(String speakerName) {
    this.speakerName = speakerName;
  }

  public VbIngestConfiguration speakerRole(String speakerRole) {
    this.speakerRole = speakerRole;
    return this;
  }

   /**
   * A description of the speaker role. Only used as metadata.
   * @return speakerRole
  **/
  @ApiModelProperty(example = "null", value = "A description of the speaker role. Only used as metadata.")
  public String getSpeakerRole() {
    return speakerRole;
  }

  public void setSpeakerRole(String speakerRole) {
    this.speakerRole = speakerRole;
  }

  public VbIngestConfiguration channels(java.util.List<VbChannelConfiguration> channels) {
    this.channels = channels;
    return this;
  }

  public VbIngestConfiguration addChannelsItem(VbChannelConfiguration channelsItem) {
    this.channels.add(channelsItem);
    return this;
  }

   /**
   * List of channels to process, mutually exclusive with \"tracks\", \"stereo\" and \"speakerName\"
   * @return channels
  **/
  @ApiModelProperty(example = "null", value = "List of channels to process, mutually exclusive with \"tracks\", \"stereo\" and \"speakerName\"")
  public java.util.List<VbChannelConfiguration> getChannels() {
    return channels;
  }

  public void setChannels(java.util.List<VbChannelConfiguration> channels) {
    this.channels = channels;
  }

  public VbIngestConfiguration stereo(VbStereoConfiguration stereo) {
    this.stereo = stereo;
    return this;
  }

   /**
   * Indicates to process two channels of the media.
   * @return stereo
  **/
  @ApiModelProperty(example = "null", value = "Indicates to process two channels of the media.")
  public VbStereoConfiguration getStereo() {
    return stereo;
  }

  public void setStereo(VbStereoConfiguration stereo) {
    this.stereo = stereo;
  }

  public VbIngestConfiguration tracks(java.util.List<VbTrackConfiguration> tracks) {
    this.tracks = tracks;
    return this;
  }

  public VbIngestConfiguration addTracksItem(VbTrackConfiguration tracksItem) {
    this.tracks.add(tracksItem);
    return this;
  }

   /**
   * List of tracks to process, mutually exclusive with \"channels\", \"stereo\" and \"speakerName\"
   * @return tracks
  **/
  @ApiModelProperty(example = "null", value = "List of tracks to process, mutually exclusive with \"channels\", \"stereo\" and \"speakerName\"")
  public java.util.List<VbTrackConfiguration> getTracks() {
    return tracks;
  }

  public void setTracks(java.util.List<VbTrackConfiguration> tracks) {
    this.tracks = tracks;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VbIngestConfiguration vbIngestConfiguration = (VbIngestConfiguration) o;
    return Objects.equals(this.speakerName, vbIngestConfiguration.speakerName) &&
        Objects.equals(this.speakerRole, vbIngestConfiguration.speakerRole) &&
        Objects.equals(this.channels, vbIngestConfiguration.channels) &&
        Objects.equals(this.stereo, vbIngestConfiguration.stereo) &&
        Objects.equals(this.tracks, vbIngestConfiguration.tracks);
  }

  @Override
  public int hashCode() {
    return Objects.hash(speakerName, speakerRole, channels, stereo, tracks);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VbIngestConfiguration {\n");
    
    sb.append("    speakerName: ").append(toIndentedString(speakerName)).append("\n");
    sb.append("    speakerRole: ").append(toIndentedString(speakerRole)).append("\n");
    sb.append("    channels: ").append(toIndentedString(channels)).append("\n");
    sb.append("    stereo: ").append(toIndentedString(stereo)).append("\n");
    sb.append("    tracks: ").append(toIndentedString(tracks)).append("\n");
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
