package day240528.practice.teach.exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class OverrideWithExceptionSuper {
    public void m1() throws IOException {
        FileInputStream fileInputStream = new FileInputStream("config.properties");
    }
}
