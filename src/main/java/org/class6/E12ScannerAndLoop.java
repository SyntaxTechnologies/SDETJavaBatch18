package org.class6;

import java.util.Scanner;

public class E12ScannerAndLoop {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter the starting point");
        int start=sc.nextInt();
        System.out.println("Please Enter the end");
        int end=sc.nextInt();
        System.out.println("Please Enter the step size as well");
        int step=sc.nextInt();
        while(start<=end){
            System.out.print(start+" ");
            start=start+step;
        }


    }
}
