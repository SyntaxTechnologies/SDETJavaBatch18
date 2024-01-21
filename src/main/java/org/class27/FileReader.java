package org.class27;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class FileReader {

  static   void readFile() throws FileNotFoundException {
        FileInputStream fileInputStream=new FileInputStream("C:\\Users\\Syntax\\IdeaProjects\\SDETJavaB18\\Files\\Batch18.xlsx");
    }


    public static void main(String[] args)  {
      try{
        readFile();
      }catch (FileNotFoundException f){
          System.out.println("Please check the file path");
      }
    }

}
