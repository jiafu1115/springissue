package com.spring.puzzle.class3.example1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Application {


    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @Bean
    public Student student(){
        return createStudent(1, "xie");
    }

    private Student createStudent(int id, String name) {
        Student student = new Student();
        student.setId(id);
        student.setName(name);
        return student;
    }
}

