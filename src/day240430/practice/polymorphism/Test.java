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
        Person person = student;
        person.eat();

        // 思考：是否可以通过 person 调用 study 方法
        // Cannot resolve method 'study' in 'Person'
        //person.study();
    }
}
