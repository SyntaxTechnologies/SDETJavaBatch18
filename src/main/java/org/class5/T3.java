package org.class5;

import java.util.Scanner;

/*
Write a program that will ask user to  inputs
the current time (use 24 hour format).
Based on the given time define:
if hour is between 1-11 --> Morning
if hour between 12-15 --> Afternoon
if hour between 16-20 --> Evening
if hour between 21-24 --> Night
If anything else print invalid

 */
public class T3 {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Please Enter hour from 1 to 24");
        int hourNumber=sc.nextInt();
        if(hourNumber>=1 && hourNumber<=11){
            System.out.println("Morning");
        }else if(hourNumber>=12&&hourNumber<=15){
            System.out.println("Afternoon");
        }else if(hourNumber>=16&& hourNumber<=20){
            System.out.println("Evening");
        } else if (hourNumber>=21&& hourNumber<=24) {
            System.out.println("Night");
        }else{
            System.out.println("Invalid");
        }


    }
}
