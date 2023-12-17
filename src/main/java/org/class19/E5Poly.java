package org.class19;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class E5Poly {

    public static void main(String[] args) throws InterruptedException {


        WebDriver[] arr={new ChromeDriver(),new FirefoxDriver(),new EdgeDriver()};
        for (int i = 0; i < arr.length; i++) {

            WebDriver webDriver=arr[i];
            webDriver.navigate().to("https://amazon.com");
            Thread.sleep(2000);
            webDriver.navigate().to("https://syntaxtechs.com");
            webDriver.navigate().back();
            Thread.sleep(2000);
            webDriver.quit();
        }





    }
}
