package org.class23;

import java.util.Set;
import java.util.TreeSet;

public class T2 {
    public static void main(String[] args) {
        Set<String> countriesSet = new TreeSet<>();
        countriesSet.add("Canada");
        countriesSet.add("Australia");
        countriesSet.add("Brazil");
        countriesSet.add("India");
        countriesSet.add("Japan");
        System.out.println(countriesSet);

        for (String country : countriesSet) {
            System.out.println(country);
        }
    }
}

