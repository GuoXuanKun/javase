package day240515.practice.p1;

import day240514.practice.p1.MyComparator;
import day240514.practice.p1.Teacher;

public class TeacherFirstLetterComparator implements MyComparator {
    @Override
    public int compare(Object o1, Object o2) {
        day240514.practice.p1.Teacher t1 = (day240514.practice.p1.Teacher) o1;
        day240514.practice.p1.Teacher t2 = (Teacher) o2;
        if (t1.firstLetter == t2.firstLetter) {
            return 0;
        } if (t1.firstLetter > t2.firstLetter) {
            return 1;
        } else {
            return -1;
        }
    }
}
