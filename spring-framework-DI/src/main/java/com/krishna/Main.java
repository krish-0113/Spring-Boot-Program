package com.krishna;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        Doctor doctor = context.getBean(Doctor.class);
        doctor.assist();

        System.out.println(doctor.getQualification());
//        Staff staff = (Staff) context.getBean("doctor");
//        staff.assist();

//        Nurse nurse = (Nurse) context.getBean("nurse");
//        nurse.assist();
    }
}
