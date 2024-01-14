package org.class25;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.IOException;

public class E4ExcelFile {
    public static void main(String[] args) throws IOException {
        //Location of the file
        String path="C:\\Users\\Syntax\\IdeaProjects\\SDETJavaB18\\Files\\Batch18.xlsx";
      //Navigating to the file
        FileInputStream fis=new FileInputStream(path);
        //This is that special class that we need to handle excel files.
        XSSFWorkbook excel=new XSSFWorkbook(fis);
        //To access the sheet from that file.
        Sheet sheet=excel.getSheet("Sheet1");
        // Accessing the rows from the above sheet
        Row row1=sheet.getRow(1);
        // Accessing the columns from above rows
        Cell cell1=row1.getCell(1);
        System.out.println(cell1);

        // Break till 1:50



    }
}
