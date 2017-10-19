package com.voicebase.sdk.v3;

import java.util.List;

import com.voicebase.sample.v3client.ApiException;
import com.voicebase.sample.v3client.model.VbMedia;
import com.voicebase.sample.v3client.model.VbConfiguration;
import com.voicebase.sample.v3client.model.VbMetadata;

import java.io.File;

public interface VoiceBase {

    /**
     * Retrieve transcript and analytical results from a media record
     * Retrieve analytical results from a previously uploaded media
     * @param mediaId Media identifier, a UUID.
     * @return VbMedia
     * @throws ApiException if fails to make API call
     */
    public VbMedia getMediaById(String mediaId) throws ApiException;

    /**
     * Retrieve transcript and analytical results from a media record
     * Retrieve analytical results from a previously uploaded media
     * @param mediaId Media identifier, a UUID.
     * @param includeAlternateFormat Set of alternate formats to include in the response
     * @return VbMedia
     * @throws ApiException if fails to make API call
     */
    public VbMedia getMediaById(String mediaId, List<String> includeAlternateFormat) throws ApiException;

    /**
     * Upload a media file for transcription and analysis
     * Upload new new media to the service as an attachment or from a url
     * @param media Media file attached to the request.
     * @return VbMedia
     * @throws ApiException if fails to make API call
     */
    VbMedia postMedia(File media) throws ApiException;

    /**
     * Upload a media file for transcription and analysis
     * Upload new new media to the service as an attachment or from a url
     * @param media Media file attached to the request.
     * @param configuration A JSON object with configuration options.
     * @return VbMedia
     * @throws ApiException if fails to make API call
     */
    VbMedia postMedia(File media, VbConfiguration configuration) throws ApiException;

    /**
     * Upload a media file for transcription and analysis
     * Upload new new media to the service as an attachment or from a url
     * @param media Media file attached to the request.
     * @param metadata Metadata about the file being posted.
     * @return VbMedia
     * @throws ApiException if fails to make API call
     */
    VbMedia postMedia(File media, VbMetadata metadata) throws ApiException;

    /**
     * Upload a media file for transcription and analysis
     * Upload new new media to the service as an attachment or from a url
     * @param media Media file attached to the request.
     * @param configuration A JSON object with configuration options.
     * @param metadata Metadata about the file being posted.
     * @return VbMedia
     * @throws ApiException if fails to make API call
     */
    VbMedia postMedia(File media, VbConfiguration configuration, VbMetadata metadata) throws ApiException;

    /**
     * Upload a media file for transcription and analysis
     * Upload new new media to the service as an attachment or from a url
     * @param mediaUrl URL where media file can be downloaded.
     * @return VbMedia
     * @throws ApiException if fails to make API call
     */
    VbMedia postMedia(String mediaUrl) throws ApiException;

    /**
     * Upload a media file for transcription and analysis
     * Upload new new media to the service as an attachment or from a url
     * @param mediaUrl URL where media file can be downloaded.
     * @param configuration A JSON object with configuration options.
     * @return VbMedia
     * @throws ApiException if fails to make API call
     */
    VbMedia postMedia(String mediaUrl, VbConfiguration configuration) throws ApiException;

    /**
     * Upload a media file for transcription and analysis
     * Upload new new media to the service as an attachment or from a url
     * @param mediaUrl URL where media file can be downloaded.
     * @param metadata Metadata about the file being posted.
     * @return VbMedia
     * @throws ApiException if fails to make API call
     */
    VbMedia postMedia(String mediaUrl, VbMetadata metadata) throws ApiException;

    /**
     * Upload a media file for transcription and analysis
     * Upload new new media to the service as an attachment or from a url
     * @param mediaUrl URL where media file can be downloaded.
     * @param configuration A JSON object with configuration options.
     * @param metadata Metadata about the file being posted.
     * @return VbMedia
     * @throws ApiException if fails to make API call
     */
    VbMedia postMedia(String mediaUrl, VbConfiguration configuration, VbMetadata metadata) throws ApiException;

    /**
     * Get the VoiceBase Bearer token used for authentication.
     * @return Bearer Token
     */
    String getBearerToken();

    /**
     * Set the VoiceBase Bearer token used for authentication
     * @param bearerToken VoiceBase Bearer token to use for authentication
     */
    void setBearerToken(String bearerToken);

}
