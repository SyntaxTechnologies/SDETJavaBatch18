package org.review4;

public class ForLoop {

    public static void main(String[] args) {

        // for loop is used when we know in advance
        // how many times we want to repeat block of code

        /*
            for(initialization; condition; increment/decrement) {
                code to repeat;
            }
         */

        //Say hello 4 times

        for(int i=0; i<4; i++) {

            System.out.println("Hello "+i);
        }

        for(int i=2; i<=10; i+=3){

            System.out.println(i); //2 5 8
        }

        // we want to print numbers from 10 till 2
        for(int i=10; i>=2;i--) {
            System.out.print(i +" ") ;
        }

        for(int i=10; i<2;i--) {
            System.out.print(i +" ") ; //no execution because condition is false
        }

        for(int i=10; i>=2;i++) {
            System.out.print(i +" ") ; //10 11 12 and infinite
        }
    }
}
