package org.class8;

public class E3Continue {
    public static void main(String[] args) {

        int[] numbers={10,45,12,47,20,30};
        for (int i = 0; i < numbers.length; i++) {
            if(numbers[i]%2!=0){
                continue;
            }
            System.out.println(numbers[i]);
        }

    }
}
