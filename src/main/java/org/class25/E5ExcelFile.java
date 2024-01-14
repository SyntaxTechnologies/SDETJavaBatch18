package org.class25;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.IOException;

public class E5ExcelFile {
    public static void main(String[] args) throws IOException {
        var path="C:\\Users\\Syntax\\IdeaProjects\\SDETJavaB18\\Files\\Batch18.xlsx";
        var fis=new FileInputStream(path);
        var excel=new XSSFWorkbook(fis);
        var sheet=excel.getSheet("Sheet1");
        int noOfRows=sheet.getPhysicalNumberOfRows();

        for (int i = 0; i < noOfRows; i++) {

            Row row=sheet.getRow(i);

            int noOfCol=row.getPhysicalNumberOfCells();
            for (int j = 0; j < noOfCol; j++) {
                System.out.print(row.getCell(j)+" ");
            }
            System.out.println();
        }

    }
}
