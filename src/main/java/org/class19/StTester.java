package org.class19;

public class StTester {
    public static void main(String[] args) {
        Student[] arr = {new Student(), new SyntaxStudents(), new CollegeStudent(), new SchoolStudent()};
        for (Student student : arr) {
            student.homework();
            student.exam();
            student.study();
            if(student instanceof SyntaxStudents ){
              SyntaxStudents s=  (SyntaxStudents)student;
              s.play();
            }

        }
    }
}