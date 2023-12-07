package org.class13;

public class Printer {

    void printHello(){
        System.out.println("Hello World");
    }

    void printWord(String word){
        System.out.println(word);
    }

    void printManyTimes(String word,int n){

        for (int i = 0; i < n; i++) {
            System.out.println(word);
        }
    }


}
