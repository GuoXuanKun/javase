package day240526.practice;

public class Student {
    // state
    int studentNumber;
    String name;
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
        return "+------------------+------------+------------+------------+"
                + System.lineSeparator()
                + String.format("| %-16d | %-10s | %-10d | %-10s |", studentNumber, name, age , hometown)
                + System.lineSeparator()
                + "+------------------+------------+------------+------------+";
    }

    public int getStudentNumber() {
        return studentNumber;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getHometown() {
        return hometown;
    }
}
