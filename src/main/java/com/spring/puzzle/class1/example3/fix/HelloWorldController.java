package com.spring.puzzle.class1.example3.fix;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Lookup;
import org.springframework.context.ApplicationContext;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class HelloWorldController {

    @Autowired
    private ApplicationContext applicationContext;

    @RequestMapping(path = "hi", method = RequestMethod.GET)
    public String hi(){
         return "helloworld, service is : " + getServiceImpl();
    };

    @Lookup
    public ServiceImpl getServiceImpl(){
        log.info("executing this method");
        return null;
    }

/*    public ServiceImpl getServiceImpl(){
        return applicationContext.getBean(ServiceImpl.class);
    }*/

}