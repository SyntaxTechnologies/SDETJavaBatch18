package org.class4;

import java.util.Scanner;

/*
Create a Java program that will ask
user to input city and temperature. Your program should
convert Fahrenheit into celsius and print “The temperature
is the city __ is __”
 */
public class T5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Please Enter your City");
        String city=sc.nextLine();
        System.out.println("Please Enter the temperature in F"+city);
        double temp=sc.nextDouble();
        double tempInCelsius=(temp-32)*5.0/9.0;
        System.out.println("Temperature in "+city+" is "+tempInCelsius+"C");
    }
}
