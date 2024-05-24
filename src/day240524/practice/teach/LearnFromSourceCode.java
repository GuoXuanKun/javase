package day240524.practice.teach;

/**
 * 阅读源码的一些收获：
 * 1. “黑盒子+输入/输出”思想
 * 2. 从源码中发现的一些感兴趣/有意思的代码
 */
public class LearnFromSourceCode {
    public static void main(String[] args) {
        System.out.println(Math.max(10, 18));

        int oldCapacity = 8;
        System.out.println(oldCapacity >> 1); // 4
        System.out.println(oldCapacity << 1); // 16
    }
}
