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
            //e.printStackTrace();
            System.out.println(e.getMessage());
            // 可以跟 js 的事件关联起来
            //- The term exception is shorthand for the phrase "exceptional event."
            //- > Definition: An exception is an event, which occurs during the execution of a program, that disrupts the normal flow of the program's instructions.
            //- When an error occurs within a method, the method creates an object and hands it off to the runtime system.
            //- The object, called an exception object, contains information about the error, including its type and the state of the program when the error occurred.
            //- Creating an exception object and handing it to the runtime system is called throwing an exception.
        }
    }
}
