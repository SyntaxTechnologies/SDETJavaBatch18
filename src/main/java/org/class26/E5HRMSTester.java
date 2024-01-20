package org.class26;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.utils.ConfigReader;
import org.utils.ExcelReader;

import java.io.IOException;
import java.util.List;
import java.util.Map;

public class E5HRMSTester {
    public static void main(String[] args) throws IOException {
        String path="C:\\Users\\Syntax\\IdeaProjects\\JavaSdetBatch17\\Files\\HRMSTestData.xlsx";
        String sheetName="Sheet1";
        List<Map<String,String>> testData= ExcelReader.read(path,sheetName);
        System.out.println(testData);
        //Break till 1:45

        String url= ConfigReader.read("url");
        String userName=ConfigReader.read("userName");
        String password=ConfigReader.read("password");
        WebDriver webDriver=new ChromeDriver();
        webDriver.manage().window().maximize();
        webDriver.get(url);
        WebElement userNameWE=webDriver.findElement(By.xpath("//input[@id='txtUsername']"));
        WebElement passwordWE=webDriver.findElement(By.xpath("//input[@id='txtPassword']"));
        WebElement enterBtn=webDriver.findElement(By.xpath("//input[@id='btnLogin']"));
        userNameWE.sendKeys(userName);
        passwordWE.sendKeys(password);
        enterBtn.click();



    }
}
