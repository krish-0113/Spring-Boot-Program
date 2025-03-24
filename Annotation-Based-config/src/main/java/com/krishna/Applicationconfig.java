package com.krishna;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
@ComponentScan("com.krishna")
public class Applicationconfig {
    @Bean
    @Primary
    public Doctor doctorSachin() {
        Doctor doctorSachin = new Doctor();
        doctorSachin.setName("Sachin");
        doctorSachin.setAge(23);  // Same age as Krishna
        doctorSachin.setQualification("MBBS");
        return doctorSachin;
    }



}
