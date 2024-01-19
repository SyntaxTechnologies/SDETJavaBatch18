package org.review11;

import org.utils.ConfigReader;

import java.io.IOException;

public class E6Files {
    public static void main(String[] args) throws IOException {

        String browser=  ConfigReader.read("browser");
        System.out.println(browser);


    }
}
