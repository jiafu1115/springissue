package com.spring.puzzle.class1.example2;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServiceImpl {

    private String serviceName;

    public ServiceImpl(String serviceName){
        this.serviceName = serviceName;
    }

/*    public ServiceImpl(String serviceName, String otherStringParameter){
        this.serviceName = serviceName;
    }*/

/*    private List<String> serviceNames;
    public ServiceImpl(List<String> serviceNames){
        this.serviceNames = serviceNames;
        System.out.println(this.serviceNames);
    }*/
}