package org.review6;

public class E6StringDemo {
    public static void main(String[] args) {
        String str="Today is a JAVA review class";
        System.out.println(str.charAt(4));
        // convert the letters to lowercase
        str=str.toLowerCase();
        int counter=0;
        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i)=='a'){
                counter++;
            }
        }
        System.out.println("Letter a appeared "+counter+" times");
    }
}
