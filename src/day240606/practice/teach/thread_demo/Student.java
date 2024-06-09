package day240606.practice.teach.thread_demo;

public class Student {
    private static Student instance;

    private Student() {
        System.out.println("验证 new 的时候是否会调用到我");
    }

    public static Student getInstance() {
        if (instance == null) {
            instance = new Student();
        }
        return instance;
    }
}
