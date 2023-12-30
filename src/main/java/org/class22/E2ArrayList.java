package org.class22;

import java.util.ArrayList;

public class E2ArrayList {
    public static void main(String[] args) {

        ArrayList<String> names=new ArrayList<>();
        System.out.println(names.size());
        names.add("Bikal");
        System.out.println(names.contains("Bikal"));
        System.out.println(names.size());
        names.remove("Bikal");
        System.out.println(names.size());




    }
}
