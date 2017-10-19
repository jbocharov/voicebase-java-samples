package com.voicebase.example;

import com.voicebase.sample.v3client.ApiException;
import com.voicebase.sdk.v3.VoiceBase;
import com.voicebase.sample.v3client.model.VbMedia;
import com.voicebase.sample.v3client.model.VbStatusEnum;
import com.voicebase.sdk.v3.VoiceBaseV3;
import org.junit.Test;

import java.io.File;
import java.io.IOException;

public class Demo {

    @Test
    public void demo() throws Exception {

        VoiceBaseV3 v3 = new VoiceBaseV3();
        VbMedia media = v3.postMedia(new File("test.mp3"));

        System.out.println("mediaId: " + media.getMediaId());

        while (media.getStatus() != VbStatusEnum.FINISHED) {
            System.out.println("status: " + media.getStatus());
            Thread.sleep(1000);
            media = v3.getMediaById(media.getMediaId());
        }

        System.out.println("Result: " + media.toString());

    }
}
