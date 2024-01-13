package org.class24;

import java.util.Map;
import java.util.TreeMap;

public class T1 {
    public static void main(String[] args) {
        Map<String,String> maps=new TreeMap<>();
        maps.put("Afghanistan","kabul");
        maps.put("India","Delhi");
        maps.put("Pakistan","Islamabad");
        maps.put("Iran","Tehran");
        maps.put("France","PAris");
        maps.forEach((k,v)-> System.out.println(v));
        maps.forEach((k,v)-> System.out.println(k+" "+v));
    }
}

