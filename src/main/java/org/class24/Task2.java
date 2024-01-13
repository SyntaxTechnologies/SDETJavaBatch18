package org.class24;

import java.util.TreeMap;

public class Task2 {
    public static void main(String[] args) {
        TreeMap<Integer, Person> pers=new TreeMap<>();
        pers.put(1,new Person("Farid","F",25,3000));
        pers.put(2,new Person("Rauf","R",26,4000));
        pers.put(3,new Person("Alim","A",27,5000));
        pers.put(4,new Person("Yodgor","Y",28,6000));
        pers.forEach((key,personObj)->{
            System.out.println("id:"+key);
            personObj.printInfo();
        });
    }
}
