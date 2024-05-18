package day240515.practice.p2.p2;

public class Teacher implements Comparable<Teacher> {
    String name;
    char firstLetter;
    int age;

    public Teacher(String name, char firstLetter, int age) {
        this.name = name;
        this.firstLetter = firstLetter;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "name='" + name + '\'' +
                ", firstLetter=" + firstLetter +
                ", age=" + age +
                '}';
    }

    @Override
    public int compareTo(Teacher o) {
        return new TeacherFirstLetterComparator().compare(this, o);
    }
}
