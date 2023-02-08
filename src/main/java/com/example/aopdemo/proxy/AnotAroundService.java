package com.example.aopdemo.proxy;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class AnotAroundService {

    @Pointcut("execution(* com.example.aopdemo.service.*ServiceImpl.*(..))")
    public void doCut(){}

    @Around("doCut()")
    public Object aroundMethod(ProceedingJoinPoint joinPoint){
        Object result = null;
        try {
            System.out.println("执行之前");
            result = joinPoint.proceed();
            System.out.println("执行之后");
        } catch (Throwable throwable) {
            System.out.println("出现异常");
        }
        return result;
    }
}
