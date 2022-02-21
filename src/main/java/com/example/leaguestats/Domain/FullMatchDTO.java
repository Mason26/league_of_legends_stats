package com.example.leaguestats.Domain;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

public class FullMatchDTO {

    private final SingleMatchDTO singleMatchDTO;
    private final MatchTimelineDTO matchTimelineDTO;

    @JsonCreator
    public FullMatchDTO(
            @JsonProperty("singleMatchDTO") SingleMatchDTO singleMatchDTO,
            @JsonProperty("matchTimelineDTO") MatchTimelineDTO matchTimelineDTO
    ) {
        this.singleMatchDTO = singleMatchDTO;
        this.matchTimelineDTO = matchTimelineDTO;
    }

    public SingleMatchDTO getSingleMatchDTO() {
        return singleMatchDTO;
    }

    public MatchTimelineDTO getMatchTimelineDTO() {
        return matchTimelineDTO;
    }

    @Override
    public String toString() {
        return singleMatchDTO.getInfoDTO().toString() + " " +
                matchTimelineDTO.getInfoTimelineDTO().getFramesDTO().get(0).getParticipantFrames();
    }
}
