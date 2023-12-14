package org.class17;

class GrandParent{
    GrandParent(){
        System.out.println("Granpa");
    }
}

public class Parent extends GrandParent {
    Parent(){
        System.out.println("Parent is born");
    }
    String name="israel";

}
class Child extends Parent{

    Child(){
        System.out.println("Child is Born");
    }
    void print(){

        System.out.println(name);
    }
}

class Tester{
    public static void main(String[] args) {
        Child c=new Child();
        c.print();
    }
}
