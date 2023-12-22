package org.review8;

import org.review8_1.Orthodontist;

public class EmergencyRoom {

    public static void main(String[] args) {

        Doctor[] doc={
                new Surgeon("John", "Doe", "Surgeon", 20, "Fairfax, VA"),
                new Surgeon("Michael", "Jordan", "Surgeon", 20, "Vienna, VA"),
                new Orthodontist("Josh", "Smith", "Orthodontist", 15)
        };

        System.out.println("-----------------   Enhanced for Loop ------------------------------");

        for(Doctor doctor:doc){
            doctor.checkVitals();
            doctor.checkVitals("Jack");
            doctor.prescribeMedication("Pain Killer");
        }

        //  doc[0].checkVitals();
        // doc[0].checkVitals("Jane");
        // doc[0].prescribeMedication("Pills");

        for(int i=0; i<doc.length;i++ ){
            doc[i].checkVitals();
            doc[i].checkVitals("Jane");
            doc[i].prescribeMedication("Pills");
            System.out.println("     ----------------------------      ");
        }
    }
}
