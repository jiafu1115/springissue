package com.spring.puzzle.others.test.example1;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

@Configuration

@ImportResource(locations = {"spring.xml"})
//@ImportResource(locations = {"classpath:spring.xml"})
public class Config {
}