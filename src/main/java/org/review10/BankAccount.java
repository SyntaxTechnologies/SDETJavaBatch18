package org.review10;

public class BankAccount {
    private double balance;
    private String userName;
    private String Password;

  public   BankAccount(double balance, String userName, String password) {
        setUserName(userName);
        setPassword(password);
        setBalance(balance);


    }

  public   void setBalance(double balance) {

        if (balance < 0) {
            System.out.println("Wrong Balance amount");
            this.balance = 0;
        } else {
            this.balance = balance;
        }
    }

    public void setUserName(String userName) {

        if (userName.length() < 4) {
            System.out.println("UserName should be more than 4 characters");
        } else {
            this.userName = userName;
        }
    }

    public  void setPassword(String password) {
        this.Password = password;
    }

    public  void transferFunds(double amountToTransfer) {
        balance = balance - amountToTransfer;
    }

    public double getBalance() {
        return balance;
    }

}


