package com.spring.puzzle.class7.example1;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class MyContextRefreshedEventListener implements ApplicationListener<ContextRefreshedEvent> {

  public void onApplicationEvent(final ContextRefreshedEvent event) {
    log.info("{} received: {}", this.toString(), event);
  }

}