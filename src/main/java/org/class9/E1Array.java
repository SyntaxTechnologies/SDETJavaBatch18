package org.class9;

public class E1Array {
    public static void main(String[] args) {
        int [] numbers={10,25,35,30,40,45,45};
        // initially storing the first number as previous
        int previous=numbers[0];
        // a variable to track if we find any counter example
        boolean isSorted=true;
        for (int current:numbers){
            //checking for any counter example
            if(previous>current){
                isSorted=false;
                break;

            }
            // making our current as previous
            previous=current;
        }

        System.out.println("Is array Sorted "+isSorted);
    }
}
