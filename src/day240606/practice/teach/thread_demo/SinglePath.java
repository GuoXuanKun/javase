package day240606.practice.teach.thread_demo;

public class SinglePath {
    public static void main(String[] args) {
        m1();
        System.out.println("T.main");
    }

    public static void m1() {
        m2();
        System.out.println("T.m1");
    }

    public static void m2() {
        m3();
        System.out.println("T.m2");
    }

    public static void m3() {
        System.out.println("T.m3");
    }
}
