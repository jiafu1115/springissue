package com.spring.puzzle.others.test.example2;

import com.spring.puzzle.others.test.example1.HelloWorldService;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

@SpringBootTest()
class ServiceOneTests {

    @MockBean
    ServiceOne serviceOne;

    @Test
    public void test(){
        System.out.println(serviceOne);
    }

}
