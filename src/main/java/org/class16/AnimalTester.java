package org.class16;

public class AnimalTester {
    public static void main(String[] args) {

        Dog d=new Dog();
        d.name="Jacky";
        d.color="Black";
        d.age=10;
        d.weight=22;
        d.printInfo();
        d.bark();

        Cat c=new Cat();
        c.name="lulu";
        c.color="White";
        c.age=2;
        c.weight=3;
        c.sleep();
        c.printInfo();


        Animal a=new Animal();
        a.name="lol";
        a.sleep();
    }
}
