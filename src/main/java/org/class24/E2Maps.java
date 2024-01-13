package org.class24;

import java.util.HashMap;
import java.util.Map;

public class E2Maps {
    public static void main(String[] args) {

        Map<String,Integer> maps= new HashMap<>();
        maps.put("Apple",20);
        maps.put("Banana",15);
        maps.put("Kiwi",5);
        maps.put("Orange",20);
        System.out.println(maps);
        maps.remove("Kiwi");
        System.out.println(maps);
        maps.replace("Apple",30);
        System.out.println(maps);
        maps.clear();
        System.out.println(maps);





    }
}
