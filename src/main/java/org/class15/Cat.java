package org.class15;

public class Cat {
  private   String name;
   private String color;
   private int age;

   public Cat(String name,String color,int age){
       this.name=name;
       this.color=color;
       this.age=age;
   }

   public void printInfo(){

       System.out.println(name+" "+color+" "+age);
   }
    public static void main(String[] args) {
        Cat c=new Cat("Kitti","White",13);
        c.printInfo();
    }
}
