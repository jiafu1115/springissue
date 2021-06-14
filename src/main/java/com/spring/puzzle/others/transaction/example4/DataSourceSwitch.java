package com.spring.puzzle.others.transaction.example4;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Service;

import java.lang.reflect.Method;

@Aspect
@Service
@Order(1)
public class DataSourceSwitch {

    @Around("execution(* com.spring.puzzle.others.transaction.example4.CardService.*(..))")
    public void around(ProceedingJoinPoint point) throws Throwable {
        Signature signature = point.getSignature();
        MethodSignature methodSignature = (MethodSignature) signature;
        Method method = methodSignature.getMethod();
        if (method.isAnnotationPresent(DataSource.class)) {
            DataSource dataSource = method.getAnnotation(DataSource.class);
            MyDataSource.setDataSource(dataSource.value());
            System.out.println("数据源切换至：" + MyDataSource.getDatasource());
        }
        point.proceed();
        MyDataSource.clearDataSource();
        System.out.println("数据源已移除！");
    }
}
