package day240409;

/**
 * 问题描述：
 * 已知 array1 和 array2
 * 输出：电话号码
 * 详见：note/array-tel.png
 * <p>
 * 重点：锻炼思考能力，不要直接去搜索答案
 * 如果已经会的同学
 * - 改数组，让最终的答案是你的电话号码
 * - 可能只是靠「经验」，希望大家能达到「能力」的层面
 * - 参考之前「九九乘法表」的完整代码实现过程
 */
public class DisplayPhoneNumberDemo {
    public static void main(String[] args) {
        int[] array1 = new int[]{8, 2, 1, 0, 3};
        int[] array2 = new int[]{2, 0, 3, 2, 4, 0, 1, 3, 2, 3, 3};

        // 你的代码...

        // 1.遍历出数组2的的值
        /*
        int id;
        for (int i = 0; i < 11; i++) {
            id = array2[i];
            System.out.print(id);
        }
        */

        // 2.数组2的值是数组1的下标值
        int id;
        for (int i = 0; i < 11; i++) {
            id = array2[i];
            System.out.print(array1[id]);
        }
    }
}
