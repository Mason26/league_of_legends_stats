package com.example.leaguestats.Domain;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Arrays;

public class MetadataDTO {

    private final String dataVersion;
    private final String matchId;
    private final String[] participants;

    @JsonCreator
    public MetadataDTO(
            @JsonProperty("dataVersion") String dataVersion,
            @JsonProperty("matchId") String matchId,
            @JsonProperty("participants") String[] participants) {
        this.dataVersion = dataVersion;
        this.matchId = matchId;
        this.participants = participants;
    }

    public String getDataVersion() {
        return dataVersion;
    }

    public String getMatchId() {
        return matchId;
    }

    public String[] getParticipants() {
        return participants;
    }

    @Override
    public String toString() {
        return "MetadataDTO{" +
                "dataVersion='" + dataVersion + '\'' +
                ", matchId='" + matchId + '\'' +
                ", participants=" + Arrays.toString(participants) +
                '}';
    }
}
