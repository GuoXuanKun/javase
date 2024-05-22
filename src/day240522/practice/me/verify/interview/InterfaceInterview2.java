package day240522.practice.me.verify.interview;

public class InterfaceInterview2 {
    public static void main(String[] args) {

    }
}

interface A {
    default void m() {
        System.out.println("A.m");
    }
}

interface B {
    default void m() {
        System.out.println("B.m");
    }
}

class C implements A, B {

}