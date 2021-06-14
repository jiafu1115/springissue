package com.spring.puzzle.others.data.example1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;

@SpringBootApplication
public class SpringdataApplication {

/*    SpringdataApplication(RedisTemplate redisTemplate,
                          StringRedisTemplate stringRedisTemplate){
        String key = "mykey";
        stringRedisTemplate.opsForValue().set(key, "myvalue");

        Object valueGotFromStringRedisTemplate = stringRedisTemplate.opsForValue().get(key);
        System.out.println(valueGotFromStringRedisTemplate);

        Object valueGotFromRedisTemplate = redisTemplate.opsForValue().get(key);
        System.out.println(valueGotFromRedisTemplate);
    }*/

    public static void main(String[] args) {
        SpringApplication.run(SpringdataApplication.class, args);
    }

}