package org.class8;

public class T1 {
    public static void main(String[] args) {
        String[] names={"Aidos","Zeeshan","Abid","Sharif","Zeeshan"};
        //Write a program to count how many times the name Zeeshan as
        //appeared in this array
        int count=0;
        for (int i = 0; i < names.length; i++) {
            if(names[i].equals("Zeeshan")){
                count++;
            }
        }
        System.out.println("Zeeshan appeared "+count+" times");
    }
}
