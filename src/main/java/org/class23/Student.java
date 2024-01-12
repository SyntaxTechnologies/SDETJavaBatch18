package org.class23;

public class Student {
    private String name;
    private String id;

    public Student(String name, String id) {
        this.name = name;
        this.id = id;
    }
    void printInfo(){
        System.out.println(name+" "+id);
    }
}
