package org.class14;

public class T2 {

    int sumArray(int [] arr){

        int sum=0;
        for (int i = 0; i < arr.length; i++) {
            sum=sum+arr[i];
        }
        return sum;
    }

    public static void main(String[] args) {

        T2 t=new T2();
        int [] numbers={10,10,20};
        int sum=t.sumArray(numbers);
        System.out.println(sum);

    }
}
