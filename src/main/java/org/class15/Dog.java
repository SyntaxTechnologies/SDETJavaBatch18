package org.class15;

public class Dog {

  private    String name;
  private   String breed;
  private   String color;
  private    int age;

 public   Dog(String dName,String dBreed,String dColor, int dAge){
       name=dName;
       breed=dBreed;
       color=dColor;
       if(dAge<30){
           age=dAge;
       }else{
           System.out.println("Wrong age");
       }

   }

    void printInfo(){
        System.out.println(name+" "+breed+" "+color+" "+age);
    }
}
