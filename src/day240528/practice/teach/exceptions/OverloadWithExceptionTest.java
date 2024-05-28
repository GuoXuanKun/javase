package day240528.practice.teach.exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class OverloadWithExceptionTest {
    public void m1(int i) {
        //
    }

    public void m1(long l) {
        //
    }

    public void m2() throws FileNotFoundException {
        FileInputStream fileInputStream = new FileInputStream("config.properties");
    }

    // 'm2()' is already defined in 'xxx'
    // Overload 的判断只跟 method signature -- the method's name and the parameter types
    //public void m2() {}
}
