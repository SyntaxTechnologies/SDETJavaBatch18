package org.class21;

public class AnimalTester {
    public static void main(String[] args) {

       // Animal animal=new Animal();
        Cat c=new Cat();
        c.eat();
        c.speak();
        c.sleep();
        Animal c2=new Cat();
        Animal c3=new Dog();


        // Break till 11:55
        Animal [] arr={new Cat(),new Dog()};
        for (Animal a:arr){
            a.eat();
            a.speak();
            a.sleep();
        }

    }
}
