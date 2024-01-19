package org.review11;

import java.util.TreeSet;

public class Quiz {

    public static void main(String[] args) {
        TreeSet map = new TreeSet();
        map.add("one");
        map.add("two");
        map.add("three");
        map.add("four");
        map.add("one");
       map.forEach(x-> System.out.println(x));
       // Break till 8:52
    }
}
