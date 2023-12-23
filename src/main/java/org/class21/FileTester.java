package org.class21;

public class FileTester {
    public static void main(String[] args) {
        File[] arr = {new JavaFile("Notepad",15)
                ,new WordFile("Micresoft",10),
                new PdfFile("Pdf",5)};
        for(File f : arr){
            f.open();
            f.edit();
            f.close();
        }
    }
}