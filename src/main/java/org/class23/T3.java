package org.class23;

import java.util.LinkedHashSet;
import java.util.Set;

public class T3 {
    public static void main(String[] args) {
            Set<String> city=new LinkedHashSet<>();
            city.add("Annapolis");
            city.add("New York");
            city.add("Ankara");
            city.add("Washington");
            city.add("Denver");

            city.removeIf(x->x.startsWith("A"));

            System.out.println(city);
        }

}
