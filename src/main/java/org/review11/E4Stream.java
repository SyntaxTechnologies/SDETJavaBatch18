package org.review11;

import java.util.Arrays;

public class E4Stream {
    public static void main(String[] args) {
        int[] arr={10,20,30,40,5};
        int min= Arrays.stream(arr).min().getAsInt();
        int sum= Arrays.stream(arr).sum();
        System.out.println(min);
        System.out.println(sum);
    }
}
