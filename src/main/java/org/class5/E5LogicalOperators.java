package org.class5;

public class E5LogicalOperators {
    public static void main(String[] args) {

        boolean is4GAvbl=false;
        boolean isWifiAvbl=false;

        if(isWifiAvbl||is4GAvbl){
            System.out.println("You can browse the internet");
        }else{
            System.out.println("Can't use internet");
        }
    }
}
