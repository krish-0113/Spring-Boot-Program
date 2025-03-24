package com.krishna;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ApplicationConfig {
    @Bean
    public Doctor doctor(){ //ceate bean obje name as a method name
        Doctor doctor = new Doctor();
        doctor.setQualification("Bsc");
        return doctor;
    }

    @Bean
    public Doctor doctor1(){ //ceate bean obje name as a method name
        Doctor doctor1 = new Doctor();
        doctor1.setQualification("MBBBSSS");
        return doctor1;
    }

    @Bean
    public Nurse nurse(){
        Nurse nurse = new Nurse();
        nurse.setNurseName("Rahii");
        return nurse;
    }

}
