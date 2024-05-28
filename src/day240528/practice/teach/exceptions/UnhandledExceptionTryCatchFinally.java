package day240528.practice.teach.exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class UnhandledExceptionTryCatchFinally {
    public static void main(String[] args) {
        m3();
    }

    public static void m1() throws FileNotFoundException {
        FileInputStream fileInputStream = new FileInputStream("config.properties");
    }

    public static void m2() throws FileNotFoundException {
        m1();
    }

    public static void m3() {
        try {
            m2();
        } catch (FileNotFoundException e) {
            // 最简单的处理
            //System.out.println("`config.properties` 文件不存，请确认！");
            // 代码中有 try-catch 的语句，但是里面什么都不做。这是大忌，实际开发中一定不要这么做。
        }
    }
}
