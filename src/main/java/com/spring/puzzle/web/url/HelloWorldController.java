package com.spring.puzzle.web.url;

import lombok.extern.slf4j.Slf4j;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.lang.Nullable;
import org.springframework.util.AntPathMatcher;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.HandlerMapping;

import javax.servlet.http.HttpServletRequest;
import java.util.Arrays;
import java.util.Date;
import java.util.Optional;

@RestController
@Slf4j
public class HelloWorldController {
    private AntPathMatcher antPathMatcher;

    @RequestMapping(path = "/hi1/{name}", method = RequestMethod.GET)
    public String hi1(@PathVariable("name") String name){
        return name;
    };

/*    @RequestMapping(path = "/hi1/**", method = RequestMethod.GET)
    public String hi1(HttpServletRequest request){
        String path = (String) request.getAttribute(HandlerMapping.PATH_WITHIN_HANDLER_MAPPING_ATTRIBUTE);
        String matchPattern = (String) request.getAttribute(HandlerMapping.BEST_MATCHING_PATTERN_ATTRIBUTE); // /rest/**
        antPathMatcher = new AntPathMatcher();
        return antPathMatcher.extractPathWithinPattern(matchPattern, path); // 1/53879d5c-b07b-44f2-9a77-b99f67bb8481
    };*/


    @RequestMapping(path = "/hi2", method = RequestMethod.GET)
    public String hi2(@RequestParam("name") String[] name){
        return Arrays.toString(name);
    };

    @RequestMapping(path = "/hi3", method = RequestMethod.GET)
    public String hi3(@RequestParam String name){
        return name;
    };

    @RequestMapping(path = "/hi4", method = RequestMethod.GET)
    public String hi4(@RequestParam("name") String name, @RequestParam(value = "address") @Nullable String address){
        return name + " @ " + address;
    };

    @RequestMapping(path = "/hi41", method = RequestMethod.GET)
    public String hi41(@RequestParam("name") String name, @RequestParam(value = "address") Optional<String> address){
        return name + " @ " + address;
    };

    @RequestMapping(path = "/hi5", method = RequestMethod.GET)
    public String hi5(@RequestParam("name") String name, @RequestParam("age") int age){
        return name + " is " + age + " years old";
    };

    @RequestMapping(path = "/hi6", method = RequestMethod.GET)
    public String hi6(@RequestParam("date") @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss") Date date){
        return "date is " + date ;
    };


}
