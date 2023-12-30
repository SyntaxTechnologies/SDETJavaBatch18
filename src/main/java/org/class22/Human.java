package org.class22;

public interface Human {
    void walk();
}

interface Person{
    void talk();

}

interface Employee extends Human,Person{
    void work();
}

class SyntaxEmployee implements Employee{

    @Override
    public void walk() {
        System.out.println("Walking .....");
    }

    @Override
    public void talk() {

        System.out.println("Talking....");
    }

    @Override
    public void work() {

        System.out.println("Working...");
    }
}

