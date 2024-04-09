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
public class LinearSearchTeachVersion {
    public static void main(String[] args) {
        // 数据
        int[] arr = new int[]{10, 50, 30, 70, 80, 60, 20, 90, 40};
        int target = 20;

        // 你的代码...

        // step 1
        /*
        // 土方法：依次取出数组中的每个元素，挨个跟目标对比
        // 先取出第一个
        int i0 = arr[0];
        if (target == i0) {
            System.out.println("在index=" + 0 + "的位置上找到了" + target);
        }
         */

        // step 2
        /*
        // 土方法：依次取出数组中的每个元素，挨个跟目标对比
        // 再取出第二个
        int i1 = arr[1];
        if (target == i1) {
            System.out.println("在index=" + 1 + "的位置上找到了" + target);
        }
         */

        // step 3
        /*
        // 再取出第三个
        // 当类似的事情重复到第三遍，应该停下来好好思考一下了
        // DRY
        int i2 = arr[2];
        if (target == i2) {
            System.out.println("在index=" + 2 + "的位置上找到了" + target);
        }
         */

        // step 4
        /*
        // 土方法 -> 优化方法
        // 发现规律、DRY
        // 循环是时候出场了
        for (int i = 0; i <= arr.length - 1; i++) {
            if (target == arr[i]) {
                System.out.println("在index=" + i + "的位置上找到了" + target);
            }
        }
         */

        // step 5
        /*
        // 继续优化：优化之前先打印一些额外的语句，看看当前程序会输出几次额外语句
        for (int i = 0; i <= arr.length - 1; i++) {
            if (target == arr[i]) {
                System.out.println("在index=" + i + "的位置上找到了" + target);
            }
            System.out.println("--- --- ---"); // <===
        }
         */

        // step 6
        /*
        // 继续优化：找到之后就不要执行后面的了
        // 额外补充：假设数组内没有重复的元素
        for (int i = 0; i <= arr.length - 1; i++) {
            if (target == arr[i]) {
                System.out.println("在index=" + i + "的位置上找到了" + target);
                break; // <===
            }
            System.out.println("--- --- ---");
        }
         */

        // step 7
        /*
        // 继续优化：处理没找到的情况
        // 同时删除之前额外增加的辅助输出语句
        target = 21; // <===

        boolean notFound = true; // <===

        // 优化方法：发现规律、DRY
        for (int i = 0; i <= arr.length - 1; i++) {
            if (target == arr[i]) {
                System.out.println("在index=" + i + "的位置上找到了" + target);
                notFound = false; // <===
                break;
            }
        }

        if (notFound) { // <===
            System.out.println("没有找到" + target); // <===
        } // <===
         */
    }


}