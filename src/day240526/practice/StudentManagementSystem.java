package day240526.practice;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentManagementSystem {
    public static void main(String[] args) {
        // 让用户输入基本信息
        Scanner scanner = new Scanner(System.in);
        // 实例化 ArrayList 并将 Student 实例存进去
        ArrayList<Student> studentList = joinStudent();
//        studentList.add(student);

//        studentList.add(new Student(1,"1",1,"1"));
//        studentList.add(new Student(2,"1",1,"1"));
//        studentList.add(new Student(3,"1",1,"1"));
//        studentList.add(new Student(4,"1",1,"1"));

        // 输出 ArrayList
        printAllStudent(studentList);

        // 根据学号查找学生
        findStudent(studentList);
        // 根据学号删除学生
        deleteByStudentNumber(studentList);

        // 根据学号更新学生信息
        updateStudentAll(studentList);
        printAllStudent(studentList);

    }

    // 让用户输入基本信息 并生成一个 ArrayList<Student> 的实例
    public static ArrayList<Student> joinStudent() {
        // 实例化 ArrayList
        ArrayList<Student> studentList = new ArrayList<>();
        // 让用户输入基本信息
        Scanner scanner = new Scanner(System.in);
        System.out.println("要输入几个学生");
        int number = scanner.nextInt();
        for (int i = 0; i < number; i++) {
            System.out.println("请输入第 " + (i + 1) + " 个学生学号");
            int studentNumber = scanner.nextInt();
            System.out.println("请输入第 " + (i + 1) + " 个学生姓名");
            String name = scanner.next();
            System.out.println("请输入第 " + (i + 1) + " 个学生的年龄");
            int age = scanner.nextInt();
            System.out.println("请输入第 " + (i + 1) + " 个学生的故乡");
            String hometown = scanner.next();
            studentList.add(new Student(studentNumber, name, age, hometown));
        }
        return studentList;
    }

    // 根据学号删除学生
    public static void deleteByStudentNumber(ArrayList<Student> list) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入要删除学生的学号");
        int number = scanner.nextInt();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getStudentNumber() == number) {
                list.remove(i);
                break;
            }
        }
    }

    // 根据学号查找学生
    public static void findStudent(ArrayList<Student> list) {
        Scanner scanner = new Scanner(System.in);
        // 查找特定的学生
        System.out.println("输入要查找的学生的学号");
        int findIndex = scanner.nextInt();
        int signal = 0;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getStudentNumber() == findIndex) {
                signal = 1;
                System.out.println(list.get(i));
                break;
            }
        }
        if (signal == 0) {
            System.out.println("查无此学生");
        }
    }

    // 根据学号更新学生
    public static void updateStudentAll(ArrayList<Student> list) {
        Scanner scanner = new Scanner(System.in);
        int signal = 0;
        System.out.println("请输入要更新的学生的学号");
        int oldNumber = scanner.nextInt();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getStudentNumber() == oldNumber) {
                signal = 1;
                System.out.println("请输入学生的新学号");
                int a = scanner.nextInt();
                System.out.println("请输入学生的新名字");
                String b = scanner.next();
                System.out.println("请输入学生的新年龄");
                int c = scanner.nextInt();
                System.out.println("请输入学生的新故乡");
                String d = scanner.next();
                list.set(i, new Student(a, b, c, d));
                break;
            }
        }
        if (signal == 0) {
            System.out.println("查无此学生");
        }
    }

    // 打印所有学生
    public static void printAllStudent(ArrayList<Student> studentList) {
        System.out.println("+------------------+------------+------------+------------+");
        System.out.printf("| %-16s | %-10s | %-10s |%-10s |\n", "student number", "name", "age", "hometown");
        for (int i = 0; i < studentList.size(); i++) {
            System.out.println(studentList.get(i));
        }
    }
}
