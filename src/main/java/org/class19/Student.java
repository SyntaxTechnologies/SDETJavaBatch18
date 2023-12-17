package org.class19;

public class Student {

    void homework() {
        System.out.println("honework");
    }

    void exam() {
        System.out.println("exam");
    }

    void study() {
        System.out.println("study study");
    }
}
class SyntaxStudents extends Student{
    void play() {
        System.out.println("Student likes to play cards");
    }
}

class CollegeStudent extends Student{
    void exam() {
        System.out.println("exam");
    }
}
class SchoolStudent extends Student{
    void homework() {
        System.out.println("chilling instead of doing homework)))");
    }

}