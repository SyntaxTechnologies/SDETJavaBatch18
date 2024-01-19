package org.review11;

import java.util.LinkedList;

public class E1ArrayListVsLinkedList {
    public static void main(String[] args) {
        long startTime=System.currentTimeMillis();
        LinkedList<Integer> numbers=new LinkedList<>();
        for (int i = 0; i <1000000 ; i++) {
            numbers.add(0,i);
        }

        long endTime=System.currentTimeMillis();
        System.out.println(endTime-startTime);
    }
}
