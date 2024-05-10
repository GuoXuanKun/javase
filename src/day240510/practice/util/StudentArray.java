package day240510.practice.util;



import java.util.Random;

public class StudentArray {
    public static void main(String[] args) {
        // 创建学生数组
        Student[] students = new Student[20];
        Student[] students1 = new Student[20];

        // 学生数组 实例化
        for (int i = 0; i < students.length; i++) {
            students[i] = new Student();
        }

        // 生成学号为1 - 20 的学生
        for (int j = 0; j < students.length; j++) {
            students[j].setNumber(j + 1);
        }
//        // 打印数组
//        for (int i = 0; i < students.length; i++) {
//            System.out.println(students[i].number);
//        }

        // 生成 随机 年级
        Random random = new Random();
        for (int i = 0; i < students.length; i++) {
            students[i].state = random.nextInt(1,7);
        }

        // 生成 随机 分数
        for (int i = 0; i < students.length; i++) {
            students[i].score = random.nextInt(0,101);
        }

        // 对分数进行冒泡排序
        int length = students.length - 1;

        for (int j = 0; j < students.length; j++) {
            for (int i = 0; i < length; i++) {
                if (students[i].score >= students[i+1].score)
                {
                    students1[i] = students[i];
                    students[i] = students[i+1];
                    students[i+1] = students1[i];
                }

            }
            length -= 1;
        }

        //输出数组
        for (int i = 0; i < students.length; i++) {
            System.out.println("学号: " + students[i].number + " 年级: " + students[i].state + " 成绩: " + students[i].score );
        }
    }
}
