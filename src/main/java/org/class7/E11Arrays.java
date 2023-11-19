package org.class7;

public class E11Arrays {
    public static void main(String[] args) {
        int [] numbers={10,25,44,33,56};
        // modify this code to add all of the numbers from array
        int sum=0;
        for(int i=0;i<5;i++){
            sum=sum+numbers[i];
        }
        System.out.println(sum);
    }
}
