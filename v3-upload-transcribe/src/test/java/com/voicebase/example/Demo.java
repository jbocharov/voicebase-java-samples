package com.voicebase.example;

import com.voicebase.sdk.v3.VoiceBase;
import com.voicebase.sample.v3client.model.VbMedia;
import com.voicebase.sample.v3client.model.VbStatusEnum;
import com.voicebase.sdk.v3.VoiceBaseV3;
import static com.voicebase.sdk.v3.VoiceBaseV3.print;
import org.junit.Test;

import java.io.File;

public class Demo {

    @Test public void demo() throws Exception {

        VoiceBase v3 = new VoiceBaseV3();

        VbMedia media = v3.postMedia(new File("test.mp3"));
        print(media.getMediaId());


        while (media.getStatus() != VbStatusEnum.FINISHED) {
            print(media.getStatus());
            media = v3.getMediaById(media.getMediaId());
        }

        print(media);

    }

}
