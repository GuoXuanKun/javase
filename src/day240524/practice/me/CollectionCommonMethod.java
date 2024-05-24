package day240524.practice.me;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionCommonMethod {
    public static void main(String[] args) {
        Collection<Student> students = new ArrayList<>();
        students.add(new Student("N1", 19));
        students.add(new Student("N2", 20));
        students.add(new Student("N3", 21));
        // 思考:
        //1.为什么这里返回 false
        //2.如何让他返回 true
        System.out.println(students.contains(new Student("N4", 21)));
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
        if (this == obj) {
            return true;
        }
        if(obj instanceof Student student){
            return this.name.equals(student.name) && this.age==student.age;
        }else {
            return false;
        }

    }
}