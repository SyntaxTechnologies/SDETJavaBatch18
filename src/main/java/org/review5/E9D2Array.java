package org.review5;

public class E9D2Array {
    public static void main(String[] args) {

        double [][] numbers={
                {10,20,30,40},
                {20,40,60,80,100},
                {30,60,90}
        };

        System.out.println(numbers.length);
        System.out.println(numbers[1].length);
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++) {
                System.out.print(numbers[i][j]+" ");
            }
            System.out.println();

        }



    }
}
