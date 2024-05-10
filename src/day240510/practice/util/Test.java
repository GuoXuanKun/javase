package day240510.practice.util;

import day240510.practice.util.Student;

import java.util.Random;

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
        // 将 算法整合进 MyselfSortUtil 以下是思路 :
        int size = 5;
        Random random = new Random();

        Student[] students = new Student[size];
        for (int i = 0; i < size; i++) {
            students[i] = new Student( i, random.nextInt(1,6), random.nextInt(0,100) );
        }
        MyselfSortUtil.BubbleSort(students);

    }
}
