package org.class21;

public class AnimalTester {
    public static void main(String[] args) {

       // Animal animal=new Animal();
        Cat c=new Cat("Mano","Black");
        c.eat();
        c.speak();
        c.sleep();
        Animal c2=new Cat("Mano","Black");
        Animal c3=new Dog("Mano","Black");
        c2.printInfo();


        // Break till 11:55
        Animal [] arr={new Cat("Mano","Black"),new Dog("Mano","Black")};
        for (Animal a:arr){
            a.eat();
            a.speak();
            a.sleep();
        }

    }
}
