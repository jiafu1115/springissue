package com.spring.puzzle.others.transaction.example3;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Options;

@Mapper
public interface StudentMapper {
    @Insert("INSERT INTO `student`(`realname`) VALUES (#{realname})")
    @Options(useGeneratedKeys=true, keyProperty="id")
    void saveStudent(Student student);
}
