package org.review2;

public class ElseIfBlock {

    public static void main(String[] args) {

        int worldCup = 2002;

        if (worldCup == 2002) {
            System.out.println("Host country is Korea and Japan");
        } else if (worldCup == 2004) {
            System.out.println("Host country is Germany");
        } else if (worldCup == 2010) {
            System.out.println("Host country is Soth Africa");
        } else if (worldCup == 2014) {
            System.out.println("Host country is Brazil");
        } else {
            System.out.println("Host country is unknown");
        }
    }
        /*
         if (condition) {
            code to execute;
         };

        //when we would like to add otherwise
        if (condition) {
            code to execute;
        } else {
            code to execute;
        }

        // when we have multiple condition to test

        if (condition) {
            code to execute;
        } else if (condition) {
            code to execute;
        }else if (condition) {
            code to execute;
        }
         */

}
