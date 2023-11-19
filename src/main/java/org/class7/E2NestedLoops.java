package org.class7;

public class E2NestedLoops {
    public static void main(String[] args) {
        for (int row=0;row<5;row++){

            for(int column=0; column<10;column++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
