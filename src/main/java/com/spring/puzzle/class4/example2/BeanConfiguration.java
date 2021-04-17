package com.spring.puzzle.class4.example2;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanConfiguration {

    @Bean
    public LightService getTransmission(){
        return new LightService();
    }

   //修改方案之一：
  /*  @Bean(destroyMethod="")
    public LightService getTransmission(){
        return new LightService();
    }*/
}