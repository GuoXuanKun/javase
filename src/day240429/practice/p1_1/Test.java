package day240429.practice.p1_1;

public class Test {

    public static void main(String[] args) {
        // 一个人
        Person person = new Person("小美");
        // 一只猫
        Cat cat = new Cat("加菲猫");
        // 一个人养了一只猫
        person.adopt(cat);
    }
}
