package day240416.practice;

public class XxxTest {
    public static int add(int a, int b) {
        return a + b;
    }

    public static int add(int a, int b, int c) {
        return a + b + c;
    }

    // 需求3: 你的代码
   /* public static int add(int arr[]) {
        int result = 0;
        for (int i = 0; i < arr.length; i++) {
            result += arr[i];
        }
        return result;
    }*/

    public static void main(String[] args) {
        // 需求1: 计算两个 int 数之和
        System.out.println(add(1, 2));

        // 需求2: 计算三个 int 数之和
        System.out.println(add(3, 4, 5));

        // 需求3: 计算 n 个 int 数之和。不确定个数，你会怎么写？
//        System.out.println(add(new int[]{1, 2, 3, 4, 5}));
    }
}