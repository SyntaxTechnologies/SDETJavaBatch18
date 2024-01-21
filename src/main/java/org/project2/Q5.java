package org.project2;

import java.util.Arrays;

/*
/*5. Check if Two Strings are Anagrams: Given two strings, determine if they
are anagrams, meaning they contain the same characters in a different order.
For example, "listen" and "silent" are anagrams.
 */
public class Q5 {
    public static void main(String[] args) {

        String str1="listen";
        String str2="silent";
        char [] arr1=str1.toCharArray();
        char [] arr2=str2.toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));
        System.out.println(Arrays.equals(arr1,arr2));
    }
}
