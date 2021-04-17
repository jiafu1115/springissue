package com.spring.puzzle.class4.example2;

import org.springframework.stereotype.Service;

//@Service
public class LightService {

    public void start() {
        System.out.println("turn on all lights");
    }

    public void shutdown() {
        System.out.println("turn off all lights");
    }

    public void check() {
        System.out.println("check all lights");
    }
}