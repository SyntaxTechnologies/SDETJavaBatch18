package org.utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Test {
    public static String read(String key,String path)  {

        Properties properties=new Properties();
        FileInputStream fis=null;

        try {
            fis=new FileInputStream(path);
            properties.load(fis);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return properties.getProperty(key);

    }
}
