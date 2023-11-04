package org.class3;
/*
Create a Java program and declare int variable that will
hold a month number. Based on the value of the variable
your program should print the name of the month.
 */
public class T4 {
    public static void main(String[] args) {

        int month=3;

        if(month==1){
            System.out.println("Jan");
        }else if(month==2){
            System.out.println("Feb");
        } else if(month==3){
            System.out.println("Mar");
        } else if(month==4){
            System.out.println("Apr");
        } else if(month==5){
            System.out.println("May");
        } else if(month==6) {
            System.out.println("Jun");
        } else if(month==7){
            System.out.println("Jul");
        }else if(month==8){
            System.out.println("Aug");
        }else if(month==9){
            System.out.println("Sep");
        }else if(month==10){
            System.out.println("Oct");
        }else if(month==11){
            System.out.println("Nov");
        }else if(month==12){
            System.out.println("Dec");
        }else {
            System.out.println("Wrong Month");
        }

    }
}
