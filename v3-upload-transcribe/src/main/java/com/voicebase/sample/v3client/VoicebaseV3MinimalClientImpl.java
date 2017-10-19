package com.voicebase.sample.v3client;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import com.voicebase.sample.v3client.model.VbConfiguration;
import com.voicebase.sample.v3client.model.VbMedia;
import com.voicebase.sample.v3client.model.VbMetadata;

import java.io.File;
import java.io.IOException;
import java.util.List;

import com.voicebase.sdk.v3.VoiceBase;
import org.apache.http.*;
import org.apache.http.client.*;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.mime.MultipartEntityBuilder;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;


public class VoicebaseV3MinimalClientImpl implements VoiceBase {

    public VoicebaseV3MinimalClientImpl() {
        initialize(null);
    }

    public VoicebaseV3MinimalClientImpl(String bearerToken) {
        initialize(bearerToken);
    }

    @Override
    public VbMedia getMediaById(String mediaId) throws ApiException {

        checkThatArgumentIsNotNull(mediaId, "mediaId");

        checkThatBearerTokenIsNotNull();
        return getMediaById(mediaId, null);
    }

    @Override
    public VbMedia getMediaById(String mediaId, List<String> includeAlternateFormat) throws ApiException {
        checkThatBearerTokenIsNotNull();

        try {

            final String url = VOICEBASE_V3_MEDIA_SLASH + mediaId;
            final ObjectMapper objectMapper = this.objectMapper;

            try (CloseableHttpClient httpClient = HttpClients.createDefault()) {
                HttpGet httpGet = new HttpGet(url);
                httpGet.setHeader(AUTHORIZATION, this.authorizationHeader);

                VbMedia response = httpClient.execute(httpGet, new VoiceBaseResponseHandler<>(VbMedia.class));

                return response;
            }

        } catch (IOException ioe) {
            throw new ApiException(ioe);
        }
    }

    @Override
    public VbMedia postMedia(File media) throws ApiException {
        return postMedia(media, null, null, null);
    }

    @Override
    public VbMedia postMedia(File media, VbConfiguration configuration) throws ApiException {
        return postMedia(media, null, configuration, null);
    }

    @Override
    public VbMedia postMedia(File media, VbMetadata metadata) throws ApiException {
        return postMedia(media, null, null, metadata);
    }

    @Override
    public VbMedia postMedia(File media, VbConfiguration configuration, VbMetadata metadata) throws ApiException {
        return postMedia(media, null, configuration, metadata);
    }

    @Override
    public VbMedia postMedia(String mediaUrl) throws ApiException {
        return postMedia(null, mediaUrl, null, null);
    }

    @Override
    public VbMedia postMedia(String mediaUrl, VbConfiguration configuration) throws ApiException {
        return postMedia(null, mediaUrl, configuration, null);
    }

    @Override
    public VbMedia postMedia(String mediaUrl, VbMetadata metadata) throws ApiException {
        return postMedia(null, mediaUrl, null, metadata);
    }

    @Override
    public VbMedia postMedia(String mediaUrl, VbConfiguration configuration, VbMetadata metadata) throws ApiException {
        return postMedia(null, mediaUrl, configuration, metadata);
    }

    /**
     * This method provides a common POST /media, whether by Url or attachment.
     * @param media Media file attached to the request.
     * @param mediaUrl URL where media file can be downloaded.
     * @param configuration A JSON object with configuration options.
     * @param metadata Metadata about the file being posted.
     * @return a VbMedia response entity
     * @throws ApiException
     */
    public VbMedia postMedia(File media, String mediaUrl, VbConfiguration configuration, VbMetadata metadata) throws ApiException {

        if ((media == null && mediaUrl == null) || (media != null && mediaUrl != null)) {
            throw new IllegalArgumentException("Exactly one of media and mediaUrl must not be null");
        }

        checkThatBearerTokenIsNotNull();

        final String url = VOICEBASE_V3_MEDIA;

        try (CloseableHttpClient httpClient = HttpClients.createDefault()) {

            HttpPost httpPost = new HttpPost(url);
            httpPost.setHeader(AUTHORIZATION, this.authorizationHeader);

            MultipartEntityBuilder entityBuilder = MultipartEntityBuilder.create();

            if (mediaUrl != null) {
                entityBuilder.addTextBody(MEDIA_URL, mediaUrl);
            }
            if (media != null) {
                entityBuilder.addBinaryBody(MEDIA, media);
            }
            if (configuration != null) {
                entityBuilder.addTextBody(CONFIGURATION, objectMapper.writeValueAsString(configuration));
            }
            if (metadata != null) {
                entityBuilder.addTextBody(METADATA, objectMapper.writeValueAsString(metadata));
            }

            httpPost.setEntity(entityBuilder.build());

            VbMedia response = httpClient.execute(httpPost, new VoiceBaseResponseHandler<>(VbMedia.class));

            return response;

        } catch (IOException ioe) {
            throw new ApiException(ioe);
        }
    }

