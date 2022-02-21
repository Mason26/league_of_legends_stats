package com.example.leaguestats.Domain;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class InfoTimelineDTO {

    private final List<FramesDTO> framesDTO;

    @JsonCreator
    public InfoTimelineDTO(
            @JsonProperty("frames") List<FramesDTO> framesDTO
    ) {
        this.framesDTO = framesDTO;
    }

    @JsonGetter("frames")
    public List<FramesDTO> getFramesDTO() {
        return framesDTO;
    }
}
