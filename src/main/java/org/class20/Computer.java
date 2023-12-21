package org.class20;

// abstract means something is incompleted
// we cannot create an Object of the Asbtract Class
// every abstract class MUST participate in the Inheritance

public abstract class Computer {

    /*    OPTIONAL        OPTIONAL          MUST     MUST
       access modifiers non access modifier dataType name;
    */

    public static String type;
    public String name;
    protected int memory;
    String color;

    public Computer(String name, int memory, String color) {
        this.name=name;
        this.memory=memory;
        this.color=color;
    }

     /*   OPTIONAL              OPTIONAL     MUST     MUST
        access modifiers non access modifier returnType name() {}
     */

    abstract void executeCode();

    public abstract void readEmails();
}

class Apple extends Computer {

    public Apple(String name, int memory, String color){
        super(name, memory, color);
    }

    /*when we provide implementation to the abstract classes we MUST follow rules of Overriding !!!!
        same method name and parameter MUST be same - method signature MUST be same
        return type must be same
        Access modifier must be same OR wider
    */
    void executeCode(){
        System.out.println("Executing code on "+type+" "+name);
    }

    public void readEmails(){
        System.out.println(name +" can read my emails");
    }

}
