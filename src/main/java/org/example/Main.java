package org.example;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class Main {
    public static void main(String[] args) throws IOException {
        System.out.println("Hello world!");
        InputStream in =  	Main.class.getClassLoader().getResourceAsStream("jdbc.properties");
        Properties ps = new Properties();
        ps.load(in);
        String student = ps.getProperty("jdbc.driver");
        System.out.println(student);

    }
}