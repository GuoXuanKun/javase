package day240510.practice.util;

public class MyselfSortUtil {
    // int[] 冒泡排序
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

    // double[] 冒泡排序
    public static double[] BubbleSort(double[] a) {
        double[] arr = a;

        //临时变量
        double temp;
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

    // Student[] 的冒泡排序
    public static Student[] BubbleSort(Student[] a) {
        Student[] arr = a;

        //临时变量
        Student temp;
        // 遍历数组的长度
        int length = arr.length - 1;

        // 进行按位排序
        for (int j = 0; j < arr.length; j++) {
            for (int i = 0; i < length; i++) {
                if (arr[i].score >= arr[i + 1].score) {
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

    public static All[] BubbleSort(All[] all) {
        for (int i = 0; i < all.length - 1; i++) {
            boolean swapped = false;
            for (int j = 0; j < (all.length - 1) - i; j++) {
                if (all[j].appoint() > all[j + 1].appoint()) {
                    All temp = all[j];
                    all[j] = all[j + 1];
                    all[j + 1] = temp;
                    swapped = true;
                }
            }
            if (!swapped) {
                break;
            }

        }
        return all;
    }
    public static void print(Student[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}


