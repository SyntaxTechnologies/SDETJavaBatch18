package org.project2;

/*
Find the First Non-Repeating Character in a String: Given a string,
find and return the first non-repeating character. For example, in the
string "abracadabra", the first non-repeating character is 'c
 */
public class Q9 {
    public static void main(String[] args) {


        String str="abracadabra";

        for (int i = 0; i < str.length(); i++) {
            boolean isRepeating=false;
            for (int j = 0; j <str.length() ; j++) {

                if(i!=j&&str.charAt(i)==str.charAt(j)){
                    isRepeating=true;
                    break;
                }
            }
            if(!isRepeating){
                System.out.println(str.charAt(i));
                break;
            }
        }
    }
}
