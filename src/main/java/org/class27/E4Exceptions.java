package org.class27;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class E4Exceptions {
    public static void main(String[] args)  {

        try {
            FileInputStream fis = new FileInputStream("C:\\Users\\Syntax\\IdeaProjects\\SDETJavaB18\\Files\\Batch18.xlsx");
        }catch (FileNotFoundException fis){
            System.out.println("Please check the file");
        }

    }
}
