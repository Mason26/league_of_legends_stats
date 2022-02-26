package com.example.leaguestats.RestClient.AccountDetails;
import com.example.leaguestats.Domain.SummonerDTO;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;
@Component
public class AccountRestClient {

    public SummonerDTO getPuuid(String name) {

        RestTemplate restTemplate = new RestTemplate();

        String apiKey = "insert api key from Riot";

        String riotUrl = "https://euw1.api.riotgames.com/lol/summoner/v4/summoners/by-name";

        String url = riotUrl + "/" + name + "?api_key=" + apiKey;

        return restTemplate.getForObject(url, SummonerDTO.class);
    }

}
