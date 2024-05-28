package day240528.practice.me;

public class ExceptionDemo {
    public static void main(String[] args) {
        // java.lang.StackOverflowError
        //stackOverflowError();


        // java.lang.OutOfMemoryError
        //outOfMemoryError();


        System.out.println("=== === ===");


        // java.lang.ArrayIndexOutOfBoundsException
        arrayIndexOutOfBoundsException();


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
    public static void arrayIndexOutOfBoundsException(){
        int[] a = new int[5];
        System.out.println(a[5]);
    };
}
