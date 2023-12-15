package org.review7;

public class Cat {
   private String name;
   String color;

   public int age;

   void printName(){
       System.out.println(name);

   }

    public static void main(String[] args) {
        Cat c=new Cat();
        c.name="kitti";
        c.color="black";
        c.age=15;
    }
}

class CatTester{
    public static void main(String[] args) {
        Cat c=new Cat();
        c.color="White";
        c.age=20;

    }
}
