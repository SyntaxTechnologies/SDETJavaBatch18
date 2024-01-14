package org.class25;

import org.utils.ConfigReader;

import java.io.IOException;

public class E2FileHandling {
    public static void main(String[] args) throws IOException {

      String value= ConfigReader.read("browser");
        System.out.println(value);
        // Break till 11:53
    }
}
