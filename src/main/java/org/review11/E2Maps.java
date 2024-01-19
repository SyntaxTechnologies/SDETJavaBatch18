package org.review11;

import java.util.ArrayList;
import java.util.LinkedHashMap;

public class E2Maps {
    public static void main(String[] args) {


        LinkedHashMap<String,Integer> studentsMap=new LinkedHashMap<>();
        studentsMap.put("John",95);
        studentsMap.put("Adam",88);
        studentsMap.put("Muh",92);
        studentsMap.put("Kat",91);
        studentsMap.put("Kari",90);
        System.out.println(studentsMap);
        ArrayList<String> names=new ArrayList<>();
        studentsMap.forEach((k, v)->{
            if(v>90)
            names.add(k);
        });
        System.out.println(names);
    }
}
