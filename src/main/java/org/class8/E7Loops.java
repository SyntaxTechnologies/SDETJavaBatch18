package org.class8;

public class E7Loops {
    public static void main(String[] args) {

        char[] word={'S','u','n','d','a','y'};
        //write a loop to print these letters in reverse order
        //yadnus
        for (int i = word.length-1; i >=0; i--) {
            System.out.print(word[i]+" ");
        }
    }
}
