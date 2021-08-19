package com.yao.log;

import org.aopalliance.aop.Advice;
import org.springframework.aop.AfterReturningAdvice;
import org.springframework.aop.BeforeAdvice;
import org.springframework.aop.MethodBeforeAdvice;

import java.lang.reflect.Method;

public class BeforeLog implements MethodBeforeAdvice {

    @Override
    public void before(Method method, Object[] args, Object target) throws Throwable {
        System.out.println("在"+method.getName()+"方法执行之前运行");
    }
}
