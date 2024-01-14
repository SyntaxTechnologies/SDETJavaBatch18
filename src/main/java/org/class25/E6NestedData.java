package org.class25;

import java.util.ArrayList;

public class E6NestedData {
    public static void main(String[] args) {

        ArrayList<ArrayList<Integer>> nestedArr=new ArrayList<>();

        ArrayList<Integer> arr1=new ArrayList<>();
        arr1.add(10);
        arr1.add(12);
        arr1.add(15);

        ArrayList<Integer> arr2=new ArrayList<>();
        arr2.add(5);
        arr2.add(3);
        arr2.add(2);

        nestedArr.add(arr1);
        nestedArr.add(arr2);
        System.out.println(nestedArr);



    }
}
