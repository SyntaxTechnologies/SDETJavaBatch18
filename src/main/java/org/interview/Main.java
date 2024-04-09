package org.interview;

class Parent{
    String str="parent";
}
public class Main {
    String str="Child";
    Main(){
        String str="Child";
        System.out.println("Print");
    }

    Main(String str){
    this();


    }



    void print(){
        if(10>25)  {
            String str="Java";
            System.out.println(this.str);
        }
    }
    public static void main(String[] args) {






    }


}
