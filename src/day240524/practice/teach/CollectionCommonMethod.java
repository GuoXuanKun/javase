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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
