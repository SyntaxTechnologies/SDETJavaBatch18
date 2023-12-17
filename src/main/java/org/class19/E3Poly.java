package org.class19;

import org.openqa.selenium.edge.EdgeDriver;

public class E3Poly {
    public static void main(String[] args) throws InterruptedException {

       /* ChromeDriver chromeDriver=new ChromeDriver();
        chromeDriver.navigate().to("https://amazon.com");
        Thread.sleep(2000);
        System.out.println( chromeDriver.getTitle());
        chromeDriver.close();*/

        /*FirefoxDriver f=new FirefoxDriver();
        f.get("https://amazon.com");
        f.close();*/

        EdgeDriver edgeDriver=new EdgeDriver();
        edgeDriver.get("https://amazon.com");
        edgeDriver.close();


    }
}
