package org.review7;

public class E1Method {
    void print(){
        System.out.println("Hello There");
    }
    public static void main(String[] args) {
       // new E1Method().print();
        E1Method e1 =new E1Method();
        e1.print();
        String str=new String("Java");

        System.out.println( str.toLowerCase());
    }



}
