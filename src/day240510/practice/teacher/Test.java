package day240510.practice.teacher;

public class Test {
    public static void main(String[] args) {
        // 1. 排序 int[]
        int[] intArr = new int[] {3, 5, 1, 2, 9};
        MySortUtil.sort(intArr);
        MySortUtil.print(intArr);

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
        MySortUtil.print(studentArr);
        MySortUtil.sort(studentArr);
        MySortUtil.print(studentArr);

        // 3. 支持 Dog[]
        Dog[] dogArr = new Dog[size];
        for (int i = 0; i < size; i++) {
            dogArr[i] = new Dog("狗-" + i, 10 - i);
        }
        MySortUtil.print(dogArr);
        MySortUtil.sort(dogArr);
        MySortUtil.print(dogArr);

        // 4. 支持 TV[]
        TV[] tvArr = new TV[size];
        for (int i = 0; i < size; i++) {
            tvArr[i] = new TV("电视-" + i, 1999.99 - i);
        }
        MySortUtil.print(tvArr);
    }
}
