package org.class22;

import java.util.ArrayList;

public class E4ArrayList {
    public static void main(String[] args) {

        ArrayList<String> names=new ArrayList<>();
        names.add("Maria");
        names.add("Poorna");
        names.add("Damla");
        names.add("Kamla");
        System.out.println(names);
        for (int i = 0; i < names.size(); i++) {
            System.out.println(names.get(i));
        }

        System.out.println("************");
        for(String s:names){
            System.out.println(s);
        }



    }
}
