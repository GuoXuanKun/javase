package day240410;

import java.util.Arrays;

/**
 * 冒泡排序
 *   排序算法之一
 *   它比较两个相邻的元素，并决定是否交换它们，直到它们按预期顺序排列
 *   像水中气泡上升到表面的运动过程一样
 * <p>
 * Given an array of N elements, Bubble Sort will:
 * <p>
 * 1. Compare a pair of adjacent items (a, b),
 * 2. Swap that pair if the items are out of order (in this case, when a > b),
 * 3. Repeat Step 1 and 2 until we reach the end of array
 *    (the last pair is the (N-2)-th and (N-1)-th items as we use 0-based indexing),
 * 4. By now, the largest item will be at the last position.
 *    We then reduce N by 1 and repeat Step 1 until we have N = 1.
 * <p>
 * 排序算法
 *   将一串数组（一个列表）中的元素（整数，数字，字符串等）按某种顺序（增大，减小，字典顺序等）重新排列。
 * <a href="https://visualgo.net/zh/sorting?slide=7">sorting</a>
 */
public class BubbleSortTeach {
    public static void main(String[] args) {
        // 待排序的数据
        int[] arr = new int[]{28, 5, 11, 9, 2};

        // 你的代码...

        // step 1
        /*
        // 排序之前先打印出原始数据
        System.out.println("排序之前：" + Arrays.toString(arr));
         */
        System.out.println("排序之前：" + Arrays.toString(arr));

        // step 2
        /*
        // 比较 index=0 和 index=1 的两个数
        // 如果左边大于右边，进行交换（假定按升序进行排序）
        if (arr[0] > arr[1]) {
            int temp = arr[0];
            arr[0] = arr[1];
            arr[1] = temp;
            System.out.println("进行了一次交换的动作：" + Arrays.toString(arr));
        }
         */

        // step 3
        /*
        // 接着比较 index=1 和 index=2 的两个数
        if (arr[1] > arr[2]) {
            int temp = arr[1];
            arr[1] = arr[2];
            arr[2] = temp;
            System.out.println("进行了一次交换的动作：" + Arrays.toString(arr));
        }
         */

        // step 4
        /*
        // DRY - Don't Repeat Yourself
        // "循环" - 是时候登场了
        // 比较 index=0 和 index=1 的两个数
        // 比较 index=1 和 index=2 的两个数
        // 比较 index=2 和 index=3 的两个数
        // 比较 index=3 和 index=4 的两个数
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i+1]) {
                int temp = arr[i];
                arr[i] = arr[i+1];
                arr[i+1] = temp;
                System.out.println("进行了一次交换的动作：" + Arrays.toString(arr));
            }
        }
         */

        // step 5
        /*
        // 小总结，第一轮而已
        // 到目前为止，只是把最大的数移动到了最右边，只是进行了第一轮而已，还得接着比较
         */

        // step 6
        /*
        // 第二轮

        System.out.println("=== === ===");

        // 比较 index=0 和 index=1 的两个数
        // 比较 index=1 和 index=2 的两个数
        // 比较 index=2 和 index=3 的两个数
        // 比较 index=3 和 index=4 的两个数 （❌）
        for (int i = 0; i < arr.length - 1 - 1; i++) {
            if (arr[i] > arr[i+1]) {
                int temp = arr[i];
                arr[i] = arr[i+1];
                arr[i+1] = temp;
                System.out.println("进行了一次交换的动作：" + Arrays.toString(arr));
            }
        }
         */

        // step 7
        /*
        // 第三轮

        System.out.println("=== === ===");

        // 比较 index=0 和 index=1 的两个数
        // 比较 index=1 和 index=2 的两个数
        // 比较 index=2 和 index=3 的两个数 （❌）
        // 比较 index=3 和 index=4 的两个数 （❌）
        for (int i = 0; i < arr.length - 1 - 2; i++) {
            if (arr[i] > arr[i+1]) {
                int temp = arr[i];
                arr[i] = arr[i+1];
                arr[i+1] = temp;
                System.out.println("进行了一次交换的动作：" + Arrays.toString(arr));
            }
        }
         */

        // step 8
        /*
        // 第四轮

        System.out.println("=== === ===");

        // 比较 index=0 和 index=1 的两个数
        // 比较 index=1 和 index=2 的两个数 （❌）
        // 比较 index=2 和 index=3 的两个数 （❌）
        // 比较 index=3 和 index=4 的两个数 （❌）
        for (int i = 0; i < arr.length - 1 - 3; i++) {
            if (arr[i] > arr[i+1]) {
                int temp = arr[i];
                arr[i] = arr[i+1];
                arr[i+1] = temp;
                System.out.println("进行了一次交换的动作：" + Arrays.toString(arr));
            }
        }
         */

        // step 9
        /*
        // 让早该出场的"循环"✨闪亮登场
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < (arr.length - 1) - i; j++) {
                if (arr[j] > arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    System.out.println("进行了一次交换的动作：" + Arrays.toString(arr));
                }
            }
            System.out.println("=== === ===");
        }
         */

        // step 10
        /*
        // 改变待排序的数据，引出可优化的地方
        // 第一轮比对完成，整个数组就已经是有序的了
        arr = new int[]{28, 2, 5, 9, 11};
         */

        // step 11
        /*
        // 优化
        // 优化：增加一个变量，用来标记此轮是否进行了数据交换，如果没有任何交换的动作，可以直接结束外层"轮"的循环
        for (int i = 0; i < arr.length - 1; i++) {
            boolean swapped = false; // <===
            for (int j = 0; j < (arr.length - 1) - i; j++) {
                if (arr[j] > arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    System.out.println("进行了一次交换的动作：" + Arrays.toString(arr));
                    swapped = true; // <===
                }
            }
            if (!swapped) { // <===
                break; // <===
            } // <===
            System.out.println("=== === ===");
        }
         */
    }
}