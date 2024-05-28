package day240528.practice.teach.exceptions;

import java.util.Scanner;

public class ExceptionThrow {
    public static void main(String[] args) {
        m1();
    }

    public static void m1() {
        Scanner scanner = new Scanner(System.in);
        // NumberFormatException 是运行时异常，不主动处理也能编译通过，只是运行的时候可能会报错
        // 对于这种 `运行时异常`，我们也可以主动处理它
        try {
            Integer.parseInt(scanner.next());
        } catch (NumberFormatException e) {
            throw new MyNumberFormatException("错误编号50008：请输入正整数，我要拿来干什么。。。");
        }
    }
}
