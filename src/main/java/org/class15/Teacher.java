package org.class15;

public class Teacher {
   private String name;
  private  String address;

  private int age;
  private double weight;



    public Teacher(String name, String address, int age) {
        this.name = name;
        this.address = address;
        this.age = age;
    }

    public Teacher(String name, String address, int age, double weight) {
        this(name, address, age);
        this.weight = weight;
    }

    void printInfo(){
        System.out.println(name+" "+address);
    }
}
