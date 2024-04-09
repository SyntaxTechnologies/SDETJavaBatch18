package org.interview;

import java.util.LinkedHashMap;
import java.util.Map;

public class Test {

    public static void main(String[] args) {
        String str="absashwwsdee";
        System.out.println(getMap(str));
    }

    public static Map<String,Integer> getMap(String str){
            Map<String,Integer> map=new LinkedHashMap<>();
        for (int i = 0; i < str.length(); i++) {
            String c=String.valueOf(str.charAt(i));

            if(map.get(c)==null){
                map.put(c,1);
            }else{
                int value=map.get(c);
                value++;
                map.put(c,value);
            }

        }

        return map;
    }
}
