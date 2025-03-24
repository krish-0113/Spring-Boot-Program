package com.aop.aspect;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class MyAspect {

    @Before("execution (* com.aop.services.PaymentServiceImp.makePayment(..))")
    public  void beforePrint() {
        System.out.println("Payment Started");
    }

    @After("execution (* com.aop.services.PaymentServiceImp.makePayment(..))")
    public  void afterPrint() {
        System.out.println("Payment Ended");
    }
}
