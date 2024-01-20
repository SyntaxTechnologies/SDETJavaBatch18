package org.class26;

import org.utils.Constants;
import org.utils.ExcelReader;

import java.io.IOException;
import java.util.List;
import java.util.Map;

public class E4ExcelFile {
    public static void main(String[] args) throws IOException {

  List<Map<String,String>> data= ExcelReader.read(Constants.EXCEL_FILE_PATH,"Sheet1");

       // System.out.println(  data.get(1));
      //  System.out.println(  data.get(3).get("FirstName"));
        // Write code to print all the information from this excel use Read method from ExcelReader
     /*   data.forEach(x->x.forEach((k,v)->{
            System.out.println(k+" "+ v);
        }));*/
        data.forEach(x-> System.out.println(x));
//data.forEach(System.out::println);
    }
}
