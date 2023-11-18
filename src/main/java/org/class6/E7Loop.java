package org.class6;
/*
Print even numbers from 20 to 100
	 Expected output 20 22 24 26….. 100

 */
public class E7Loop {
    public static void main(String[] args) {

    int i=20;

    do{
        System.out.print(i+" ");
        i=i+2;
    }while (i<=100);

    }
}
