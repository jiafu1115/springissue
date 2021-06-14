package com.spring.puzzle.others.test.example2.solution;

import com.spring.puzzle.others.test.example2.ServiceOne;
import com.spring.puzzle.others.test.example2.ServiceTwo;

import org.springframework.boot.test.mock.mockito.MockBean;

public class ServiceTests {

    @MockBean
    ServiceOne serviceOne;

    @MockBean
    ServiceTwo serviceTwo;


}
