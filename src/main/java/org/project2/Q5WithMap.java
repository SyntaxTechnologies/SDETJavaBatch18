package org.project2;

import java.util.Map;
import java.util.TreeMap;

/*
/*5. Check if Two Strings are Anagrams: Given two strings, determine if they
are anagrams, meaning they contain the same characters in a different order.
For example, "listen" and "silent" are anagrams.
 */
public class Q5WithMap {
    public static void main(String[] args) {

        String str1="listen";
        String str2="silent";
        System.out.println(countChar(str1));

    }

   public static Map<Character,Integer> countChar(String str){

        Map<Character,Integer> map=new TreeMap<>();

        for(char c:str.toCharArray()){

            if(map.get(c)==null){
                map.put(c,1);
            }else{
                map.put(c,map.get(c)+1);
            }

        }

        return map;
    }
}
