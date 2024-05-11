package day240510.practice.teacher;

public class Test {
    public static void main(String[] args) {
        // 1. 排序 int[]
        int[] intArr = new int[] {3, 5, 1, 2, 9};
        MySortUtil.sort(intArr);
        MySortUtil.print(intArr);

        // 2. 支持 Student[]
        Student s1 = new Student("小芳", 30);
        Student s2 = new Student("小红", 45);
        Student s3 = new Student("小张", 55);
        Student[] studentArr = new Student[] {s1, s2, s3};

    }
}
