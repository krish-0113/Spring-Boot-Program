package com.krishna;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;


public class Nurse implements Staff {
    @Value("Vedii")
    private String name;
    @Value("33")
    private int age;
    @Value("B.Sc")
    private String qualification;

    public void assist() {
        System.out.println("Nurse is assisting");
    }

    // Getter and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getQualification() {
        return qualification;
    }

    public void setQualification(String qualification) {
        this.qualification = qualification;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Nurse{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", qualification='" + qualification + '\'' +
                '}';
    }
}
