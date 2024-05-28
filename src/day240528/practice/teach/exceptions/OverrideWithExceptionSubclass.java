package day240528.practice.teach.exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class OverrideWithExceptionSubclass extends OverrideWithExceptionSuper {
    @Override
    public void m1() throws FileNotFoundException {
        FileInputStream fileInputStream = new FileInputStream("config-prod.properties");
    }
}
