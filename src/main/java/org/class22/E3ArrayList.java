package org.class22;

import java.util.ArrayList;

public class E3ArrayList {
    public static void main(String[] args) {

        ArrayList<String> names=new ArrayList<>();
        names.add("Maria");
        names.add("Poorna");
        names.add("Damla");
        names.add("Kamla");
        System.out.println(names.size());
        System.out.println(names.contains("Hananana"));
        System.out.println(names);
      //  System.out.println(names.remove("Kamla"));
        System.out.println(names.remove(3));
        System.out.println(names.get(0));
        names.set(0,"Nasima");
        System.out.println(names);
        System.out.println(names.indexOf("Damla"));
        System.out.println(names.indexOf("Carlos"));
        // Break till 1:49




    }
}
