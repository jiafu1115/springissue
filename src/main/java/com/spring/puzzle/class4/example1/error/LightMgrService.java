package com.spring.puzzle.class4.example1.error;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class LightMgrService {

    @Autowired
    private LightService lightService;

    public LightMgrService() {
        lightService.check();
    }
}