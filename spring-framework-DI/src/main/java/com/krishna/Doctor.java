package com.krishna;

public class Doctor  implements Staff {
    private String qualification;

    //Constructor Based Config
    public Doctor(String qualification) {
        this.qualification = qualification;
    }



    //Setter adn getter config
    public String getQualification() {
        return qualification;
    }
//
//    public void setQualification(String qualification) {
//        this.qualification = qualification;
//    }






    public void assist(){
        System.out.println(" Doctor is assisting");
    }

}
