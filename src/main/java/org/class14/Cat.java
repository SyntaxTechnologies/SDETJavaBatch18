package org.class14;

public class Cat {
    //instance variable
    String name="kitti";

    void printName(){
        //local Vairable
        String name="Pishak";
        System.out.println(name);
    }

    public static void main(String[] args) {
        Cat c=new Cat();
        c.printName();
    }
}
