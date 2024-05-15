package day240515.practice.p1;

import day240514.practice.p1.MySortUtil;
import day240514.practice.p1.Teacher;

public class Test {
    public static void main(String[] args) {
        day240514.practice.p1.Teacher z = new day240514.practice.p1.Teacher("Z老师", 'Z', 19);
        day240514.practice.p1.Teacher x = new day240514.practice.p1.Teacher("X老师", 'X', 22);
        day240514.practice.p1.Teacher b = new day240514.practice.p1.Teacher("B老师", 'B', 18);
        day240514.practice.p1.Teacher y = new day240514.practice.p1.Teacher("Y老师", 'Y', 20);
        day240514.practice.p1.Teacher a = new day240514.practice.p1.Teacher("A老师", 'A', 21);

        day240514.practice.p1.Teacher[] teachers = new Teacher[] {z, x, b, y, a};

        day240514.practice.p1.MySortUtil.print(teachers);
        day240514.practice.p1.MySortUtil.sort(teachers, new TeacherFirstLetterComparator());
        MySortUtil.print(teachers);
    }
}
