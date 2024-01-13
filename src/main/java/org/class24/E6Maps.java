package org.class24;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class E6Maps {
    public static void main(String[] args) {


        Map<Integer,String> studentMap=new LinkedHashMap<>();
        studentMap.put(1,"Sino");
        studentMap.put(2,"Nasima");
        studentMap.put(3,"Karimi");
        studentMap.put(10,"Ray");
        studentMap.put(5,"Halil");
        System.out.println(studentMap);
        //Map->Entry->Key value
        // var studentEntries=  studentMap.entrySet();
        Set<Map.Entry<Integer, String>> entries = studentMap.entrySet();
        for (Map.Entry<Integer, String> e:entries){
            if(e.getKey()>2){
            System.out.println(e.getKey()+" "+e.getValue());}
        }

        System.out.println("************************");

        for(var e:studentMap.entrySet()){
            var key=e.getKey();
            var value=e.getValue();
            System.out.println(key+" "+value);
        }

        System.out.println("******************");
        studentMap.forEach((k, v)-> System.out.println(k+" "+v));





    }
}
