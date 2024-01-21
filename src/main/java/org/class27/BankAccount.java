package org.class27;

public class BankAccount {

    private double funds;
    public BankAccount(double funds){
    this.funds=funds;
    }
    void transferFunds(double amountToTransfer){

        if(amountToTransfer>funds){
            throw new InsufficientFundsException("Not Enough funds in your account");
            //System.out.println("Not Enough funds in your account");
        }else{
            funds=funds-amountToTransfer;
        }
    }
}
