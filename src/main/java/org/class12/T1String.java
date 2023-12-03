package org.class12;
/*
Create a String that will hold a sentence.
Write a program to get a new String without any spaces.
 */
public class T1String {
    public static void main(String[] args) {

        String str="Java is very easy";
        String newStr=str.replaceAll(" ","");
        System.out.println(newStr);
    }
}
