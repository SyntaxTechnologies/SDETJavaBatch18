package org.review2;

public class AnotherNestedIf {

    public static void main(String[] args) {

        boolean isFriday=true;
        int day=13;

        if(isFriday) {

            System.out.println("It is a movie night");

                if(day==13){
                    System.out.println("Let's watch a scary movie");
                }else {
                    System.out.println("Let's watch something funny");
                }

        }else {
            System.out.println("No movies, go back to studies");
        }
    }
}
