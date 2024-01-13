package org.class24;

public class Person {

    private String name;
    private String lastName;
    private int age;
    private int salary;

    public Person(String name, String lastName, int age, int salary) {
        this.name = name;
        this.lastName = lastName;
        this.age = age;
        this.salary = salary;
    }


    public void printInfo(){
        System.out.println(name+" "+lastName+" "+age+" "+salary);
    }
}