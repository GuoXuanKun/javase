package day240528.practice.teach.exceptions;

import java.util.Scanner;

/**
 * Java 代码中的例外处理
 * <p>
 * 尽善尽美，不易
 * 例外，常有
 */
@SuppressWarnings({"all"})
public class ExceptionDemo {
    public static void main(String[] args) {
        // java.lang.StackOverflowError
        //stackOverflowError();


        // java.lang.OutOfMemoryError
        //outOfMemoryError();


        System.out.println("=== === ===");


        // java.lang.ArrayIndexOutOfBoundsException
        //arrayIndexOutOfBoundsException();


        // java.lang.NumberFormatException
        //numberFormatException();


        // java.lang.ArithmeticException: / by zero
        //arithmeticException();


        // java.lang.NullPointerException
        //nullPointerException();


        System.out.println("=== === ===");


        // java.io.FileNotFoundException
        //fileNotFoundException();


        // java.io.IOException
        //ioException();
    }

    private static void nullPointerException() {
        int[][] xx = new int[2][];
        xx[0][0] = 1;

        /*String s = null;
        System.out.println(s.length());*/
    }

    private static void stackOverflowError() {
        // Git -> Log -> Filter by Commit Message or Hashes
    }

    private static void outOfMemoryError() {
        String[] integers = new String[1024 * 1024 * 1024];
    }

    private static void arrayIndexOutOfBoundsException() {
        int[] is = new int[] {1, 2, 3};
        System.out.println(is[3]);
    }

    private static void numberFormatException() {
        Scanner scanner = new Scanner(System.in);
        Integer.parseInt(scanner.next());
    }

    private static void arithmeticException() {
        int i = 3 / 0;
    }

    private static void fileNotFoundException() {
        //FileInputStream fileInputStream = new FileInputStream("config.properties");
        //checked exception 编译时异常 vs 运行时异常 unchecked exception (RuntimeException)
        //structure
    }

    private static void ioException() {
        //Properties properties = new Properties();
        //properties.load(new FileInputStream("config.properties"));
    }
}
