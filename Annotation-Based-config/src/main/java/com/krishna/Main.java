package com.krishna;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        // Correctly initialize the Spring context using AnnotationConfigApplicationContext
        ApplicationContext context = new AnnotationConfigApplicationContext(Applicationconfig.class);

        // Fetching Doctor and Nurse beans
        Doctor doctor = (Doctor) context.getBean(Doctor.class);
        System.out.println(doctor.toString()); // Output Doctor details

        Nurse nurse = (Nurse) context.getBean(Nurse.class);
        System.out.println(nurse.toString()); // Output Nurse details
        Doctor doctorSachin = context.getBean(Doctor.class);  // Second Doctor bean
        System.out.println(doctorSachin);

        // Calling assist method for both Doctor and Nurse
        doctor.assist();
        nurse.assist();
        doctorSachin.assist();
    }
}
