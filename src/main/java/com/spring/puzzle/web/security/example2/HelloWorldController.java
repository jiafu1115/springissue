package com.spring.puzzle.web.security.example2;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.security.PermitAll;

@RestController
public class HelloWorldController {

    @RequestMapping(path = "admin", method = RequestMethod.GET)
    public String admin(){
         return "admin operation";
    };


}
