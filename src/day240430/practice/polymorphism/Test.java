package day240430.practice.polymorphism;

public class Test {
    public static void main(String[] args) {
/*
        Person person = new Person();
        person.eat();
        person.play();

        System.out.println("===============");

        Student student = new Student();
        student.study();
        student.eat();
        student.play();

        System.out.println("===============");

        Teacher teacher = new Teacher();
        teacher.teach();
        teacher.eat();
        teacher.play();
        */

        Student student = new Student();
        // 你是 JC 身份，主动申请，去当 WD
        Person person = student;
        person.eat();

        // 思考：是否可以通过 person 调用 study 方法
        // Cannot resolve method 'study' in 'Person'
        //person.study();

        // 思考：person 能否赋值回给 Student 类型的 s
        // 恢复 JC 身份
        Student s = (Student) person;
        s.study();


        System.out.println("=== === ===");

        Teacher teacher = new Teacher();
        Person p = teacher;
        // Cannot resolve method 'teach' in 'Person'
        //p.teach();
        Teacher t = (Teacher) p;
        t.teach();
        System.out.println("=== === ===");


        // Student s2 = teacher;
        // Inconvertible types; cannot cast 'Teacher' to 'Student'
        // Student s2 = (Student) teacher;
    }
}
