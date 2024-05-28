package day240528.practice.teach.exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class OverrideWithExceptionSubclass extends OverrideWithExceptionSuper {
    @Override
    // 子类 Override 的方法，抛出的异常比父类更大，不行
    public void m1() throws IOException {
        FileInputStream fileInputStream = new FileInputStream("config-prod.properties");
    }
}
