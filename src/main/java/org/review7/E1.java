package org.review7;
/*
Create a method which will take an array of ints as
input and going to return the sum of all the numbers
from the input array
 */
public class E1 {

  public static int arr(int[] number) {
        int sum = 0;
        for (int i = 0; i < number.length; i++) {
            sum = sum + number[i];

        }
        System.out.println(sum);
        return sum;

}

    public static void main(String[] args) {

       int [] ar= new int[]{10,20,56};

        System.out.println( arr(ar));
    }
}
