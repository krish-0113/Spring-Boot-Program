package com.krishna;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        // Correctly initialize the context with ApplicationConfig.class
        ApplicationContext context = new AnnotationConfigApplicationContext(ApplicationConfig.class);

        // Fetching the 'doctor' bean by its method name which acts as the bean name
        Doctor doctor = (Doctor) context.getBean("doctor");
        System.out.println(doctor.getQualification());

        Doctor doctor1 = (Doctor) context.getBean("doctor1");
        System.out.println(doctor1.getQualification());

        Nurse nurse = (Nurse) context.getBean("nurse");
        System.out.println(nurse.getNurseName());

        Staff staffDoc = (Staff) context.getBean("doctor");
        staffDoc.assist();

        Staff staffNurse = (Staff) context.getBean("doctor");
        staffNurse.assist();


    }
}
