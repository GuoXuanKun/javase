package day240606.practice.me.singleton_demo_use_enum;

public class SingletonTest {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            System.out.println(Singleton.singleton);
        }
    }
}
