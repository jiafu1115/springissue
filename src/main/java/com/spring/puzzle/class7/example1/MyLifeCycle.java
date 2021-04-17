package com.spring.puzzle.class7.example1;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.Lifecycle;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class MyLifeCycle implements Lifecycle {

    private volatile boolean running = false;

    @Override
    public void start() {
       log.info("lifecycle start");
       running = true;
    }

    @Override
    public void stop() {
       log.info("lifecycle stop");
       running = false;
    }

    @Override
    public boolean isRunning() {
        return running;
    }

}