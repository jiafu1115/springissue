package com.spring.puzzle.others.test.example2.solution;

import com.spring.puzzle.others.test.example2.ServiceTwo;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

@SpringBootTest()
class ServiceTwoTests  extends ServiceTests{

    @Test
    public void test(){
        System.out.println(serviceTwo);
    }

}
