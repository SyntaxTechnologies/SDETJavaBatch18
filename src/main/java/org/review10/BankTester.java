package org.review10;

public class BankTester {
    public static void main(String[] args) {

        BankAccount b=new BankAccount(1200,"Username123","Pass123");

        b.setBalance(4500);
        System.out.println(b.getBalance());

    }
}
