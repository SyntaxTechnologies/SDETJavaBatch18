package org.review7;

public class Dog {

   private String name;
    private String color;
    private   int age;
    private  double weight;

   // When ever you are planing to reuse a variable in more than
   // two methods of your class create an instance variable for that
    public Dog(String name,String color,int age,double weight){
        this.name=name;
        this.color=color;
        this.age=age;
        this.weight=weight;
    }
    void printInfo(){
        System.out.println(name+" "+color+" "+age+" "+weight);
    }

    int sumArray(int [] arr){
        //whenever I am writing any logic in a method or loop or if condition and
        // I temporarily need to store some data then we should create local variables.
        int sum=0;
        for (int i = 0; i < arr.length; i++) {
            sum+=arr[i];
        }
        return sum;
    }

}
