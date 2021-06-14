package com.spring.puzzle.web.filter.example1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.stereotype.Service;

@Service
public class MetricsService {

    @Autowired
    public TimeCostFilter timeCostFilter;

    //下面为修改方法
/*    @Autowired
    @Qualifier("com.spring.puzzle.web.filter.example1.TimeCostFilter")
    FilterRegistrationBean timeCostFilter;*/

}
