package com.spring.puzzle.others.transaction.example4;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Update;

@Mapper
public interface CourseMapper {
    @Update("update `course` set number = number + 1 where id = #{id}")
    void addCourseNumber(int courseId);
}
