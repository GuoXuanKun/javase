package day240607.practice.teach.before_singleton;

public class Student {
    // 1. state (field, variable)

    // 3. constructor
    private Student() { // public -> private
        System.out.println("验证 new 的时候是否会调用到我");
    }

    // 2. behavior (method, function)
}
