package com.spring.puzzle.others.test.example1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @Autowired
    HelloWorldService helloWorldService;

    @RequestMapping(path = "hi", method = RequestMethod.GET)
    public String hi() throws Exception{
        return  helloWorldService.toString() ;
    };

}