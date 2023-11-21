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

        for(int a=0; a<=9; a++) {

            for(int b=0; b<=9; b++) {

                for (int c=0; c<=9; c++) {

                    for (int d=0; d<=9; d++) {
                        System.out.println(a+" "+b+" "+c+" "+d);
                    }
                }
            }
        }

        System.out.println(" -------  MULTIPLICATION TABLE  ------------  ");

    for(int i=1; i<=10; i++) {

        for (int j=1; j<=10; j++) {

            System.out.println(i+" * "+j+" = "+(i*j));
        }
        System.out.println(" ---------------------------- ");
    }
    
    }
}
