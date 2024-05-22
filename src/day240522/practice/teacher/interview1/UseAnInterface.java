package day240522.practice.teacher.interview1;

public interface UseAnInterface {
    void m1();
}

class A implements UseAnInterface {
    @Override
    public void m1() {
        System.out.println("A.m1");
    }
}

class Test2 {
    public static void main(String[] args) {
        new A().m1();
    }
}
