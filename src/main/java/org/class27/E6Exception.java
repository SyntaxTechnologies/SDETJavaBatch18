package org.class27;

public class E6Exception {
    public static void main(String[] args) {


        System.out.println(1);
        try{
            System.out.println(2);
           // System.out.println(10/0);
            System.out.println(3);
        }catch (ArithmeticException e){
            System.out.println(4);
           // System.out.println(10/0);
            System.out.println(5);
        }finally {
            System.out.println(10/0);
            System.out.println("Will always be executed");
        }
        System.out.println(8);
    }
}
