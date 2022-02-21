package com.example.leaguestats.RestClient.MatchDetails;

import com.example.leaguestats.Domain.MatchTimelineDTO;
import com.example.leaguestats.Domain.SingleMatchDTO;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;

@Component
public class MatchRestClient {

    RestTemplate restTemplate = new RestTemplate();

    private static final String apiKey = "RGAPI-7359946c-aad0-40fc-9510-44dfd53f83b0";

    private static final String baseUrl = "https://europe.api.riotgames.com/lol/match/v5/matches";

    public List<String> getMatchesByPuuid(String puuid) {

        String riotUrl = baseUrl + "/by-puuid";

        String url = riotUrl + "/" + puuid + "/ids?api_key=" + apiKey;

        return Arrays.asList(Objects.requireNonNull(restTemplate.getForObject(url, String[].class)));
    }

    public SingleMatchDTO retrieveSingleMatchDetails(String matchId){

        String url = baseUrl + "/" + matchId + "?api_key=" + apiKey;

        return restTemplate.getForObject(url, SingleMatchDTO.class);
    }

    public MatchTimelineDTO retrieveMatchTimeline(String matchId){

        String url = baseUrl + "/" + matchId + "/timeline?api_key=" + apiKey;

        return restTemplate.getForObject(url, MatchTimelineDTO.class);
    }

}
