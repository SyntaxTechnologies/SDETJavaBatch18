package org.class4;

public class E2NestedIfConditions {
    public static void main(String[] args) {

        double budget=25000;
        String engineType="Petrol";
        if(budget>=50000){

            if(engineType.equals("Electric")){
                System.out.println("I want to Buy a tesla");
            }else if (engineType.equals("Hybrid")){
                System.out.println("I want to buy a Toyota");
            }else{
                System.out.println("I want to Buy a Porche");
            }

        }else if(budget>=30000){

            if(engineType.equals("Electric")){
                System.out.println("i want to Buy BYD");
            }else if(engineType.equals("Hybrid")){
                System.out.println("i want to buy Camry");
            }else{
                System.out.println("hyundai Sonata");
            }

        }else if(budget>=20000){

            if(engineType.equals("Electric")){
                System.out.println("nissan leaf");
            }else if(engineType.equals("Hybrid")){
                System.out.println("Kia");
            }else{
                System.out.println("Honda Civic");
            }
        }else{
            System.out.println("Lets save more");
        }

// Break till 11:50

    }
}
