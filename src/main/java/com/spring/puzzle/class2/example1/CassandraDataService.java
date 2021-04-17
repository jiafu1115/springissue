package com.spring.puzzle.class2.example1;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Repository;

@Repository
@Slf4j
public class CassandraDataService implements DataService {
    @Override
    public void deleteStudent(int id) {
        log.info("delete student info maintained by cassandra");
    }
}
