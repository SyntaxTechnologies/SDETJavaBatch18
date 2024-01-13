package org.class24;

import java.util.HashMap;
import java.util.Map;

public class E1Maps {
    public static void main(String[] args) {

        Map<String,Integer> maps= new HashMap<>();
        maps.put("Apple",20);
        maps.put("Banana",15);
        maps.put("Kiwi",5);
        maps.put("Orange",20);
        // duplicate keys are not allowed if we try it will replace previous value
     //   maps.put("Kiwi",15);
        System.out.println(maps);
        System.out.println(maps.size());
        System.out.println(maps.containsKey("Apple"));
        System.out.println(maps.containsKey("Apple".toLowerCase()));
        System.out.println(maps.containsKey("Legs"));
        System.out.println(maps.containsValue(25));
        System.out.println(maps.containsValue(5));
        System.out.println(maps.isEmpty());
        System.out.println(maps.get("Kiwi"));





    }
}
