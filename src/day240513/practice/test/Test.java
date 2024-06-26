package day240513.practice.test;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        // 1. 排序 int[]
        int[] intArr = new int[] {3, 5, 1, 2, 9};
        Arrays.sort(intArr);

        // 2. 支持 Student[]
        /*Student s1 = new Student("小芳", 30);
        Student s2 = new Student("小红", 45);
        Student s3 = new Student("小张", 55);
        Student[] studentArr = new Student[] {s1, s2, s3};*/

        int size = 5;
        Student[] studentArr = new Student[size];
        for (int i = 0; i < size; i++) {
            studentArr[i] = new Student("小-" + i, 80 - i);
        }
        System.out.println(Arrays.toString(studentArr));
        Arrays.sort(studentArr);
        System.out.println(Arrays.toString(studentArr));

        // 3. 支持 Dog[]
        Dog[] dogArr = new Dog[size];
        for (int i = 0; i < size; i++) {
            dogArr[i] = new Dog("狗-" + i, 10 - i);
        }
        System.out.println(Arrays.toString(dogArr));
        Arrays.sort(dogArr);
        System.out.println(Arrays.toString(dogArr));

        // 4. 支持 TV[]
        TV[] tvArr = new TV[size];
        for (int i = 0; i < size; i++) {
            tvArr[i] = new TV("电视-" + i, 1999.99 - i);
        }
        System.out.println(Arrays.toString(tvArr));
        Arrays.sort(tvArr);
        System.out.println(Arrays.toString(tvArr));

        // 4. 支持 Xxx[]
        Xxx[] xxxArr = new Xxx[size];
        for (int i = 0; i < size; i++) {
            xxxArr[i] = new Xxx(10 - i);
        }
        System.out.println(Arrays.toString(xxxArr));
        Arrays.sort(xxxArr);
        System.out.println(Arrays.toString(xxxArr));

    }
}
