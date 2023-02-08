package com.example.aopdemo.proxy;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

public class AroundAdvice implements MethodInterceptor {

    @Override
    public Object invoke(MethodInvocation invocation) {
        try {
            System.out.println("before");
            Object result = invocation.proceed();
            System.out.println("after");
            return result;
        } catch (Throwable e) {
            System.out.println("exception");
        }
        return null;
    }

}
