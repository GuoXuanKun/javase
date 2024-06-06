package day240606.practice.me.singleton_demo_use_enum;

public class Singleton {
    public static final Singleton singleton= new Singleton();

    private Singleton() {
        System.out.println("实例化 Singleton");
    }
}
