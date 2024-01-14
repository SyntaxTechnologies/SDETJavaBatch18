package org.class25;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class E8ExcelFile {
    public static void main(String[] args) throws IOException {
        var path = "C:\\Users\\Syntax\\IdeaProjects\\SDETJavaB18\\Files\\Batch18.xlsx";
        var fis = new FileInputStream(path);
        var excel = new XSSFWorkbook(fis);
        var sheet = excel.getSheet("Sheet1");
        int noOfRows = sheet.getPhysicalNumberOfRows();

        List<Map<String, String>> excelData = new ArrayList<>();

        Row header = sheet.getRow(0);
        for (int i = 1; i < noOfRows; i++) {

            Row row = sheet.getRow(i);
            Map<String, String> rowData = new LinkedHashMap<>();
            int noOfCol = row.getPhysicalNumberOfCells();
            for (int j = 0; j < noOfCol; j++) {
                String key = header.getCell(j).toString();
                String value = row.getCell(j).toString();
                rowData.put(key, value);
            }
         excelData.add(rowData);
        }
        System.out.println(excelData);
    }
}