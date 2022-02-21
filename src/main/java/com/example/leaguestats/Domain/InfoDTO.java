package com.example.leaguestats.Domain;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class InfoDTO {

    private final List<GameParticipantsDTO> participants;

    @JsonCreator
    public InfoDTO(
            @JsonProperty("participants") List<GameParticipantsDTO> participants
    ) {
        this.participants = participants;
    }

    @JsonGetter("participants")
    public List<GameParticipantsDTO> getParticipants() {
        return participants;
    }

}


