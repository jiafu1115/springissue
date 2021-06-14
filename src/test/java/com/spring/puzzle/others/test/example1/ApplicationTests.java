package com.spring.puzzle.others.test.example1;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.util.Assert;

@SpringBootTest()
class ApplicationTests {

    @Autowired
    public HelloController helloController;

    @Test
    public void testController() throws Exception {
        String response = helloController.hi();
        Assert.notNull(response, "not null");
    }

}
