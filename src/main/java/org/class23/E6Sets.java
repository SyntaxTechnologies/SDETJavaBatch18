package org.class23;

import java.util.LinkedHashSet;
import java.util.Set;

public class E6Sets {
    public static void main(String[] args) {
        Set<String> fruit=new LinkedHashSet<>();
        fruit.add("Mango");
        fruit.add("Kiwi");
        fruit.add("Apple");
        fruit.add("Banana");
        fruit.add("Apple");
        System.out.println(fruit);


    }
}
