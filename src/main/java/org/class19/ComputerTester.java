package org.class19;

public class ComputerTester {
    public static void main(String[] args) {
        Computer [] arr={new Apple("Apple",1000,250)
                ,new Dell("Dell",2000,250),
                new HP("HP",1000,250),
                new Lenovo("Lenovo",1000,250)};
        for (Computer c: arr){
            c.printInfo();
            c.playVideo();
            c.browseInternet();
        }
    }
}