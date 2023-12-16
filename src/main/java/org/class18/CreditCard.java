package org.class18;

public class CreditCard {

     void calculateInterest(double amount){
       double interest=amount*0.05;
        System.out.println("Interest on "+amount+" is "+interest);
    }
}

class Visa extends CreditCard{
    @Override
 public   void calculateInterest(double amount) {
        double interest=amount*0.07;
        System.out.println("Interest on "+amount+" is "+interest);
    }
}
class AX extends CreditCard{
    @Override
    void calculateInterest(double amount) {
        double interest=amount*0.09;
        System.out.println("Interest on "+amount+" is "+interest);
    }
}
//Break till 1:53

class CreditCardTester{
    public static void main(String[] args) {
        AX ax=new AX();
        ax.calculateInterest(100);
        Visa v=new Visa();
        v.calculateInterest(100);
    }
}