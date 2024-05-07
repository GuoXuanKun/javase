package day240507.practice.question;

public class Q4 {
    // 写出输出结果
    public static void main(String[] args) {
        int i1 = 1;
        int i2 = 2;
        int i3 = i1++ + ++i2;
        System.out.println(i1); // 2
        System.out.println(i2); // 3
        System.out.println(i3); // 4
    }
}
