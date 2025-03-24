package com.aop;

import com.aop.services.PaymentService;
import com.aop.services.PaymentServiceImp;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@EnableAspectJAutoProxy  // Enabling AOP functionality
@ComponentScan(basePackages = "com.aop")  // Make sure your aspect class is in the component scan
public class ApplicationConfig {
    @Bean
    public PaymentService paymentService() {
        return new PaymentServiceImp();
    }

}
