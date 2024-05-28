package day240528.practice.teach.exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class UnhandledExceptionThrows {
    public static void main(String[] args) throws FileNotFoundException {
        m3();
    }

    public static void m1() throws FileNotFoundException {
        FileInputStream fileInputStream = new FileInputStream("config.properties");
    }

    public static void m2() throws FileNotFoundException {
        m1();
    }

    public static void m3() throws FileNotFoundException {
        m2();
    }
}
