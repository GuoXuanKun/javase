package day240607.practice.teach.before_singleton;

public class Student {
    // 1. state (field, variable)
    // 变量类型 变量名 = 变量值;
    static Student instance;

    // 3. constructor
    private Student() { // public -> private
        System.out.println("验证 new 的时候是否会调用到我");
    }

    // 2. behavior (method, function)
    public static Student getInstance() {
        if (instance == null) {
            instance = new Student();
        }
        return instance;
    }
}
