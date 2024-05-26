package day240526.practice;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentManagementSystem {
    public static void main(String[] args) {
        // 让用户输入基本信息
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入学生学号");
        int studentNumber = scanner.nextInt();
        System.out.println("请输入学生姓名");
        String name = scanner.next();
        System.out.println("请输入学生的年龄");
        int age = scanner.nextInt();
        System.out.println("请输入学生的故乡");
        String hometown = scanner.next();
        Student student = new Student(studentNumber, name, age, hometown);

        // 实例化 ArrayList 并将 Student 实例存进去
        ArrayList<Student> studentList = new ArrayList<>();
        studentList.add(student);

        // 输出 ArrayList
        System.out.println("+------------------+------------+------------+------------+");
        System.out.printf("| %-16s | %-10s | %-10s |%-10s |\n", "student number", "name", "age", "hometown");
        for (int i = 0; i < studentList.size(); i++) {
            System.out.println(studentList.get(i));
        }

        // 查找特定的学生
        System.out.println("输入要查找第几位学生");
        int findIndex = scanner.nextInt() - 1;
        System.out.println(studentList.get(findIndex));

    }
}
