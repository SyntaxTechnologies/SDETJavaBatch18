package org.class23;

import java.util.TreeSet;

public class E7Sets {
    public static void main(String[] args) {

        TreeSet<Integer> numbers=new TreeSet<>();
        numbers.add(20);
        numbers.add(10);
        numbers.add(50);
        numbers.add(5);
        numbers.add(5);
        System.out.println(numbers);
        for(int n:numbers){
            if(n==20){
            System.out.println(n);}
        }
    }
}
