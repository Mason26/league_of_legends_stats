package com.example.leaguestats.Domain;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class MetadataTimelineDTO {

    private final String matchId;
    private final List<String> participants;

    @JsonCreator
    public MetadataTimelineDTO(
            @JsonProperty("matchId") String matchId,
            @JsonProperty("participants") List<String> participants) {
        this.matchId = matchId;
        this.participants = participants;
    }

    @JsonGetter("matchId")
    public String getMatchId() {
        return matchId;
    }

    @JsonGetter("participants")
    public List<String> getParticipants() {
        return participants;
    }
}
