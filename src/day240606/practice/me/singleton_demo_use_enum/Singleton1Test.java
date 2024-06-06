package day240606.practice.me.singleton_demo_use_enum;

public class Singleton1Test {
    public static void main(String[] args) {
        Singleton1 singletonOne = Singleton1.SINGLETON_1;
        Singleton1 singletonTwo = Singleton1.SINGLETON_1;
        System.out.println(singletonOne == singletonTwo);

    }
}
