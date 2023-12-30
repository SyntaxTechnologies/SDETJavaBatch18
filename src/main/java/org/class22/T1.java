package org.class22;

import java.util.ArrayList;

public class T1 {
    public static void main(String[] args) {

        ArrayList<String> names=new ArrayList<>();
        names.add("Sayed");
        names.add("Zainab");
        names.add("Siavush");
        names.add("Heidar");
        names.add("Moadassa");

        System.out.println(names.isEmpty());
        System.out.println(names.contains("Heidar"));
        System.out.println(names.size());
        System.out.println(names);

    }
}
