package org.class27;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class E2Exception {
    public static void main(String[] args) {

        int number1=10;
        int number2=0;
        System.out.println(number1/number2);
        // Break till 11:55

        try {
            FileInputStream fis=new FileInputStream("sbjsd");
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
