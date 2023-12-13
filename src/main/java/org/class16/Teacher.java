package org.class16;

public class Teacher {
    String name;
    String subject;
    int hoursOfTeaching;

    void teach(){
        System.out.println("teaching......");
    }
    void joke(){
        System.out.println("hahha");
    }
}
class MathTeacher extends Teacher{

    void teachMath(){
        System.out.println("Teaching Math");
    }
}

class ChemistryTeacher extends Teacher{

void teachChem(){
    System.out.println("HCL is Salt");
}

}
class PianoTeacher extends Teacher {

    void teachPiano(){
        System.out.println("Teaching Piano");
    }
}