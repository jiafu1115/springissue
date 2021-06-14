package com.spring.puzzle.others.transaction.example4;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Options;

@Mapper
public interface CardMapper {
    @Insert("INSERT INTO `card`(`student_id`, `balance`) VALUES (#{studentId}, #{balance})")
    @Options(useGeneratedKeys = true, keyProperty = "id")
    @DataSource(DataSource.card)
    int saveCard(Card card);
}
