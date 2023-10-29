package org.class2;
/*
Write a Java program to add, subtract,
multiply and divide 2 decimal values.
Your program should say. “The _______ of 2 numbers ___
and ___ is equal to _____”
The addition of 2 numbers 10 and 20 is equal to 30

 */
public class T2 {

    public static void main(String[] args) {
        double num1=20;
        double num2=10;
        System.out.println("The Addition of 2 numbers "+num1+" and "+num2+" is equal to "+(num1+num2));
        System.out.println("The Subtraction of 2 numbers "+num1+" and "+num2+" is equal to "+(num1-num2));
        System.out.println("The Multiplication of 2 numbers "+num1+" and "+num2+" is equal to "+(num1*num2));
        System.out.println("The Division of 2 numbers "+num1+" and "+num2+" is equal to "+(num1/num2));
    }
}
