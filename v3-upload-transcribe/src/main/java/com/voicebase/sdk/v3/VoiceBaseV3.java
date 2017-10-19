package com.voicebase.sdk.v3;

import com.voicebase.sample.v3client.VoicebaseV3MinimalClientImpl;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class VoiceBaseV3 extends VoicebaseV3MinimalClientImpl implements VoiceBase {

    public VoiceBaseV3() throws IOException {
        super(
                new String(
                        Files.readAllBytes(
                                Paths.get(
                                        ".voicebase-bearer-token"
                                )
                        )
                ).trim()
        );
    }
}
