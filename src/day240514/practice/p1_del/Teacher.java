package day240514.practice.p1_del;

public class Teacher {
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
}
