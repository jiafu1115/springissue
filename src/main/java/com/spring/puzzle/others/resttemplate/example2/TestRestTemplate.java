package com.spring.puzzle.others.resttemplate.example2;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import java.net.URI;
import java.util.HashMap;
import java.util.Map;

public class TestRestTemplate {


    public static void main(String[] args) {
        String url = "http://localhost:8080/hi?para1=1#2";
        HttpEntity<?> entity = new HttpEntity<>(null);

        RestTemplate restTemplate = new RestTemplate();
        HttpEntity<String> response = restTemplate.exchange(url, HttpMethod.GET,entity,String.class);

        System.out.println(response.getBody());

    }

    public static void main2(String[] args) {
        String url = "http://localhost:8080/hi?para1=1#2";
        UriComponentsBuilder builder = UriComponentsBuilder.fromHttpUrl(url);
        URI uri = builder.build().encode().toUri();
        HttpEntity<?> entity = new HttpEntity<>(null);

        RestTemplate restTemplate = new RestTemplate();
        HttpEntity<String> response = restTemplate.exchange(uri, HttpMethod.GET,entity,String.class);

        System.out.println(response.getBody());
    }

}
