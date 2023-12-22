package org.review8_1;

import org.review8.Doctor;

public class Orthodontist extends Doctor {

    public Orthodontist(String firstName, String lastName, String speciality, int yearsOfExperience){
        super(firstName, lastName, speciality, yearsOfExperience);
    }

    public void printSpeciality(){
        System.out.println("I am "+speciality);
    }

    public void prescribeMedication(String medication){
        System.out.println(speciality+" prescribes special medication "+medication);
    }
}
