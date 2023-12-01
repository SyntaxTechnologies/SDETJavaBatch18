package org.class10;

public class Phone {

    String make;
    String model;
    double price;
    String color;
    void takePics(){
        System.out.println("Use camera to take pics");
    }
    void call(){
        System.out.println("calling.......");
    }
    void playVideos(){
        System.out.println("Playing videos.....");
    }

    public static void main(String[] args) {
        Phone iphone=new Phone();
        iphone.make="Apple";
        iphone.color="White";
        iphone.model="Iphone 15 pro max";
        iphone.price=1200;
        System.out.println(iphone.make);
        System.out.println(iphone.model);
        System.out.println(iphone.price);
        System.out.println(iphone.color);
        iphone.takePics();
        iphone.call();
        iphone.playVideos();

        System.out.println("*************************");

        Phone samsung=new Phone();
        samsung.make="Samsung";
        samsung.model="S23 Ultra";
        samsung.color="Black";
        samsung.price=1000;
        System.out.println(samsung.make);
        System.out.println(samsung.model);
        System.out.println(samsung.color);
        System.out.println(samsung.price);
        samsung.takePics();
        samsung.playVideos();
        samsung.call();


    }

}
