package day240526.practice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Properties;
import java.util.Scanner;
import java.util.Set;

public class SMSTest {
    private static final Scanner scanner = new Scanner(System.in);
    private static ArrayList<Student> studentList = new ArrayList<>();
    private static final Properties STUDENTS_PROPERTIES = new Properties();
    private static final String FILE_NAME = "src/day240526/config.properties";
    public static void main(String[] args) throws IOException {
        // 从文件读取 学生信息
        loadFromFile();

        while (true) {
            System.out.println("--- --- --- --- --- ---");
            System.out.println("请输入操作编号：");
            System.out.println("0. 自动添加添加学生(测试用)");
            System.out.println("1. 添加学生");
            System.out.println("2. 删除学生");
            System.out.println("3. 修改学生信息");
            System.out.println("4. 查询特定学生信息");
            System.out.println("5. 查看所有学生信息");
            System.out.println("6. 退出");
            System.out.println("--- --- --- --- --- ---");

            int choice = scanner.nextInt();

            switch (choice) {
                case 0:
                    // 实例化 ArrayList 并将 Student 实例存进去
                     studentList = StudentManagementSystem.autoJoinStudentForTest();
                    break;
                case 1:
                    // 实例化 ArrayList 并将 Student 实例存进去
                     studentList = StudentManagementSystem.joinStudent();
                    break;
                case 2:
                    // 根据学号删除学生
                    StudentManagementSystem.deleteByStudentNumber(studentList);
                    break;
                case 3:
                    // 根据学号更新学生全部信息
                    StudentManagementSystem.updateStudentAll(studentList);
                    break;
                case 4:
                    // 根据学号查找学生
                    StudentManagementSystem.findStudent(studentList);
                    break;
                case 5:
                    // 输出 ArrayList
                    StudentManagementSystem.printAllStudent(studentList);
                    break;
                case 6:
                    System.out.println("已退出学生管理系统。");
                    /*System.exit(0);
                    break;*/
                    return;
                default:
                    System.out.println("无效的操作编号！");
            }
        }

//        // 实例化 ArrayList 并将 Student 实例存进去
//        ArrayList<Student> studentList = StudentManagementSystem.joinStudent();
//
////        // 方便测试用 : 自动 生成 student 并加入 ArrayList<Student> studentList
////        ArrayList<Student> studentList = StudentManagementSystem.autoJoinStudentForTest();
//
//        // 输出 ArrayList
//        StudentManagementSystem.printAllStudent(studentList);
//
//        // 根据学号查找学生
//        StudentManagementSystem.findStudent(studentList);
//
//        // 根据学号更新学生全部信息
//        StudentManagementSystem.updateStudentAll(studentList);
//        // 根据学号更新学生信息
//        StudentManagementSystem.updateStudentNummer(studentList);
//        // 根据学号更新学生姓名
//        StudentManagementSystem.updateStudentName(studentList);
//        // 根据学号更新学生年龄
//        StudentManagementSystem.updateStudentAge(studentList);
//        // 根据学生学号更新学生家乡(学生故乡)
//        StudentManagementSystem.updateStudentHometown(studentList);
//        StudentManagementSystem.printAllStudent(studentList);
//
//        // 根据学号删除学生
//        StudentManagementSystem.deleteByStudentNumber(studentList);
//        StudentManagementSystem.printAllStudent(studentList);

    }
    private static void loadFromFile() throws IOException {
        // Properties类的load()方法用于从输入流中读取属性列表（键和元素对）。它通常用于加载那些以键值对格式存储在文件中的配置数据。
        STUDENTS_PROPERTIES.load(new FileInputStream(FILE_NAME));
        // 获取 键值
        Set<Object> objects = STUDENTS_PROPERTIES.keySet();
        // 根据 键值 依次获取 元素值
        for (Object next : objects) {
            String name = (String) next;
            String studentString = STUDENTS_PROPERTIES.getProperty(name);
            String[] split = studentString.split(",");
            studentList.add(new Student(Integer.parseInt(split[0]), split[1],Integer.parseInt(split[2]),split[3]));
        }
    }

}
