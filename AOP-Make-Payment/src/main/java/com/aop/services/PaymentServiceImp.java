package com.aop.services;

public class PaymentServiceImp implements PaymentService {
    public void makePayment(int amt) {
        System.out.println( amt + "Payment is detected");
        System.out.println( amt + "Payment is credited");
    }
}
