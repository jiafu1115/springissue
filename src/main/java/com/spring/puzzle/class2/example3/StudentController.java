package com.spring.puzzle.class2.example3;

import lombok.extern.slf4j.Slf4j;
import org.hibernate.validator.constraints.Range;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
@Validated
public class StudentController {

    @Repository
    public static class InnerClassDataService implements DataService{
        @Override
        public void deleteStudent(int id) {
            //空实现
        }
    }

    @Autowired
    @Qualifier("innerClassDataService")
            //下面为修正方法
/*
    @Qualifier("studentController.InnerClassDataService")
*/

    DataService innerClassDataService;

    @RequestMapping(path = "students/{id}", method = RequestMethod.DELETE)
    public void deleteStudent(@PathVariable("id") @Range(min = 1,max = 100) int id){
        innerClassDataService.deleteStudent(id);
    };

}
