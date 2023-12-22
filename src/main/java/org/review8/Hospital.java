package org.review8;

import org.review8_1.Orthodontist;

public class Hospital {

    public static void main(String[] args) {

        Doctor.hospital="Inova";
        Surgeon surgeon=new Surgeon("John", "Doe", "Surgeon", 20, "Fairfax, VA");
        surgeon.checkVitals(); //parent class
        surgeon.checkVitals("Jane Smith"); //parent class
        surgeon.prescribeMedication("Smith"); //child clas
        Doctor.work(); //accessing static method in static way from the class where it was defined
        Surgeon.work(); //accessing static method from parent class in static way using child className

        System.out.println( " ----------------------------------------------  ");
        Orthodontist ortho=new Orthodontist("Josh", "Smith", "Orthodontist", 15);
        Orthodontist.work(); //parent
        ortho.checkVitals(); //parent
        ortho.prescribeMedication("Pain Killers"); //child
        ortho.printSpeciality(); //child

        /*
            Polymorphism in JAVA:
                1. Compile Time/Static Binding/ Early Binding
                    achieved through method overloading
                2. RunTime /Dynamic Binding/ Late Binding
                    achieved through method overriding
         */

        System.out.println("  ------------------------------------------   ");
        Doctor ortho1=new Orthodontist("Josh", "Smith", "Orthodontist", 15);
        ortho1.checkVitals();
        ortho1.checkVitals("Michael");
        // we are achieving a runtime poly through method overriding
        //during run time Java gives preference to the Object type (in this case it Object of chilc class)
        ortho1.prescribeMedication("Pills"); //java executed child class method

        Doctor sur=new Surgeon("John", "Doe", "Surgeon", 20, "Fairfax, VA");
        sur.checkVitals();
        sur.checkVitals("Mohammed");
        sur.prescribeMedication("pills");



    }
}
