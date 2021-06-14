package com.spring.puzzle.web.validation;

import lombok.extern.slf4j.Slf4j;
import org.hibernate.validator.constraints.Range;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@Slf4j
@Validated
public class StudentController {
    
    @RequestMapping(path = "students", method = RequestMethod.POST)
    public void addStudent(@Valid @RequestBody Student student){
        log.info("add new student: {}", student.toString());
        //省略业务代码
    };

    @RequestMapping(path = "students/{id}", method = RequestMethod.DELETE)
    public void deleteStudent(@PathVariable("id") @Range(min = 1,max = 100) String id){
        log.info("delete student: {}",id);
        //省略业务代码
    };
}
