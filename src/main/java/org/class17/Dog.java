package org.class17;

class Animal{
    private   String name;
    private  String color;
    private  int age;
    private  double weight;

    public Animal(){

    }
    public Animal(String name,String color,int age,double weight){
        this.name=name;
        this.color=color;
        this.age=age;
        this.weight=weight;
    }
    public void printInfo(){
        System.out.println(name+" "+color+" "+age+" "+weight);
    }
}
public class Dog extends Animal {

    Dog(String name,String color,int age,double weight){
        super(name,color,age,weight);
    }
}

 class Cat extends Animal{
    Cat(){
      super();
    }
}

