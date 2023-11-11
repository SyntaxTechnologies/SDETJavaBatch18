package org.class4;

public class T1 {
    public static void main(String[] args) {


        double age = 25;
        double weight = 180;

        if (age >= 18) {

            if (weight >= 110) {
                System.out.println("You are eligible for blood donation");
            } else {
                System.out.println("You are not eligible for a blood donation");
            }
        }else {
            System.out.println("We cannot accept such patient");
        }



    }
}
