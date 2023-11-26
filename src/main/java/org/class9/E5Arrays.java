package org.class9;

public class E5Arrays {
    public static void main(String[] args) {
        int[][] matrix={
                {10,20,50},
                {25,35,66},
                {80,90,78,45},
                {45,55,66}
        };

        for(int row=0; row<matrix.length;row++){
            for (int col = 0; col <matrix[row].length ; col++) {
                System.out.print(matrix[row][col]+" ");
            }
            System.out.println();
        }




    }
}
