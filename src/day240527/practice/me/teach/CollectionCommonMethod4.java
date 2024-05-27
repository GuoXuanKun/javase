package day240527.practice.me.teach;


import day240514.practice.p1_del.Teacher;
import day240514.practice.p1_del.TeacherFirstLetterComparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionCommonMethod4 {
    public static void main(String[] args) {
        List<Teacher> teachers = new ArrayList<>();
        teachers.add(new Teacher("Z老师", 'Z', 19));
        teachers.add(new Teacher("X老师", 'X', 22));
        teachers.add(new Teacher("B老师", 'B', 18));
        teachers.add(new Teacher("Y老师", 'Y', 20));
        teachers.add(new Teacher("A老师", 'A', 21));

        System.out.println(teachers);

        // sort()
        // 根据指定比较器诱导的顺序对此列表进行排序。排序是稳定的:此方法不能对相等的元素重新排序。
        teachers.sort(new TeacherFirstLetterComparator());
        System.out.println(teachers);

        // Collections.shuffle()
        // 使用默认的随机源随机排列指定的列表。所有排列发生的可能性大致相等。
        Collections.shuffle(teachers);
        System.out.println(teachers);
    }
}
