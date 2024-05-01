package day240430.practice.polymorphism;

public class Teacher extends Person{
    int students;

    public void teach() {
        System.out.println("Teacher.teach");
    }

    @Override
    public void eat() {
        System.out.println("Teacher.eat");
    }

    @Override
    public void play() {
        System.out.println("Teacher.play");
    }
}
