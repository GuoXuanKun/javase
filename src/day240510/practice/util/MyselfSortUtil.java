package day240510.practice.util;

public class MyselfSortUtil {
    //    int[] 冒泡排序
    public static int[] BubbleSort(int[] a) {
        int[] arr = a;

        //临时变量
        int temp;
        // 遍历数组的长度
        int length = arr.length - 1;

        // 进行按位排序
        for (int j = 0; j < arr.length; j++) {
            for (int i = 0; i < length; i++) {
                if (arr[i] >= arr[i + 1]) {
                    temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                }

            }
            length -= 1;
        }
        //遍历数组
        System.out.println("排序结果:");
        for (int x = 0; x < arr.length; x++) {
            System.out.print(arr[x] + " ");
        }
        System.out.println();
        return arr;
    }
}

