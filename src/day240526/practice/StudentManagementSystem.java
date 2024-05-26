package day240526.practice;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentManagementSystem {
    public static void main(String[] args) {
        // 让用户输入基本信息
        Scanner scanner = new Scanner(System.in);
//        System.out.println("请输入学生学号");
//        int studentNumber = scanner.nextInt();
//        System.out.println("请输入学生姓名");
//        String name = scanner.next();
//        System.out.println("请输入学生的年龄");
//        int age = scanner.nextInt();
//        System.out.println("请输入学生的故乡");
//        String hometown = scanner.next();
//        Student student = new Student(studentNumber, name, age, hometown);

        // 实例化 ArrayList 并将 Student 实例存进去
        ArrayList<Student> studentList = new ArrayList<>();
//        studentList.add(student);

        studentList.add(new Student(1,"1",1,"1"));
        studentList.add(new Student(2,"1",1,"1"));
        studentList.add(new Student(3,"1",1,"1"));
        studentList.add(new Student(4,"1",1,"1"));

        // 输出 ArrayList
        printAllStudent(studentList);

//        // 查找特定的学生
//        System.out.println("输入要查找第几位学生");
//        int findIndex = scanner.nextInt() - 1;
//        System.out.println(studentList.get(findIndex));

//        // 根据学号删除学生
//        System.out.println("请输入要删除学生的学号");
//        int index = scanner.nextInt();
//        deleteByStudentNumber(studentList,index);

        // 根据学号更新学生信息
        System.out.println("请输入要更新的学生的学号");
        int old = scanner.nextInt();
        updateStudentAll(studentList,old);
        printAllStudent(studentList);

    }
    // 根据学号删除学生
    public static void deleteByStudentNumber(ArrayList<Student> list,int number){
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getStudentNumber() == number){
                list.remove(i);
                break;
            }
        }
    }
    // 根据学号更新学生
    public static void updateStudentAll(ArrayList<Student> list,int oldNumber){
        int signal = 0;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getStudentNumber() == oldNumber){
                signal = 1;
                Scanner scanner = new Scanner(System.in);
                System.out.println("请输入学生的新学号");
                int a = scanner.nextInt();
                System.out.println("请输入学生的新名字");
                String b = scanner.next();
                System.out.println("请输入学生的新年龄");
                int c = scanner.nextInt();
                System.out.println("请输入学生的新故乡");
                String d = scanner.next();
                list.set(i,new Student(a,b,c,d));
                break;
            }
        }
        if (signal == 0){
            System.out.println("查无此学生");
        }
    }
    // 打印所有学生
    public static void printAllStudent(ArrayList<Student> studentList){
        System.out.println("+------------------+------------+------------+------------+");
        System.out.printf("| %-16s | %-10s | %-10s |%-10s |\n", "student number", "name", "age", "hometown");
        for (int i = 0; i < studentList.size(); i++) {
            System.out.println(studentList.get(i));
        }
    }
}
