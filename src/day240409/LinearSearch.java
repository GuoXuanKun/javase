package day240409;

/**
 * 问题描述
 *   已知数组：int[] arr = new int[]{10, 50, 30, 70, 80, 60, 20, 90, 40};
 *   求：查找20是否在上述数组中出现过？如果出现，输出对应的索引值；否则输出没有找到
 * <p>
 * 预期输出
 *   - 在index=**的位置上找到了**
 *   - 没有找到**
 */
public class LinearSearch {
    public static void main(String[] args) {
        // 数据
        int[] arr = new int[]{10, 50, 30, 70, 80, 60, 20, 90, 40};
        int target = 20;

        // 你的代码...

        // 找到的信号
        int signal = 0;

        // 遍历数组
        for (int i = 0; i < arr.length; i++) {
           // 判断是否相等
            if (arr[i] == target){
                System.out.println("在 index = "+ i + " 的位置上找到了 " + target);
                signal = 1;
            }
        }
        if (signal == 0){
            System.out.println("没有找到");
        }
    }
}
