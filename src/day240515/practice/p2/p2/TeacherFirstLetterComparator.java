package day240515.practice.p2.p2;


public class TeacherFirstLetterComparator implements MyComparator<Teacher> {

    @Override
    public int compare(Teacher o1, Teacher o2) {
        if (o1.firstLetter == o2.firstLetter) {
            return 0;
        } if (o1.firstLetter > o2.firstLetter) {
            return 1;
        } else {
            return -1;
        }
    }
}
