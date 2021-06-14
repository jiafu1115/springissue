package com.spring.puzzle.web.header;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpHeaders;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;
import java.util.Map;

@RestController
@Slf4j
public class HelloWorldController {

    /**
     wrong to use map to received the headers, cant got the multivalue for one header:
     GET http://localhost:8080/hi1
     myheader: h1
     myheader: h2
    */
    @RequestMapping(path = "/hi1", method = RequestMethod.GET)
    public String hi1(@RequestHeader() HttpHeaders map){
        return map.toString();
    };


    /**
     header's key case sensitive issue, MultiValueMap should be case sensitive.
     GET http://localhost:8080/hi2
     myheader: myheadervalue
     */
    @RequestMapping(path = "/hi2", method = RequestMethod.GET)
    public String hi2(@RequestHeader("MyHeader") String myHeader, @RequestHeader MultiValueMap  map){
        return myHeader + " compare with : " + map.get("MyHeader");
    };

    /**
     write to content type into response, can't work:
     GET http://localhost:8080/hi3
     */
/*
    @RequestMapping(path = "/hi3", method = RequestMethod.GET, produces = {"application/json"})
*/

    @RequestMapping(path = "/hi3", method = RequestMethod.GET)
    public String hi3(HttpServletResponse httpServletResponse){
        httpServletResponse.addHeader("myheader", "myheadervalue");
        httpServletResponse.addHeader(HttpHeaders.CONTENT_TYPE, "application/json");
        return "ok";
    };


}
