package day240430.practice.xxx;

public class Student extends Person {
    public Student(String name) {
        this.name = name;
    }

    @Override
    public void describeLonely(String text) {
        System.out.println(text);
    }
}
