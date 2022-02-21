package com.example.leaguestats.RestClient.AccountDetails;
import com.example.leaguestats.Domain.AccountDetailsDTO;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;
@Component
public class AccountRestClient {

    public AccountDetailsDTO getPuuid(String name, String tagLine) {

        RestTemplate restTemplate = new RestTemplate();

        String apiKey = "RGAPI-7359946c-aad0-40fc-9510-44dfd53f83b0";

        String riotUrl = "https://europe.api.riotgames.com/riot/account/v1/accounts/by-riot-id";

        String url = riotUrl + "/" + name + "/" + tagLine + "?api_key=" + apiKey;

        return restTemplate.getForObject(url, AccountDetailsDTO.class);
    }

}
