package org.class4;

import java.util.Scanner;

public class E6Scanner {
    public static void main(String[] args) {

        Scanner fetchWeight=new Scanner(System.in);
        System.out.println("Please enter your weight in lbs");
        double weight=fetchWeight.nextDouble();
        System.out.println("You have "+weight+" weight");
    }
}
