package com.spring.puzzle.class7;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {

    public static void main(String[] args) {
/*
        MyApplicationEnvironmentPreparedEventListener myApplicationEnvironmentPreparedEventListener = new MyApplicationEnvironmentPreparedEventListener();
        SpringApplication springApplication = new SpringApplicationBuilder(Application.class).listeners(myApplicationEnvironmentPreparedEventListener).build();
        springApplication.run(args);

*/
        SpringApplication.run(Application.class, args);
    }
}
