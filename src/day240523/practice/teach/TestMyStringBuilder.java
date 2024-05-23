package day240523.practice.teach;

public class TestMyStringBuilder {
    public static void main(String[] args) {
        MyStringBuilder msb = new MyStringBuilder();
        //msb.append("123");

        // StringBuilder 可能涉及的相关面试题
        // 0. 重点考察有没去阅读过源码，特别是大厂爱问源码
        // 1. 底层是用什么类型存储数据的（>=JDK9 之后有变化）
        // 2. 初始数组长度是多少？
        // 3. 可以自己指定吗？怎么指定？
        // 4. append 的时候超过数组长度，它是怎么处理的？
        // ...
    }
}
