package com.yao.aspect;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class LogAspect {
    @Before("execution(* com.yao.service.UserServiceImpl.*(..))")
    public void before(){
        System.out.println("before");
    }

    @After("execution(* com.yao.service.UserServiceImpl.*(..))")
    public void after(){
        System.out.println("after");
    }
}
