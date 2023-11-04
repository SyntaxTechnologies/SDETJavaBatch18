package org.class3;

public class E1TypeCasting {

    public static void main(String[] args) {

        int age=10;
        System.out.println(age);
        //moving smaller int box to a larger double box
        //thats why no issues
        double age2=age;
        System.out.println(age2);

        double largeBox=10.5;
        int smallBox=(int)largeBox;
        System.out.println(smallBox);
        short mediumBox=100;
        byte smallestBox=(byte)mediumBox;
        System.out.println(smallestBox);
    }
}
