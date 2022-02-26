package com.example.leaguestats.RestClient.MatchDetails;

import com.example.leaguestats.Domain.FramesDTO;
import com.example.leaguestats.Domain.MatchTimelineDTO;
import com.example.leaguestats.Domain.SingleMatchDTO;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.client.RestTemplate;

import java.util.List;

class MatchRestClientTest {

    @Autowired
    RestTemplate restTemplate = new RestTemplate();

    MatchRestClient matchRestClient = new MatchRestClient();

//    @Test
    public void retrieveLast10Matches() {

        List<String> matches = matchRestClient.getMatchesByPuuid("insert puuid");

        for(String match : matches) {
            System.out.println(match);
        }
    }

//    @Test
    public void retrieveSingleMatchDetails() {

        SingleMatchDTO singleMatchDTO = matchRestClient.retrieveSingleMatchDetails("insert match id");

        System.out.println(singleMatchDTO.toString());

    }

    @Test
    public void retrieveSingleMatchTimeline(){
        MatchTimelineDTO matchTimelineDTO = matchRestClient.retrieveMatchTimeline("EUW1_5734787416");

        for(FramesDTO framesDTO : matchTimelineDTO.getInfoTimelineDTO().getFramesDTO()) {
            System.out.println(framesDTO.getTimestamp());
        }
    }

}