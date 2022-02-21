package com.example.leaguestats.Domain;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonProperty;

public class AccountDetailsDTO {

    private final String puuid;
    private final String gameName;
    private final String tagLine;

    @JsonCreator
    public AccountDetailsDTO(
            @JsonProperty("puuid") String puuid,
            @JsonProperty("gameName") String gameName,
            @JsonProperty("tagLine") String tagLine
    ) {
        this.puuid = puuid;
        this.gameName = gameName;
        this.tagLine = tagLine;
    }

    @JsonGetter("puuid")
    public String getPuuid() {
        return puuid;
    }

    @JsonGetter("game-name")
    public String getGameName() {
        return gameName;
    }

    @JsonGetter("tag-line")
    public String getTagLine() {
        return tagLine;
    }

    @Override
    public String toString() {
        return "AccountDetailsDTO{" +
                "puuid='" + puuid + '\'' +
                ", gameName='" + gameName + '\'' +
                ", tagLine='" + tagLine + '\'' +
                '}';
    }
}