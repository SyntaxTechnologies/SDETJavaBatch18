package org.class22;

import java.util.ArrayList;

public class T4 {
    public static void main(String[] args) {
        ArrayList<String> words=new ArrayList<>();
        words.add("Carlosa");
        words.add("Kim Jong Una");
        words.add("Nazir");
        words.add("Sherif");
        words.forEach(x-> System.out.println(x));
    }
}
