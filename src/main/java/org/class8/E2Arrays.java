package org.class8;

public class E2Arrays {
    public static void main(String[] args) {

        int [] numbers={10,20,30,40,45,55,25,80,90};
        // add all the even numbers from the above array
        int sum=0;
        for (int i = 0; i < numbers.length; i++) {

            if(numbers[i]%2==0){
                sum=sum+numbers[i];
            }

        }
        System.out.println(sum);



    }
}
