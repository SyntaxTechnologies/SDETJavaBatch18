package org.class21;

public  abstract class Animal {

   public abstract void eat();

    public  void sleep(){
        System.out.println("Animals Sleep");
    }

    public abstract void speak();
}

 class Dog extends Animal{

    @Override
    public void eat() {
        System.out.println("Dogs like to eat meat");
    }
    @Override
    public void speak() {
        System.out.println("Wuff Wuff");
    }
}

class Cat extends Animal{

    @Override
    public void eat() {
        System.out.println("Cats like to eat Fish");
    }

    @Override
    public void speak() {
        System.out.println("Meow Meow");
    }
}