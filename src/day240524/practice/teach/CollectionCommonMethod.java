package day240524.practice.teach;


import java.util.ArrayList;
import java.util.Collection;

public class CollectionCommonMethod {
    public static void main(String[] args) {
        Collection<Integer> cs = new ArrayList<>();
        System.out.println(cs.size());
        System.out.println(cs.isEmpty());
        cs.add(123);
        System.out.println(cs.size());
        System.out.println(cs.isEmpty());

        System.out.println("=== === ===");

        Collection<String> sc = new ArrayList<>();
        sc.add("abc");
        sc.add("qwe");
        sc.add("xyz");

        System.out.println(sc.contains("xyz"));

        System.out.println("--- --- ---");

        Collection<Student> students = new ArrayList<>();
        students.add(new Student("N1", 19));
        students.add(new Student("N2", 20));
        students.add(new Student("N3", 21));
    }
}

// Java Bean
class Student {
    String name;
    int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
