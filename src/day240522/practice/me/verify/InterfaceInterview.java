package day240522.practice.me.verify;

public class InterfaceInterview {
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
    // Reference to 'size' is ambiguous, both 'B.size' and 'A.size' match
    // 对'size'的引用是模糊的，'B.size'和'A.size'都匹配
    public void m() {
        // 允许存在，只是要通过更精确的方式去访问它
        System.out.println(A.size);
        System.out.println(super.size);
    }
}