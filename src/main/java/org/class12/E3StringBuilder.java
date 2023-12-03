package org.class12;

public class E3StringBuilder {
    public static void main(String[] args) {

        StringBuilder sb=new StringBuilder("Hello World");
       // System.out.println(sb.reverse());
        System.out.println(sb.deleteCharAt(0));
        System.out.println(sb.insert(1,"H"));

    }
}
