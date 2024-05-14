package day240514.practice.p1_del;

import java.util.Comparator;

public class TeacherAgeComparator implements Comparator {
    @Override
    public int compare(Object o1, Object o2) {
        Teacher t1 = (Teacher) o1;
        Teacher t2 = (Teacher) o2;
        if (t1.age == t2.age) {
            return 0;
        } if (t1.age > t2.age) {
            return 1;
        } else {
            return -1;
        }
    }
}