package com.spring.puzzle.others.transaction.example4;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface StudentCourseMapper {
    @Insert("INSERT INTO `student_course`(`student_id`, `course_id`) VALUES (#{studentId}, #{courseId})")
    void saveStudentCourse(@Param("studentId") Integer studentId, @Param("courseId") Integer courseId);
}
