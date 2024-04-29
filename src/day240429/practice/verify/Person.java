package day240429.practice.verify;

public class Person {

    // state
    String id;
    String name;
    int age;

    // behavior
    public Person() {
        System.out.println("我来了");
    }

    public Person(String id) {
        this.id = id;
    }

    public Person(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public Person(String id, int age, String name) {
        this.id = id;
        this.age = age;
        this.name = name;
    }

}
