package org.class22;

public class BankAccountTester {
    public static void main(String[] args) {
        BankAccount b=new BankAccount(-3000,"Karimi","trump123");

        System.out.println( b.getBalance());
        b.setBalance(25000);
        System.out.println( b.getBalance());
        // Break till 12:05

    }
}
