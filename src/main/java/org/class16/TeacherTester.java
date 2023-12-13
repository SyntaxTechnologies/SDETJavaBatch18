package org.class16;

public class TeacherTester {
    public static void main(String[] args) {
        Teacher t=new Teacher();
        t.joke();

        MathTeacher mt=new MathTeacher();
        mt.hoursOfTeaching=45;
        mt.teachMath();

    }
}
