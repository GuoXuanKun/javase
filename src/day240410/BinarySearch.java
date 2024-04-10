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
public class BinarySearch {
    public static void main(String[] args) {
        // 数据（有序）
        int[] arr = new int[]{3, 4, 5, 6, 7, 8, 9};
        int target = 8;

        // 算法（二分法查找）
        // 你的代码...

        // 1. 计算数组的长度/2
//        System.out.println(arr.length / 2);

        // 2. 与数组下标为 arr.length/2 进行对比
//        System.out.println(target > arr[arr.length/2]);

        // 3. 分支
//        if (target >= arr[arr.length/2]){
//            // target 要在 arr[(arr.length/2)] -- arr[arr.length-1]里再次折半查找
//
//        }else{
//            // target 要在 arr[0] -- arr[(arr.length/2)] 里再次折半查找
//        }
//1 2 3 4 5 6 7
        // 4. 可能需要头尾指针
        int head = 0;
        int tail = arr.length - 1;
        int middle = (tail - head)/2;
        //哨兵
        int findIt = 0;

        while(head!=tail && head != middle && tail!= middle) {

            if (target > arr[middle]) {
                head = middle  ;
                middle = middle + (tail - head) / 2;
//                System.out.println(head +" " + tail + " " + middle);
            } else if (target < arr[middle]) {
                tail = middle ;
                middle = middle - (tail - head) / 2;
//                System.out.println(head +" " + tail + " " + middle);
            } else if (target == arr[middle]) {
                System.out.println("在 index = " + middle + " 的位置找到了" + "target = " + target);
                findIt = 1;
                break;
            }

        }
        if(findIt==0){
            System.out.println("没找到");
        }
    }
}
