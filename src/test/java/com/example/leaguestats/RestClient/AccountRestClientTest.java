package com.example.leaguestats.RestClient;

import com.example.leaguestats.Domain.AccountDetailsDTO;
import com.example.leaguestats.RestClient.AccountDetails.AccountRestClient;
import org.junit.Ignore;
import org.junit.jupiter.api.Test;

class AccountRestClientTest {

    AccountRestClient accountRestClient = new AccountRestClient();

    @org.junit.Test
    @Test
    @Ignore
    public void testRetrieveAccountDetails() {

        String name = "Left Ball";
        String tagLine = "EUW";

        AccountDetailsDTO actual = accountRestClient.getPuuid(name, tagLine);

        System.out.println(actual.toString());
    }
}