package org.class18;

public class Printer {

    private void print(){
        System.out.println("Hello");
    }

    private void print(String word){
        System.out.println(word);
    }

    public static void main(String[] args) {
        Printer p=new Printer();
        p.print();
        p.print("Java");
    }
}
