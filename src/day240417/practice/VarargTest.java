package day240417.practice;

public class VarargTest {
    public static int add(int a, int b) {
        return a + b;
    }

    public static int add(int a, int b, int c) {
        return a + b + c;
    }

    // 需求3: 你的代码
/*

    // add(int[])' is already defined in 'day240417.practice.VarargTest
    public static int add(int arr[]) {
        int result = 0;
        for (int i = 0; i < arr.length; i++) {
            result += arr[i];
        }
        return result;
    }
*/

    // 需求4: 功能不变，就是需求3的功能。写法上变了
    public static int add(int... numbers){
        // 这些数据传是传进来了，而且支持不确定个数的参数
        // 重点是：我怎么取？
        // 验证方法之二：直接输出这个参数的变量名
        //System.out.println(numbers);
        int result = 0;
        for (int i = 0; i < numbers.length; i++) {
            result += numbers[i];
        }
        return result;
    }

    public static void main(String[] args) {
        // 需求1: 计算两个 int 数之和
        System.out.println(add(1, 2));

        // 需求2: 计算三个 int 数之和
        System.out.println(add(3, 4, 5));

        // 需求3: 计算 n 个 int 数之和。不确定个数，你会怎么写？
//        System.out.println(add(new int[]{1, 2, 3, 4, 5}));

        // 需求4: 功能不变，就是需求3的功能。写法上变了
        System.out.println(add(1, 2, 3, 4));
        System.out.println(add(1, 2, 3, 4, 5));
        System.out.println(add(1, 2, 3, 4, 5, 6));
        System.out.println(add(1, 2, 3, 4, 5, 6, 7));
        System.out.println(add(1, 2, 3, 4, 5, 6, 7, 8));

        // 验证方法之一：可以在外部（main）方法，传一个你猜测的 int... numbers 可能的类型
        System.out.println(add(new int[]{1, 2}));

    }
}