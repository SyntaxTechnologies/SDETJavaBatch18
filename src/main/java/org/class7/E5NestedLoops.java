package org.class7;

public class E5NestedLoops {

    public static void main(String[] args) {

        for (int i = 0; i < 5; i++) {
            for (int j = i; j < 5; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
