package day240428.practice;

public class Person {

    // state
    String name;
    int age;

    // behavior
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

    // constructor
    public Person() {
        System.out.println(this.toString());
    }

    @Override
    public String toString() {
        return "Person{" +
                "state='" + name + '\'' +
                ", behavior=" + age +
                '}';
    }
}
