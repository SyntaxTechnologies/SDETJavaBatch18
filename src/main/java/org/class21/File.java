package org.class21;

public abstract class File {

    private String name;
    private int size;

    public File(String name, int size){
        this.name = name;
        this.size = size;
    }
    public abstract void open();
    public void edit(){
        System.out.println("Editing file");
    }
    public void close(){
        System.out.println("Closing file");
    }
}
class JavaFile extends File{


    public JavaFile(String name, int size) {
        super(name, size);
    }
    @Override
    public void open() {
        System.out.println("We need Notepad++ or sublime text to open JavaFile");
    }
}
class WordFile extends File{

    public WordFile(String name, int size) {
        super(name, size);
    }

    @Override
    public void open() {
        System.out.println("We need Microsoft Word to open WorFile");
    }
}
class PdfFile extends File{

    public PdfFile(String name, int size) {
        super(name, size);
    }

    @Override
    public void open() {
        System.out.println("Opening PDF file");
    }
}