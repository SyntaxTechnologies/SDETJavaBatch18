package org.class24;

import java.util.HashMap;
import java.util.Map;

public class Task3 {
    public static void main(String[] args) {
        Map<String, Integer> employee=new HashMap<>();
        employee.put("Samad",80000);
        employee.put("Amir",90000);
        employee.put("Amid",100000);

        String empName="";
        int salary=0;

        for (var e:employee.entrySet()){
            if(e.getValue()>salary){
                empName=e.getKey();
                salary=e.getValue();
            }
        }
        System.out.println(empName+" "+salary);

    }
}
