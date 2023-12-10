package org.class15;

public class Demo {

    Demo(){
        System.out.println("1");
    }

    Demo(int age){
        System.out.println("2");
    }

    Demo(String name){
        System.out.println("3");
    }
    Demo(String name,int age){
        System.out.println("4");
    }

    Demo(int age,String name){
        System.out.println("5");
    }
}
