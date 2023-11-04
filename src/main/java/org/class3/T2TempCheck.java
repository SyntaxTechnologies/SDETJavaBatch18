package org.class3;
/*
Create a Java program and name it Temperature Check.
Create a variable to store temperature. Your program should check
if temperature is below 32 then it should print “Water will freeze
with temperature __”, otherwise “Water will NOT freeze with
temperature __”.
 */
public class T2TempCheck {
    public static void main(String[] args) {
        int temp=35;
        if(temp<32){
            System.out.println("Water will freeze with temperature "+temp);
        }else{
            System.out.println("Water will not freeze with temperature "+temp);
        }
    }


}
