package com.spring.puzzle.others.test.example2.solution;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest()
class ServiceOneTests extends ServiceTests{

    @Test
    public void test(){
        System.out.println(serviceOne);
    }

}
