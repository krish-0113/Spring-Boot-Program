package com.krishna;

public class Nurse implements Staff {
    private String nurseName;
    public String getNurseName() {
        return nurseName;
    }

    public void setNurseName(String nurseName) {
        this.nurseName = nurseName;
    }


    public void assist() {
        System.out.println("Nurse is assisting");
    }
}
