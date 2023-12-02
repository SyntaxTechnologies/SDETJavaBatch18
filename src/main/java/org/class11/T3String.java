package org.class11;

public class T3String {
    public static void main(String[] args) {
        String str="Today is Saturday";
        // print the all the index of letter a from above string

        for (int i = 0; i < str.length(); i++) {

            if(str.charAt(i)=='a'){
                System.out.println(i);            }
        }
    }
}
