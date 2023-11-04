package org.class3;

/*
Basic Fare Calculator: Declare an integer variable
age and set it to any value. Use if-else statements
to determine a basic bus fare price: if the age is less
than 13, the fare is $2; if the age is 13 or more, the
fare is $5.
 */
public class T7 {
    public static void main(String[] args) {
        int age=34;

        if(age<13){
            System.out.println("The fare is $2");
        }else{
            System.out.println("The fare is $5");
        }
    }
}
