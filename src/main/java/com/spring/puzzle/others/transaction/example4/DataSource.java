package com.spring.puzzle.others.transaction.example4;


import java.lang.annotation.*;

@Documented
@Target({ElementType.TYPE, ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
public @interface DataSource {

    String value();

    String core = "core";

    String card = "card";
}