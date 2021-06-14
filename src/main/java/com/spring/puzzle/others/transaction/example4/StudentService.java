package com.spring.puzzle.others.transaction.example4;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class StudentService {
    @Autowired
    private StudentMapper studentMapper;

    @Autowired
    private StudentService studentService;

    @Autowired
    private CourseService courseService;

    @Autowired
    private CardService cardService;

    @Transactional(rollbackFor = Exception.class)
    public void saveStudent(String realname) throws Exception {
        Student student = new Student();
        student.setRealname(realname);
        studentService.doSaveStudent(student);
        try {
            courseService.regCourse(student.getId());
            cardService.createCard(student.getId());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void doSaveStudent(Student student) throws Exception {
        studentMapper.saveStudent(student);
    }
}