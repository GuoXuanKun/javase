package day240526.practice;

import java.util.ArrayList;

public class SMSTest {
    public static void main(String[] args) {
        // 实例化 ArrayList 并将 Student 实例存进去
//        ArrayList<Student> studentList = StudentManagementSystem.joinStudent();

//        // 方便测试用 : 自动 生成 student 并加入 ArrayList<Student> studentList
        ArrayList<Student> studentList = StudentManagementSystem.autoJoinStudentForTest();

//        // 输出 ArrayList
//        StudentManagementSystem.printAllStudent(studentList);
//
//        // 根据学号查找学生
//        StudentManagementSystem.findStudent(studentList);
//
//        // 根据学号更新学生全部信息
//        StudentManagementSystem.updateStudentAll(studentList);
        // 根据学号更新学生信息
        StudentManagementSystem.updateStudentNummer(studentList);
        StudentManagementSystem.printAllStudent(studentList);

        // 根据学号删除学生
        StudentManagementSystem.deleteByStudentNumber(studentList);
        StudentManagementSystem.printAllStudent(studentList);

    }
}
