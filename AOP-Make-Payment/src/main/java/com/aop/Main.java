package com.aop;

import com.aop.services.PaymentService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
      ApplicationContext context = new AnnotationConfigApplicationContext(ApplicationConfig.class);
      PaymentService paymentService = (PaymentService) context.getBean("paymentService");
      paymentService.makePayment(12344);

    }
}
