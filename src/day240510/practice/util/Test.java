package day240510.practice.util;

public class Test {
    public static void main(String[] args) {
        // 1.做一个可以排序 int[] 的算法类
        MyselfSortUtil.BubbleSort(new int[]{9, 5, 1, 6, 7});

        // 2.做一个可以排序 double[] 的算法类
        double[] student = new double[]{6.2,3.5,7.6,11.8,9.9};
        MyselfSortUtil.BubbleSort(student);

        // 3. 如果要排序的是 对象[] 通过里面的 state 进行比较的话 该这么做?
        // 3.1 创建学生数组
        // 3.2 让学生数组进行比较


    }
}
