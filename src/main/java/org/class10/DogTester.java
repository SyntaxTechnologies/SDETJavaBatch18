package org.class10;

public class DogTester {
    public static void main(String[] args) {
        //Creating an object of the class
        Dog dog1= new Dog();

        /*
        Dog => Data type
        dog1=> is a variable that holds the object
        new Dog();=> Creating the object of Dog class
         */

        dog1.name="Jacky";
        dog1.breed="German";
        dog1.weight=15;
        dog1.color="Black";
        dog1.age=5;

        System.out.println(dog1.name);
        System.out.println(dog1.breed);
        System.out.println(dog1.weight);
        System.out.println(dog1.age);
        dog1.bark();
        dog1.sleep();

        Dog dog2=new Dog();
        dog2.name="Leo";
        dog2.breed="BullDog";
        dog2.weight=8;
        dog2.color="White";
        System.out.println(dog2.name);
        System.out.println(dog2.breed);
        System.out.println(dog2.weight);
        System.out.println(dog2.color);
        dog2.eat();
        dog2.sleep();





    }
}
