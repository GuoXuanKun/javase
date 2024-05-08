package day240508.practice.p1;

public class Test {
    public static void main(String[] args) {
        // 怎么计算有Student 被 new 了几个?
        // 1. new 的 时候会调用构造器 在构造器里面记个数
        // 2. new 后 能不能统计父类是 Student 的个数

        // 方式1:
        Student student1 = new Student();
        Student student2 = new Student();
        Student student3 = new Student();

        // 方式2:
        System.out.println("方式二暂未想到相关技术进行解决");
    }
}
