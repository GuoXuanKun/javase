package day240522.practice.teacher.string.interview;

public class Q1 {
    public static void main(String[] args) {
        String s1 = new String("xyz");
        String s2 = new String("xyz");
        System.out.println(s1 == s2);
        System.out.println(s1.equals(s2));

        System.out.println("=== === ===");
        Student x = new Student("X", 19);
        Student y = new Student("X", 19);
        System.out.println(x == y);
        System.out.println(x.equals(y));
    }
}

class Student {
    String name;
    int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public boolean equals(Object obj) {
        Student other = (Student) obj;
        return this.age == other.age;
    }
}
