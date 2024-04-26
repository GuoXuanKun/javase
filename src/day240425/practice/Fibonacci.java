package day240425.practice;

public class Fibonacci {
    // 需要思考的点：int 类型够不够用？
    public int f(int n) {
        // 重点：这个方法一定要有出口。
        // 或者说要有出栈的机会，不然就会出现 StackOverflowError
        System.out.println("n=" + n);
        int value;
        if (n == 1 || n == 2) {
            value = 1;
            System.out.println("n=" + n + ", value=" + 1);
            return value;
        }
        value = f(n - 1) + f(n - 2);
        System.out.println("n=" + n + ", value=" + value);
        return value;
    }
}
