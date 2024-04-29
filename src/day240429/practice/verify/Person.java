package day240429.practice.verify;

public class Person {

    // state
    String id;
    String name;
    int age;

    // behavior

    // 此时，如果把 Person 的空参构造器注释，会报错。
    // If the super class does not have a no-argument constructor,
    // you will get a compile-time error.
    public Person() {
        System.out.println("我来了");
    }

    public Person(String id) {
        System.out.println("String id");
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
