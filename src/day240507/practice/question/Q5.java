package day240507.practice.question;

public class Q5 {
    // 写出下列程序的输出结果
    public static void main(String[] args) {
        short s = 3;
        //s = s + 1; // 这行会报错
        // 原因：此时字面量的 1 默认是 int 类型，所以结果不能用 short 类型的 s 接收
        // 要么强制转换，要么用 int 接
        System.out.println(s);
        // 自己的想法 : 有可能是 数值提升 问题?
    }
}
