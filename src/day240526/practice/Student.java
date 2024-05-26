package day240526.practice;

public class Student {
    // state
    int studentNumber;
    String  name;
    int age;
    String hometown;

    // constractor

    public Student(int studentNumber, String name, int age, String hometown) {
        this.studentNumber = studentNumber;
        this.name = name;
        this.age = age;
        this.hometown = hometown;
    }

    // behavoir

    @Override
    public String toString() {
        return "Student{" +
                "studentNumber=" + studentNumber +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", hometown='" + hometown + '\'' +
                '}';
    }
}
