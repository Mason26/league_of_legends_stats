package com.example.leaguestats.Domain;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

public class ParticipantFramesDTO {

    private final FrameDetailsDTO frameDetailsDTO1;
    private final FrameDetailsDTO frameDetailsDTO2;
    private final FrameDetailsDTO frameDetailsDTO3;
    private final FrameDetailsDTO frameDetailsDTO4;
    private final FrameDetailsDTO frameDetailsDTO5;
    private final FrameDetailsDTO frameDetailsDTO6;
    private final FrameDetailsDTO frameDetailsDTO7;
    private final FrameDetailsDTO frameDetailsDTO8;
    private final FrameDetailsDTO frameDetailsDTO9;
    private final FrameDetailsDTO frameDetailsDTO10;

    @JsonCreator
    public ParticipantFramesDTO(
            @JsonProperty("1") FrameDetailsDTO frameDetailsDTO1,
            @JsonProperty("2") FrameDetailsDTO frameDetailsDTO2,
            @JsonProperty("3") FrameDetailsDTO frameDetailsDTO3,
            @JsonProperty("4") FrameDetailsDTO frameDetailsDTO4,
            @JsonProperty("5") FrameDetailsDTO frameDetailsDTO5,
            @JsonProperty("6") FrameDetailsDTO frameDetailsDTO6,
            @JsonProperty("7") FrameDetailsDTO frameDetailsDTO7,
            @JsonProperty("8") FrameDetailsDTO frameDetailsDTO8,
            @JsonProperty("9") FrameDetailsDTO frameDetailsDTO9,
            @JsonProperty("10") FrameDetailsDTO frameDetailsDTO10
    ) {
        this.frameDetailsDTO1 = frameDetailsDTO1;
        this.frameDetailsDTO2 = frameDetailsDTO2;
        this.frameDetailsDTO3 = frameDetailsDTO3;
        this.frameDetailsDTO4 = frameDetailsDTO4;
        this.frameDetailsDTO5 = frameDetailsDTO5;
        this.frameDetailsDTO6 = frameDetailsDTO6;
        this.frameDetailsDTO7 = frameDetailsDTO7;
        this.frameDetailsDTO8 = frameDetailsDTO8;
        this.frameDetailsDTO9 = frameDetailsDTO9;
        this.frameDetailsDTO10 = frameDetailsDTO10;
    }

    public FrameDetailsDTO getFrameDetailsDTO1() {
        return frameDetailsDTO1;
    }

    public FrameDetailsDTO getFrameDetailsDTO2() {
        return frameDetailsDTO2;
    }

    public FrameDetailsDTO getFrameDetailsDTO3() {
        return frameDetailsDTO3;
    }

    public FrameDetailsDTO getFrameDetailsDTO4() {
        return frameDetailsDTO4;
    }

    public FrameDetailsDTO getFrameDetailsDTO5() {
        return frameDetailsDTO5;
    }

    public FrameDetailsDTO getFrameDetailsDTO6() {
        return frameDetailsDTO6;
    }

    public FrameDetailsDTO getFrameDetailsDTO7() {
        return frameDetailsDTO7;
    }

    public FrameDetailsDTO getFrameDetailsDTO8() {
        return frameDetailsDTO8;
    }

    public FrameDetailsDTO getFrameDetailsDTO9() {
        return frameDetailsDTO9;
    }

    public FrameDetailsDTO getFrameDetailsDTO10() {
        return frameDetailsDTO10;
    }
}
