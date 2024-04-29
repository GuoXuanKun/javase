package day240429.practice.p1_1;

public class Person {
    // 1. state
    String name;

    //
    public Person(String name) {
        this.name = name;
    }

    // 2. behavior
    public void adopt(Cat cat){
        System.out.println(this.name + " 养了一只( " + cat.name + " )");
    }

    public void adopt(Dog dog){
        System.out.println(this.name + " 养了一只( " + dog.name + " )");
    }
}
