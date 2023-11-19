package org.class7;

public class E12Arrays {
    public static void main(String[] args) {
        int [] numbers={10,20,30,45,69,55,45,69,20};
        //this is how we can get the size of the array
        System.out.println(numbers.length);

        for(int i=0; i<numbers.length;i++){
            System.out.print(numbers[i]+" ");
        }
    }
}
