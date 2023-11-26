package org.class9;

public class T5 {
    public static void main(String[] args) {
        int [][] num={
                {12,34,54,67},
                {45,35,22,46},
                {2,23,56,73}
        };
        for (int i = 0; i < num.length; i++) {
            for (int j = 0; j < num[i].length; j++) {
                if (num[i][j]%2==0) {
                    System.out.print(num[i][j] + " ");
                }
            }
            System.out.println();
        }
    }
}
