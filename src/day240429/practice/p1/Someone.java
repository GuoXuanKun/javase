package day240429.practice.p1;

import day240428.practice.question.Person;

public class Someone extends Person {

    // 1. state
    Cat cat;

    // 2. behavior
    // 养猫
    public void raiseCat() {
        cat = new Cat("加菲猫", 3);

    }

    public Someone(String name, int age) {
        this.raiseCat();
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Someone :" +
                "  name='" + name + '\'' +
                ", age=" + age +
                "  养的 cat 的种类 " + cat.Kind +" 年龄: "+ cat.age
                ;
    }
}
