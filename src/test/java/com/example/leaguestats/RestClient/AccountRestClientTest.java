package com.example.leaguestats.RestClient;

import com.example.leaguestats.Domain.SummonerDTO;
import com.example.leaguestats.RestClient.AccountDetails.AccountRestClient;
import org.junit.Ignore;
import org.junit.jupiter.api.Test;

class AccountRestClientTest {

    AccountRestClient accountRestClient = new AccountRestClient();

    @org.junit.Test
    @Test
    @Ignore
    public void testRetrieveAccountDetails() {

        String name = "insert summoner name";

        SummonerDTO actual = accountRestClient.getPuuid(name);

        System.out.println(actual.toString());
    }
}