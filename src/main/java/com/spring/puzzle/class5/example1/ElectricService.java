package com.spring.puzzle.class5.example1;

import org.springframework.stereotype.Service;

@Service
public class ElectricService {

/*    @Autowired
    ElectricService electricService;*/

    public void charge() throws Exception {
        System.out.println("Electric charging ...");
        this.pay();

/*
         electricService.pay();
*/

/*        ElectricService electric = ((ElectricService) AopContext.currentProxy());
        electric.pay();*/

    }

    public void pay() throws Exception {
        System.out.println("Pay with alipay ...");
        Thread.sleep(1000);
    }

}