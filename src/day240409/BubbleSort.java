package day240409;

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
 * <a href="https://visualgo.net/zh/sorting?slide=1">sorting</a>
 */
public class BubbleSort {
    public static void main(String[] args) {
        // 待排序的数据
        int[] arr = new int[]{28, 5, 11, 9, 2};

        // 你的代码...

        //临时变量
        int temp;
        // 遍历数组的长度
        int length = arr.length - 1;

        // 推出一个最大的
  /*
        for (int i = 0; i < length; i++) {
            if (arr[i] >= arr[i+1])
            {
                temp = arr[i];
                arr[i] = arr[i+1];
                arr[i+1] = temp;
            }
        }
*/

        // 进行按位排序
        for (int j = 0; j < arr.length; j++) {
            for (int i = 0; i < length; i++) {
                if (arr[i] >= arr[i+1])
                {
                    temp = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = temp;
                }

            }
            length -= 1;
        }

        //遍历数组
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

    }
}
