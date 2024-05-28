package day240528.practice.teach.exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class OverrideWithExceptionSuper {
    public void m1() throws FileNotFoundException {
        FileInputStream fileInputStream = new FileInputStream("config.properties");
    }
}
