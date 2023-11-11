package org.class4;


import java.util.Scanner;

public class E3Scanner {
    public static void main(String[] args) {
        System.out.println("Please Enter your age");
        /*
        Scanner is datatype
        scan is a variable
        new is a keyword that we use to create objects
        (System.in) means we want to read from keyboard
         */
        Scanner scan=new Scanner(System.in);
        //scan.nextInt() take the int number from the
        //keyboard ans store it inside age variable
        int age=scan.nextInt();
        System.out.println("You are "+age+" years old");
    }
}
