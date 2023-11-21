package org.review4;

public class NestedLoop {

    public static void main(String[] args) {

        for(int i=1; i<=3; i++) { //outer loop

            System.out.println("Hello");

            for(int j=1; j<3; j++) { //inner loop
                System.out.println("Bye");
            }
        }

        System.out.println("  ----------------------------------   ");

        for(int i=1; i<=3; i++) { //outer loop contorols number of complete iterations of the inner loop

            System.out.println("Hello");

            for(int j=1; j>3; j++) { //inner loop
                System.out.println("Bye");
            }
        }

        System.out.println("  ----------------------------------   ");

        for(int i=1; i>=3; i++) { //outer loop

            System.out.println("Hello");

            for(int j=1; j<3; j++) { //inner loop always depends on the outer loop
                System.out.println("Bye");
            }
        }


        System.out.println("  ----------------------------------   ");

        /* outer loop is infinite and printing hello bye bye
        for(int i=1; i<=3; i--) { //outer loop

            System.out.println("Hello");

            for(int j=1; j<3; j++) { //inner loop always depends on the outer loop
                System.out.println("Bye");
            }
        }
       */

        System.out.println("  ----------------------------------   ");

        /* infinite inner loop and it will print Hello 1 and buy many times
        for(int i=1; i<=3; i++) { //outer loop

            System.out.println("Hello");

            for(int j=1; j<3; j--) { //inner loop always depends on the outer loop
                System.out.println("Bye" +i +" "+j);
            }
        }
        */

        System.out.println(" -------   CAR  ------------  ");












    }
}
