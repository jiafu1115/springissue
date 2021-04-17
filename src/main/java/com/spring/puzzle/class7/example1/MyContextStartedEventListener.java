package com.spring.puzzle.class7.example1;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextStartedEvent;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class MyContextStartedEventListener implements ApplicationListener<ContextStartedEvent> {

  public void onApplicationEvent(final ContextStartedEvent event) {
    log.info("{} received: {}", this.toString(), event);
  }

}