package com.spring.puzzle.others.resttemplate.example1;

import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestTemplate;

import java.util.HashMap;
import java.util.Map;

public class TestRestTemplate {


    public static void main(String[] args) {
        RestTemplate template = new RestTemplate();
        Map<String, Object> paramMap = new HashMap<String, Object>();
        paramMap.put("para1", "001");
        paramMap.put("para2", "002");


/*        MultiValueMap<String, Object> paramMap = new LinkedMultiValueMap<String, Object>();
        paramMap.add("para1", "001");
        paramMap.add("para2", "002");*/

        String url = "http://localhost:8080/hi";

        String result = template.postForObject(url, paramMap, String.class);
        System.out.println(result);

    }

}
