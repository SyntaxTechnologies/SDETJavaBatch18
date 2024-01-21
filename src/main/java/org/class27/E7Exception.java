package org.class27;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class E7Exception {
    public static void main(String[] args) {
        FileInputStream fis=null;
        try {
             fis = new FileInputStream("C:\\Users\\Syntax\\IdeaProjects\\SDETJavaB18\\Files\\Batch18.xlsx");
        }catch (FileNotFoundException e){
            System.out.println("Please check the file path");
        }finally {
            try {
                fis.close();
            } catch (IOException e) {
                System.out.println("Error closing the file");
            }
        }
    }
}
