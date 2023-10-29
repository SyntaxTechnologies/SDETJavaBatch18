package org.class2;

public class E10Quiz {
    public static void main(String[] args) {
        System.out.println(2+2*2); //6
        System.out.println((2+2)*2); //8
        System.out.println("10"+10); //1010
        /*
        when ever there are more than 2 operations on a single
        line java executes from left to right for example in below
        line "10"+10=>"1010"+10=>101010"
         */
        System.out.println("10"+10+10);
        //10+10=>20+"10"=>"2010"
        System.out.println(10+10+"10");
        //11:55

    }
}
