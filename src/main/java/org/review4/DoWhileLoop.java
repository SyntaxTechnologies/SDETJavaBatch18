package org.review4;

public class DoWhileLoop {

    public static void main(String[] args) {

        // do while - when we do NOT know in advance
        // how many times we want to repeat block of code

        /*
            while vs do while
            in do while block of code will be executed at least once
            even when condition is false
         */

        // I want to say hello 4 times
        int n=0;

        do {
            n+=2;
            System.out.println("Hello "+n);
        }while(n<10);

        System.out.println(n);

        System.out.println("---------- Another way -------------");

        int i=2;
        do {
            if (i%2==0) {
                System.out.print(i + " ");
            }
            i++;

        }while(i<=10);

        int a=2;

        do {
            if (a%2==0) {
                System.out.print(a + " ");
                a++;
            }

        }while(a<=10);

        System.out.println("End of the program");

    }
}
