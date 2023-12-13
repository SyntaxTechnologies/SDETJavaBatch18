package org.class16;

public class E {
    public static void printF(){
        System.out.println("Hello Batch 18");
    }
}
class F extends E{

}

class ETester{
    public static void main(String[] args) {
        F.printF();
    }
}
