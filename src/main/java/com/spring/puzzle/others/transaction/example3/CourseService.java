package com.spring.puzzle.others.transaction.example3;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class CourseService {
    @Autowired
    private CourseMapper courseMapper;

    @Autowired
    private StudentCourseMapper studentCourseMapper;

    @Transactional(rollbackFor = Exception.class)
    public void regCourse(int studentId) throws Exception {
        studentCourseMapper.saveStudentCourse(studentId, 1);
        courseMapper.addCourseNumber(1);
        throw new Exception("注册失败");
    }
}
