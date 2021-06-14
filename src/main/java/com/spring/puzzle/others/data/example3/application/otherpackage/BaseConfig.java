package com.spring.puzzle.others.data.example3.application.otherpackage;

import com.spring.puzzle.others.data.example3.application.application.MyService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BaseConfig {

    @Bean
    public MyService service(){
        return new MyService("myservice defined from base config");
    }
}
