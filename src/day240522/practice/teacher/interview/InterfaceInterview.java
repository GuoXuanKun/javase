package day240522.practice.teacher.interview;

public class InterfaceInterview {
    // psvm
    public static void main(String[] args) {

    }
}

interface A {
    int size = 5;
}

class B {
    int size = 6;
}

class C extends B implements A {
    public void m() {
        // sout
        // Reference to 'size' is ambiguous, both 'B.size' and 'A.size' match
        System.out.println(size);
    }
}
