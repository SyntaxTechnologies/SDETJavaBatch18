package org.class4;

import java.util.Scanner;

/*
You are DMV representative and
you need to ask customer their age.
If they are 18 or older you will
issue a driver license to them,
otherwise you will offer them to get a learners permit.
 */
public class T4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Please Enter your age");
        int age=sc.nextInt();

        if(age>=18){
            System.out.println("I will issue a driving license to you");
        }else{
            System.out.println("for now you can only have learners permit");
        }
    }

}
