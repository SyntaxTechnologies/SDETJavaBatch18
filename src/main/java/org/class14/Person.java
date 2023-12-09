package org.class14;

public class Person {

   static int noOfEye=2;
    String name;
    int age;
    double weight;

    //Instance method
    void printInfo(){

        System.out.println(name+" "+age+" "+weight);
    }

    //Static Method
    static void printNoOfEyes(){
        System.out.println(noOfEye);
    }

}
