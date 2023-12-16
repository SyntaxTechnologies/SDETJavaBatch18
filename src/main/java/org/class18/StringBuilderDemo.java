package org.class18;

public class StringBuilderDemo {

    public static void main(String[] args) {

        String str="Hello";
        System.out.println( str.concat("And Welcome"));

        StringBuilder sb=new StringBuilder("Hello");
        sb.append("And Welcome");
        System.out.println(sb);

        StringBuilder s= new StringBuilder();
        for (int i = 0; i < 1000; i++) {
            s.append(i);
        }
        System.out.println(s);

    }
}
