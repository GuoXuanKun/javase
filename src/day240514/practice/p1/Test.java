package day240514.practice.p1;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        Teacher j = new Teacher("江老师", 'J', 21);
        Teacher g = new Teacher("郭老师", 'G', 18);
        Teacher y = new Teacher("叶老师", 'Y', 22);
        Teacher l = new Teacher("李老师", 'L', 20);
        Teacher z = new Teacher("张老师", 'Z', 19);

        Teacher[] teachers = new Teacher[] {j, g, l, y, z};

        MySortUtil.print(teachers);
        MySortUtil.sort(teachers);
        MySortUtil.print(teachers);
    }
}
