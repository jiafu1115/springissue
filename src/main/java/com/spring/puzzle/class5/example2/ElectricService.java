package com.spring.puzzle.class5.example2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ElectricService {

    @Autowired
    private AdminUserService adminUserService;

    public void charge() throws Exception {
        System.out.println("Electric charging ...");
        this.pay();
    }


    public void pay() throws Exception {
        adminUserService.login();
        String payNum = adminUserService.adminUser.getPayNum();
/*
        String payNum = adminUserService.getAdminUser().getPayNum();
*/
        System.out.println("User pay num : " + payNum);
        System.out.println("Pay with alipay ...");
        Thread.sleep(1000);
    }

}