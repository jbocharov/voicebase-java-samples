package com.voicebase.sample.v3client.test;

import com.voicebase.sample.v3client.ApiException;
import com.voicebase.sdk.v3.VoiceBase;
import com.voicebase.sample.v3client.VoicebaseV3MinimalClientImpl;

import com.voicebase.sample.v3client.model.VbMedia;
import com.voicebase.sample.v3client.model.VbStatusEnum;
import org.junit.Test;
import org.junit.Ignore;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.concurrent.TimeUnit;

public class VoicebaseV3MinimalClientTest {

    public VoicebaseV3MinimalClientTest() throws IOException {
        final String bearerToken = slurpFile(VOICEBASE_BEARER_TOKEN_FILE).trim();
        this.client = new VoicebaseV3MinimalClientImpl(bearerToken);
    }

    public void testGetExistingMedia() throws ApiException {
        final String mediaId = "86afca08-1110-49bb-801a-cfcc3fa2a7e3";
        VbMedia media = client.getMediaById(mediaId);
        assert mediaId.equals(media.getMediaId());

    }

    @Test
    public void uploadByUrlPollDownload() throws ApiException, InterruptedException {
        final String mediaUrl = "https://s3.amazonaws.com/voicebase-developer-test-content-dev/"
                + "voicebase-synthetic-pci-test-call.mp3";

        uploadPollDownload(null, mediaUrl);
    }

    @Test
    @Ignore("Re-enable to test upload by attachment")
    public void uploadByAttachmentPollDownload() throws ApiException, InterruptedException {
        final String mediaPath = "voicebase-synthetic-pci-test-call.mp3";

        uploadPollDownload(new File(mediaPath), null);
    }

    public void uploadPollDownload(final File media, final String mediaUrl) throws ApiException, InterruptedException {
        final int SECOND_BETWEEN_POLLS = 10;
        final int MAXIMUM_POLLING_ITERATIONS = 100;


        VbMedia response = (media != null)
                ? client.postMedia(media)
                : client.postMedia(mediaUrl);

        final String mediaId = response.getMediaId();

        assert response.getStatus() == VbStatusEnum.ACCEPTED;
        assert mediaId != null;

        // Poll every SECOND_BETWEEN_POLLS seconds until MAXIMUM_POLLING_ITERATIONS, while status != finished/failed

        for (int iteration = 0; response.getStatus() != VbStatusEnum.FINISHED
                && response.getStatus() != VbStatusEnum.FAILED
                && iteration < MAXIMUM_POLLING_ITERATIONS ; iteration ++) {

            TimeUnit.SECONDS.sleep(SECOND_BETWEEN_POLLS);
            response = client.getMediaById(mediaId);
        }

        assert response.getStatus() == VbStatusEnum.FINISHED;
    }

    protected String slurpFile(String path) throws IOException {
        return new String(Files.readAllBytes(Paths.get(path)));
    }

    protected VoiceBase client;

    protected final static String VOICEBASE_BEARER_TOKEN_FILE = ".voicebase-bearer-token";
}
