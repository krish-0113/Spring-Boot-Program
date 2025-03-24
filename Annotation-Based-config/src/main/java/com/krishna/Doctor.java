package com.krishna;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Doctor implements Staff {
    @Value("Krishna")
    private String name;
    @Value("23")
    private int age;
    @Value("B.Tech")
    private String qualification;

    public void assist() {
        System.out.println("Doctor is assisting");
    }

    // Getter and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getQualification() {
        return qualification;
    }

    public void setQualification(String qualification) {
        this.qualification = qualification;
    }

    @Override
    public String toString() {
        return "Doctor{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", qualification='" + qualification + '\'' +
                '}';
    }
}
