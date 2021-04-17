package com.spring.puzzle.class7.example3;

import org.springframework.context.ApplicationEvent;


public class MyEvent extends ApplicationEvent {
    public MyEvent(Object source) {
        super(source);
    }
}
