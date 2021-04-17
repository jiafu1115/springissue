package com.spring.puzzle.class4.example1.fix;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class LightMgrService {

    private LightService lightService;

    public LightMgrService(LightService lightService) {
        this.lightService = lightService;
        lightService.check();
    }

    //修正方法2
/*    @Autowired
    private LightService lightService;

    @PostConstruct
    public void init() {
        lightService.check();
    }*/

    //修正方法3
/*    @Autowired
    private LightService lightService;

    @Override
    public void afterPropertiesSet() throws Exception {
        lightService.check();
    }*/
}