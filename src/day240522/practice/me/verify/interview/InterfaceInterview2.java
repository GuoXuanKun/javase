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

/**
 * *day240522.practice.me.verify.interview.C inherits unrelated defaults for m() from types day240522.practice.me.verify.interview.A and day240522.practice.me.verify.interview.B
 * C从类型 A和 B继承了 m() 的不相关默认值
 */
class C implements A, B {

}