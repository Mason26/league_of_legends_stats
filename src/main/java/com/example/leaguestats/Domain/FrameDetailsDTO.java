package com.example.leaguestats.Domain;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

public class FrameDetailsDTO {

    private final long totalGold;
    private final long level;
    private final long minionsKilled;
    private final long jungleMinionsKilled;

    private final long totalDamageDoneToChampions;
    private final long totalDamageTaken;


    @JsonCreator
    public FrameDetailsDTO(
            @JsonProperty("totalGold") long totalGold,
            @JsonProperty("damageStats") DamageStatsDTO damageStats,
            @JsonProperty("level") long level,
            @JsonProperty("minionsKilled") long minionsKilled,
            @JsonProperty("jungleMinionsKilled") long jungleMinionsKilled
    ) {
        this.totalGold = totalGold;
        this.level = level;
        this.minionsKilled = minionsKilled;
        this.jungleMinionsKilled = jungleMinionsKilled;

        this.totalDamageDoneToChampions = damageStats.getTotalDamageDoneToChampions();
        this.totalDamageTaken = damageStats.getTotalDamageTaken();
    }

    public long getTotalGold() {
        return totalGold;
    }

    public long getLevel() {
        return level;
    }

    public long getMinionsKilled() {
        return minionsKilled;
    }

    public long getJungleMinionsKilled() {
        return jungleMinionsKilled;
    }

    public long getTotalDamageDoneToChampions() {
        return totalDamageDoneToChampions;
    }

    public long getTotalDamageTaken() {
        return totalDamageTaken;
    }
}
