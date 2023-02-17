package com.example.TietoEvry.Provider;

import com.example.TietoEvry.Zonky.Core.Response.LoanResponse;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;

@Component
public class ZonkyRestTemplateProvider {

     private final RestTemplate restTemplate;

     private final String rootUrl = "https://api.zonky.cz";

    public ZonkyRestTemplateProvider(RestTemplate zonkyRestTemplate) {
        this.restTemplate = zonkyRestTemplate;
    }


    public List<LoanResponse> getLoanResponse(String endpoint, int page, int size, String order) {
        HttpHeaders headers = new HttpHeaders();
        headers.set("X-Page", String.valueOf(page));
        headers.set("X-Size", String.valueOf(size));
        headers.set("X-Order", "-datePublished,-interestRate");

        HttpEntity<String> entity = new HttpEntity<>("", headers);

        ResponseEntity<LoanResponse[]> response = restTemplate.exchange(rootUrl+ endpoint, HttpMethod.GET, entity, LoanResponse[].class);
        if (!response.getStatusCode().is2xxSuccessful()) {
            //TODO: log, return empty list
            throw new RuntimeException("Error while getting data from Zonky API");
        }
        return Arrays.asList(response.getBody());

    }


}
