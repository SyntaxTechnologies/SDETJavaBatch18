package org.class22;

import java.util.ArrayList;
import java.util.List;

public class E6ArrayList {
    public static void main(String[] args) {
        //  if a name contains the
        // letter o replace it with java
        List<String> names=new ArrayList<>();
        names.add("Maria");
        names.add("Poorna");
        names.add("Damla");
        names.add("Kamla");
        for (int i = 0; i <names.size() ; i++) {
            String s=names.get(i);
            if(s.contains("o")){
                //Replaces the elements
                names.set(i,"Java");

            }
        }
        System.out.println(names);



    }
}
