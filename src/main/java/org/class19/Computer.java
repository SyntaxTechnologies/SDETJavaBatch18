package org.class19;

public class Computer {
    private String name;
    private int price;
   private int memory;

    public Computer(String name, int price, int memory) {
        this.name = name;
        this.price = price;
        this.memory = memory;
    }
    public void printInfo(){
       System.out.println(name+" "+price+" "+memory);
   }
   public void browseInternet(){
       System.out.println("Open the link");
   }
   public void playVideo(){
       System.out.println("Open the video");
   }
}
class Apple extends Computer{
    public Apple(String name, int price, int memory) {
        super(name, price, memory);
    }
    public void playVideo(){
        System.out.println("Open the video on Apple computer");
    }
}
class Lenovo extends Computer{
    public Lenovo(String name, int price, int memory) {
        super(name, price, memory);
    }
    public void browseInternet(){
        System.out.println("Open the link on Lenovo");
    }
}
class HP extends Computer{
    public HP(String name, int price, int memory) {
        super(name, price, memory);
    }
    public void browseInternet(){
        System.out.println("Open the link on HP");
    }
}
class Dell extends Computer{
    public Dell(String name, int price, int memory) {
        super(name, price, memory);
    }
    public void playVideo(){
        System.out.println("Open the video on Dell computer");
    }
}