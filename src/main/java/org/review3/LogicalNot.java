package org.review3;

public class LogicalNot {

    public static void main(String[] args) {

        boolean hungry=!true;

        System.out.println(hungry);


        boolean agreeCheckbox=false;

        if(!agreeCheckbox) {
            System.out.println("I will click on checkbox to select it");
        } else {
            System.out.println("I am not clicking on checkbox");
        }

        System.out.println("Clicking on Submit Payment");
    }
}
