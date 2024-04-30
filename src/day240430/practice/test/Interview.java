package day240430.practice.test;

public class Interview {
    public static void main(String[] args) {
        B b = new B();
        new A(b);
    }
}
    class A {
        public A() {
            System.out.println("A");
        }

        public A(B b) {
            this();
            System.out.println("AB");
        }
    }

    class B extends A {
        public B() {
            System.out.println("B");
        }
    }


