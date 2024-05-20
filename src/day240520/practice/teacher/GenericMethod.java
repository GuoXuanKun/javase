package day240520.practice.teacher;

public class GenericMethod {
    public <T> void m1(T t) {
        System.out.println(t);
    }

    public static void main(String[] args) {
        GenericMethod gm = new GenericMethod();
        gm.m1(89);
        gm.m1("string");
    }
}
