package org.interview;

public class PrintNumbers {


    public static void main(String[] args) {
        printNumbers(1);
    }


    public static void printNumbers(int number) {
        if (number <= 100) {
            System.out.println(number);
            printNumbers(number + 1); // recursive call with incremented number
        }
    }
}
