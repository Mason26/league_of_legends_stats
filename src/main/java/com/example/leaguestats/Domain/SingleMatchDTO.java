package com.example.leaguestats.Domain;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

public class SingleMatchDTO {

    private final InfoDTO infoDTO;

    @JsonCreator
    public SingleMatchDTO(
            @JsonProperty("info") InfoDTO infoDTO) {
        this.infoDTO = infoDTO;
    }

    public InfoDTO getInfoDTO() {
        return infoDTO;
    }

    @Override
    public String toString() {
        return "SingleMatchDTO{" +
                ", infoDTO=" + infoDTO +
                '}';
    }
}