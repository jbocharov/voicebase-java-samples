package com.voicebase.sdk.v3;

import com.voicebase.sample.v3client.BaseVoicebaseV3Client;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class VoiceBaseV3 extends BaseVoicebaseV3Client implements VoiceBase {

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

    public static void print(String description, Object value) {
        print(description + ": " + value.toString());
    }

    public static void print(String value) {
        System.out.println(value);
    }
}
