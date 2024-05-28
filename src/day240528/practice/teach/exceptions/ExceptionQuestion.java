package day240528.practice.teach.exceptions;

public class ExceptionQuestion {
    public static void main(String[] args) {
        try {
            m1();
        } catch (Exception e) {
            System.out.println("1");
        }
        System.out.println(m2());
    }

    static void m1() {
        try {
            System.out.println("2");
            throw new RuntimeException("3");
        } finally {
            System.out.println("4");
        }
    }

    static int m2() {
        try {
            System.out.println("5");
            return 1;
        } catch (Exception e) {
            System.out.println("6");
            return 2;
        } finally {
            System.out.println("7");
        }
    }
}
