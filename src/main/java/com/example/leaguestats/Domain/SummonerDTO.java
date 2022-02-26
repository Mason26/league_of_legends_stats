package com.example.leaguestats.Domain;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonProperty;

public class SummonerDTO {

    private final String puuid;
    private final String summonerName;

    @JsonCreator
    public SummonerDTO(
            @JsonProperty("puuid") String puuid,
            @JsonProperty("name") String summonerName
    ) {
        this.puuid = puuid;
        this.summonerName = summonerName;
    }

    @JsonGetter("puuid")
    public String getPuuid() {
        return puuid;
    }

    @JsonGetter("name")
    public String getSummonerName() {
        return summonerName;
    }

    @Override
    public String toString() {
        return "SummonerDTO{" +
                "puuid='" + puuid + '\'' +
                ", summonerName='" + summonerName + '\'' +
                '}';
    }
}