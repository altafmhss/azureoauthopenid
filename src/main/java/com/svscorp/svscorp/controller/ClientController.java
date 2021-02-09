package com.svscorp.svscorp.controller;


import org.springframework.http.*;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.oauth2.client.OAuth2AuthorizedClient;
import org.springframework.security.oauth2.client.annotation.RegisteredOAuth2AuthorizedClient;
import org.springframework.security.oauth2.client.authentication.OAuth2AuthenticationToken;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import static com.svscorp.svscorp.util.JsonMapper.toJsonString;


@RestController
public class ClientController {

    @GetMapping("/hello")
    @ResponseBody
    public String hello() {

//        azureClient.getClientRegistration().getClientName();
        return  "public url";
    }
    @GetMapping("/name")
    @ResponseBody
    public String index(OAuth2AuthenticationToken authentication,
                        @RegisteredOAuth2AuthorizedClient OAuth2AuthorizedClient azureClient) {

//        azureClient.getClientRegistration().getClientName();
        return  authentication.getName();
    }
    RestTemplate restTemplate = new RestTemplate();
    @GetMapping("/graph")
    public String graph(
            @RegisteredOAuth2AuthorizedClient OAuth2AuthorizedClient graphClient
    ) {
        HttpHeaders headers= new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        System.out.println(graphClient.getAccessToken().getTokenValue());
        headers.set("Authorization","Bearer "+graphClient.getAccessToken().getTokenValue());
        HttpEntity<String> entity =new HttpEntity<>(headers);
        ResponseEntity<String> response =restTemplate.exchange("https://graph.microsoft.com/v1.0/me", HttpMethod.GET,entity, String.class);
       return response.getBody();

        // toJsonString() is just a demo.
        // oAuth2AuthorizedClient contains access_token. We can use this access_token to access resource server.
//        return toJsonString(graphClient);
    }

    @GetMapping("/guestgroup")
    @ResponseBody
    @PreAuthorize("hasRole('ROLE_guestgroup')")
    public String group2() {
        return "Hello guestgroup 2 Users!";
    }

    @GetMapping("/appusers")
    @ResponseBody
    @PreAuthorize("hasRole('ROLE_appusers')")
    public String group1() {
        return "Hello appusers 1 Users!";
    }
}