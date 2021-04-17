package com.spring.puzzle.class2.example1;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;

@Repository
@Slf4j
/*
@Primary
*/
public class OracleDataService implements DataService {
    @Override
    public void deleteStudent(int id) {
        log.info("delete student info maintained by oracle");
    }
}