    @Override
    public String getBearerToken() {

        return this.bearerToken;
    }

    @Override
    public void setBearerToken(String bearerToken) {
        if (bearerToken == null || bearerToken.isEmpty()) {
            throw new IllegalArgumentException("bearerToken cannot be null or empty");
        }

        this.bearerToken = bearerToken;
        this.authorizationHeader = new StringBuilder(BEARER).append(SPACE).append(bearerToken).toString();
    }

    protected <T> void checkThatArgumentIsNotNull(final T argument, final String argumentName) {
        if (argument == null) {
            throw new IllegalArgumentException(argumentName + " cannot be null");
        }
    }

    protected void checkThatBearerTokenIsNotNull() {
        if (this.authorizationHeader == null || this.bearerToken == null) {
            throw new IllegalStateException("Bearer token must be set before use");
        }
    }

    protected void initialize(final String bearerToken) {
        if (bearerToken != null) { setBearerToken(bearerToken); }

        this.objectMapper = new ObjectMapper();
        this.objectMapper.setSerializationInclusion(JsonInclude.Include.NON_NULL);
        this.objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        this.objectMapper.disable(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS);
        this.objectMapper.enable(SerializationFeature.WRITE_ENUMS_USING_TO_STRING);
        this.objectMapper.enable(DeserializationFeature.READ_ENUMS_USING_TO_STRING);
        this.objectMapper.setDateFormat(new RFC3339DateFormat());
        this.objectMapper.registerModule(new JavaTimeModule());

    }

    protected String bearerToken;

    protected String authorizationHeader;

    protected ObjectMapper objectMapper;

    protected class VoiceBaseResponseHandler<T> implements ResponseHandler<T> {

        public VoiceBaseResponseHandler(Class<T> clazz) {
            this.clazz = clazz;
        }

        @Override
        public T handleResponse(HttpResponse httpResponse) throws IOException {

            final StatusLine statusLine = httpResponse.getStatusLine();
            if (statusLine.getStatusCode() > 300) {
                throw new IOException(Integer.toString(statusLine.getStatusCode()));
            }

            final HttpEntity httpEntity = httpResponse.getEntity();
            if (httpEntity == null) {
                throw new IOException("Received an empty response");
            }

            // For production usage, consider streaming the data into Jackson rather than via String
            final String responseJson = EntityUtils.toString(httpEntity);

            final T result = objectMapper.readValue(responseJson, clazz);

            return result;
        }

        protected Class<T> clazz;

    }

    protected final static String AUTHORIZATION = "Authorization";

    protected final static String BEARER = "Bearer";

    protected final static String CONFIGURATION = "configuration";

    protected final static String MEDIA = "media";

    protected final static String MEDIA_URL = "mediaUrl";

    protected final static String METADATA = "metadata";

    protected final static String SPACE = " ";

    protected final static String SLASH = "/";

    protected final static String VOICEBASE_V3_ENDPOINT = "https://apis.voicebase.com/v3";

    protected final static String VOICEBASE_V3_MEDIA = VOICEBASE_V3_ENDPOINT + "/media";

    protected final static String VOICEBASE_V3_MEDIA_SLASH = VOICEBASE_V3_MEDIA + SLASH;


}
