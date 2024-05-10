package day240510.practice.util;

/*
冒泡排序
*/

public class BubbleSort {
    public static void main(String[] args) {
        // 待排序的数据
        int[] arr = new int[]{28, 5, 11, 9, 2};

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
        for (int j = 0; j < arr.length ; j++) {
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
        for(int x = 0; x < arr.length; x++) {
            System.out.print(arr[x] + " ");
        }

    }
}
