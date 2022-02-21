package com.example.leaguestats.Domain;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonProperty;

public class FramesDTO {

    private final ParticipantFramesDTO participantFrames;
    private final long timestamp;

    @JsonCreator
    public FramesDTO(
            @JsonProperty("participantFrames") ParticipantFramesDTO participantFrames,
            @JsonProperty("timestamp") long timestamp) {
        this.participantFrames = participantFrames;
        this.timestamp = timestamp;
    }

    @JsonGetter("participantFrames")
    public ParticipantFramesDTO getParticipantFrames() {
        return participantFrames;
    }

    @JsonGetter("timestamp")
    public long getTimestamp() {
        return timestamp;
    }
}
