package day240515.practice.p2.p2;

public class Test5 {
    public static void main(String[] args) {
        Teacher z = new Teacher("Z老师", 'Z', 19);
        Teacher x = new Teacher("X老师", 'X', 22);
        Teacher b = new Teacher("B老师", 'B', 18);
        Teacher y = new Teacher("Y老师", 'Y', 20);
        Teacher a = new Teacher("A老师", 'A', 21);

        Teacher[] teachers = new Teacher[]{z, x, b, y, a};

        MySortUtil.print(teachers);
        MySortUtil.sort(teachers, new TeacherFirstLetterComparator());
        MySortUtil.sort(teachers);
        MySortUtil.print(teachers);
    }
}