package com.spring.puzzle.others.resttemplate.example1;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
    @RequestMapping(path = "hi", method = RequestMethod.POST)
    public String hi(@RequestParam("para1") String para1, @RequestParam("para2") String para2){
        return "helloworld:" + para1 + "," + para2;
    };
}
