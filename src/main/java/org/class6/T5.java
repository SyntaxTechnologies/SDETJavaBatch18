package org.class6;

/*
 Print only odd numbers from 99 to 1
Expected output
99 97 95 93….1

 */
public class T5 {
    public static void main(String[] args) {
        int i=99;
        while(i>=1){
            System.out.print(i+" ");
            i=i-2;
        }
    }
}
