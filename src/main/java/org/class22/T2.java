package org.class22;

import java.util.ArrayList;

public class T2 {
    public static void main(String[] args) {
        ArrayList<String> words=new ArrayList<>();
        words.add("Carlosa");
        words.add("Kim Jong Una");
        words.add("Nazir");
        words.add("Sherif");

        for (int i = 0; i < words.size(); i++) {
            if(words.get(i).endsWith("a")){
                words.remove(i);
                i--;
            }
        }
        System.out.println(words);
    }
}
