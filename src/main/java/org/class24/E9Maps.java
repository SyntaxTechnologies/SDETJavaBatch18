package org.class24;

import java.util.HashMap;
import java.util.Map;

public class E9Maps {
    public static void main(String[] args) {

        Map<String,Integer> maps= new HashMap<>();
        maps.put("Apple",20);
        maps.put("Banana",15);
        maps.put("Kiwi",5);
        maps.put("Orange",20);
      //  maps.entrySet().removeIf(e->e.getKey().contains("i"));
       // maps.entrySet().removeIf(e->e.getValue()==5);
       // maps.entrySet().removeIf(e->e.getValue()==5||e.getKey().contains("O"));
        maps.entrySet().removeIf(e->e.getKey().contains("a")||e.getKey().length()>5);
    /*    maps.entrySet().removeIf(e->{
            if(e.getValue()==5||e.getKey().toLowerCase().contains("O")){
                return  true;
            }else{
                return false;
            }
        });*/
        System.out.println(maps);

        // Break till 1:48

    }
}
