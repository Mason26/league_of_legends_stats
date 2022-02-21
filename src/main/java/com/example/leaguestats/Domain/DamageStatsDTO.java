package com.example.leaguestats.Domain;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

public class DamageStatsDTO {

    private final long totalDamageDoneToChampions;
    private final long totalDamageTaken;

    @JsonCreator
    public DamageStatsDTO(
            @JsonProperty("totalDamageDoneToChampions") long totalDamageDoneToChampions,
            @JsonProperty("totalDamageTaken") long totalDamageTaken
    ) {
        this.totalDamageDoneToChampions = totalDamageDoneToChampions;
        this.totalDamageTaken = totalDamageTaken;
    }

    public long getTotalDamageDoneToChampions() {
        return totalDamageDoneToChampions;
    }

    public long getTotalDamageTaken() {
        return totalDamageTaken;
    }

}
