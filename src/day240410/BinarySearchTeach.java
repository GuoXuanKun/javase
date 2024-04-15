package day240410;

/**
 * 问题描述
 *   已知数组：int[] arr = new int[]{3, 4, 5, 6, 7, 8, 9};
 *   额外信息：数组元素是有顺序
 *   求：查找8是否在上述数组中出现过？如果出现，输出对应的索引值；否则输出没有找到
 *   额外要求：必须使用二分法查找，以便提升查找效率
 * <p>
 * 预期输出
 *   - 在index=**的位置上找到了**
 *   - 没有找到**
 */
public class BinarySearchTeach {
    public static void main(String[] args) {
        // 数据（有序）
        int[] arr = new int[]{3, 4, 5, 6, 7, 8, 9};
        int target = 8;

        // 算法（二分法查找）
        // 你的代码...

        // step-1
        /*
        // 不急着动手，先分析核心思路：
        // 1. 定义两个额外的变量 low 和 high 来从逻辑上让数组不断减少、让问题规模不断减少
        // 2. 初始：让 low = 0; high = arr.length -1，也就是初始查找整个数组
        // 3. 折半：找到当前的问题规模的中间索引，middle = (low + high) / 2;
        // 4. 查找、判断：当前 middle 索引的值和目标进行匹配。细节：有三种情况（等于、大于、小于）
        // 5. 根据实际情况改变 low 和 high 的值，如何按同样的方法继续折半
        // 6. 什么时候停止？当 low <= high 的时候，也就是让逻辑划分出来的数组要符合逻辑
        //    不急，如果一开始不太确定，也没关系，可以先让它死循环，后续再修正它
         */

        // step-2
        /*
        // 尝试着慢慢写代码实现它
        // 初始 low、high
        int low = 0;
        int high = arr.length - 1;
         */

        // step-3
        /*
        // 第一次折半：计算 middle，商
        int middle = (low + high) / 2;
         */

        // step-5
        /*
        // 接下去就是：重新计算 middle 值、重新获取当前中间值、重新处理对比之后的三种情况
         */

        // step-6
        /*
        // 下一次比对 - 之循环 - 先 while (true)
        // 这个版本的代码会出现死循环，别怕&不急，后续再改进它
        while (true) {
          // ...
          int middle = (low + high) / 2;
        }
         */

        // step-7
        /*
        // 死循环改进之一：找到之后 break;
        if (target == currentValue) { // 情况1：等于
            System.out.println("在index=" + middle + "的位置上找到了" + target);
            break; // <===
        }
         */

        // step-8
        /*
        // 死循环改进之二-1：修改目标值，重现死循环
        // 此版本程序不会停止，同时没任何输出
        target = 1;
         */

        // step-9
        /*
        // 死循环改进之二-2：增加额外输出，辅助分析
        System.out.println("low=" + low + ", high=" + high + ", middle=" + middle); // <=== int middle ... 下方
         */

        // step-10
        /*
        while (true) ===>  while (low <= high)
         */

        // step-11
        /*
        // 完善：处理没找到的情况
        // 尝试着慢慢写代码实现它
        int low = 0;
        int high = arr.length - 1;

        boolean found = false; // 初始 <===

        while (low <= high) {
            int middle = (low + high) / 2;
            System.out.println("low=" + low + ", high=" + high + ", middle=" + middle);
            // 实现上方列出核心思路中的第4步
            // 第4步之获取当前值
            int currentValue = arr[middle];
            // 第4步之对比之后的三种情况
            if (target == currentValue) { // 情况1：等于
                System.out.println("在index=" + middle + "的位置上找到了" + target);
                found = true; // 改变 <===
                break;
            } else if (target > currentValue) { // 情况2：大于
                low = middle + 1;
            } else { // 情况3：小于
                high = middle - 1;
            }
        }

        if (!found) { // <===
            System.out.println("没有找到" + target); // <===
        } // <===
         */
    }
}
