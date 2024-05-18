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
        if (this.firstLetter == o.firstLetter) {
            return 0;
        } if (this.firstLetter > o.firstLetter) {
            return 1;
        } else {
            return -1;
        }
    }
}
