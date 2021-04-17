package com.spring.puzzle.class3.example1;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.net.URL;

@RestController
@Slf4j
public class ValueTestController {

    @Value("${username}")
    private String username;

    @Value("${password}")
    private String password;

    @Value("#{student}")
    private Student student;

    @RequestMapping(path = "user", method = RequestMethod.GET)
    public String getUser(){
       return username + ","  + ", " + password;
    };

}
