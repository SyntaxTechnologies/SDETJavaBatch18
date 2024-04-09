package org.interview;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Q20 {
    public static void main(String[] args) {
        String ss = "12abc20xcy20abcd20abcd";
        int sum = sumOfNumbersInString(ss);
        System.out.println("Sum = " + sum);
    }


    public static int sumOfNumbersInString(String str) {
        int sum = 0;
        Pattern pattern = Pattern.compile("\\d+"); // regex to match one or more digits
        Matcher matcher = pattern.matcher(str);


        while (matcher.find()) {
            sum += Integer.parseInt(matcher.group());
        }


        return sum;
    }



}
