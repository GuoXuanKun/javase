package day240514.practice.p1;

public class TeacherAgeComparator implements MyComparator {
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
