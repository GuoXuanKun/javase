package day240430.practice.polymorphism;

public class Test {
    public static void main(String[] args) {
        Person person = new Person();
        person.eat();
        person.play();

        Student student = new Student();
        student.study();

        Teacher teacher = new Teacher();
        teacher.teach();
    }
}
