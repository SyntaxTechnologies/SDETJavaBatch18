package org.class3;
/*
Grade Message: Create a Java program with an
integer variable testScore set to a value between
0 and 100. Use if-else statements to print "Pass"
if the score is 50 or above, and "Fail" if it's below 50.
 */
public class T8 {

    public static void main(String[] args) {
        int testScore=90;

        if(testScore>=50){
            System.out.println("Pass");
        }else{
            System.out.println("Fail");
        }
    }
}
