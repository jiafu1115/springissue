package com.spring.puzzle.others.resttemplate.example3;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import java.net.URI;

public class TestRestTemplate {


    public static void main(String[] args) {
        RestTemplate restTemplate = new RestTemplate();

        UriComponentsBuilder builder = UriComponentsBuilder.fromHttpUrl("http://localhost:8080/hi");
        builder.queryParam("para1", "开发测试001");
        String url = builder.toUriString();

        ResponseEntity<String> forEntity = restTemplate.getForEntity(url, String.class);
        System.out.println(forEntity.getBody());

    }

    public static void main2(String[] args) {
        RestTemplate restTemplate = new RestTemplate();
        UriComponentsBuilder builder = UriComponentsBuilder.fromHttpUrl("http://localhost:8080/hi");
        builder.queryParam("para1", "开发测试001");
        URI url = builder.encode().build().toUri();
        ResponseEntity<String> forEntity = restTemplate.getForEntity(url, String.class);
        System.out.println(forEntity.getBody());
    }

}
