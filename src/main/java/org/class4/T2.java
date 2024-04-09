package org.class4;

public class T2 {

    public static void main(String[] args) {
        int num1=200,num2=400,num3=100;

        if(num1>num2){

            if(num1>num3){
                System.out.println("Num1 is largest "+num1);
            }else{
                System.out.println("Num3 is largest "+num3);
            }

        }else{
            if(num2>num3){
                System.out.println("Num2 is largest "+num2);
            }else{
                System.out.println("Num3 is largest "+num3);
            }
        }
    }
}
