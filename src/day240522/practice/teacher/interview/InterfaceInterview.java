package day240522.practice.teacher.interview;

public class InterfaceInterview {
    // psvm => 条件反射 -> 经过大脑
    public static void main(String[] args) {

    }
}

interface A {
    public static final int size = 5;
}

class B {
    int size = 6;
}

class C extends B implements A {
    public void m() {
        // sout => 条件反射 -> 经过大脑
        // Reference to 'size' is ambiguous, both 'B.size' and 'A.size' match
        // 允许存在，只是要通过更精确的方式去访问它
        System.out.println(A.size);
        System.out.println(super.size);
    }
}
