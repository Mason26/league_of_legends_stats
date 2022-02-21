package com.example.leaguestats.Domain;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

public class MatchDTO {

    private final Object object;

    @JsonCreator
    public MatchDTO(
            @JsonProperty("match") Object object
    ) {
        this.object = object;
    }

    public Object getObject() {
        return object;
    }

    @Override
    public String toString() {
        return "MatchDTO{" +
                "object=" + object +
                '}';
    }
}
