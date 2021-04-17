package com.spring.puzzle.class3.example2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.core.annotation.Order;

import java.util.Arrays;
import java.util.List;

@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @Bean
/*
    @Order(2)
*/
    public Student student1(){
        return createStudent(1, "xie");
    }

    @Bean
/*    @Order(1)*/
    public Student student2(){
        return createStudent(2, "fang");
    }

/*    @Bean
    public Student student3(){
        return createStudent(3, "liu");
    }

    @Bean
    public Student student4(){
        return createStudent(4, "fu");
    }*/

    private Student createStudent(int id, String name) {
        Student student = new Student();
        student.setId(id);
        student.setName(name);
        return student;
    }

    @Bean
    public List<Student> students(){
        Student student3 = createStudent(3, "liu");
        Student student4 = createStudent(4, "fu");
        return Arrays.asList(student3, student4);
    }

}
