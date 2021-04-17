package com.spring.puzzle.class7.example3;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.ApplicationListener;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.time.Instant;
import java.util.Date;
import java.util.Random;

@Slf4j
@Component
@Order(1)
public class MyFirstEventListener implements ApplicationListener<MyEvent> {

    Random random = new Random();

    @Override
    public void onApplicationEvent(MyEvent event) {
  /*      try {*/
            log.info("{} received: {}", this.toString(), event);
            if(random.nextInt(10) % 2 == 1)
            throw new RuntimeException("exception happen on first listener");
 /*       }catch(Throwable throwable){
            //write error/metric to alert
        }*/

    }

}
