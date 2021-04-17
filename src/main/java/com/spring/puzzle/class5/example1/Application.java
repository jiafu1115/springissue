package com.spring.puzzle.class5.example1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@SpringBootApplication
/*
@EnableAspectJAutoProxy(exposeProxy = true)
*/
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

}
