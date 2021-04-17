package com.spring.puzzle.class6.example1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    @Autowired
    ElectricService electricService;

    @RequestMapping(path = "charge", method = RequestMethod.GET)
    public void charge() throws Exception{
        electricService.charge();
    };

}