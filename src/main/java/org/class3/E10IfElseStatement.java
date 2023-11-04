package org.class3;

public class E10IfElseStatement {
    public static void main(String[] args) {

        int age=60;
        if (age>=60){
            System.out.println("You get 10% discount");
        }else{
            System.out.println("No discount for you");
        }

        int price=100;
        if(age>=60){
            price=price-10;
        }else{
            price=price;
        }
        System.out.println(price);


    }
}
