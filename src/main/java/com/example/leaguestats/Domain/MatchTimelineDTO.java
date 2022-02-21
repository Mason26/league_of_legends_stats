package com.example.leaguestats.Domain;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

public class MatchTimelineDTO {

    private final InfoTimelineDTO infoTimelineDTO;

    @JsonCreator
    public MatchTimelineDTO(
            @JsonProperty("info") InfoTimelineDTO infoTimelineDTO
    ) {
        this.infoTimelineDTO = infoTimelineDTO;
    }

    public InfoTimelineDTO getInfoTimelineDTO() {
        return infoTimelineDTO;
    }
}
