package org.class8;

public class E4Continue {
    public static void main(String[] args) {

        int[] ages={5,3,10,25,45,80,90,60,45,28};
        for (int i = 0; i < ages.length; i++) {

            if(ages[i]>=0 &&ages[i]<=30 || ages[i]>90){
                System.out.println("No discount as per Muahhay go spent full money if you want to buy Harsh!!!");
                continue;
            }
            if(ages[i]>80&& ages[i]<=90){
                System.out.println("80% off for you");
            }else if(ages[i]>70 && ages[i]<=80){
                System.out.println("70% off for you");
            }else if(ages[i]>60 && ages[i]<=70){
                System.out.println("60% off for you");
            }else if(ages[i]>50 && ages[i]<=60){
                System.out.println("50% off for you");
            }else if(ages[i]>40 && ages[i]<=50){
                System.out.println("40% off for you");
            }else if(ages[i]>30 && ages[i]<=40){
                System.out.println("30% off for you");
            }
        }
    }
}
