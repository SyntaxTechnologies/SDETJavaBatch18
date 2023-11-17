package org.review3;

public class LogicalAnd {

    //for logical && - All condition needs to be true to get a TRUE
    public static void main(String[] args) {

        boolean rain=false;
        boolean cold =true;

        if(cold && rain){
            System.out.println("I am staying home");
        }

        boolean messageDisplayed =true;
        String errorMessage ="Invalid credentials";

        if (messageDisplayed && errorMessage.equals("Invalid Credentials")){
            System.out.println("Test Case passed");
        }else {
            System.out.println("Test Case failed");
        }
    }
}
