package day240430.practice.polymorphism;

public class Student extends Person {
    String school;

    public void study()  {
        System.out.println("Student.study");
    }

    @Override
    public void eat() {
        System.out.println("Student.eat");
    }

    @Override
    public void play() {
        System.out.println("Student.play");
    }

}
