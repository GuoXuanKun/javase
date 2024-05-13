package day240513.practice.test;

public class Dog extends Sortable {
    String name;
    int age;

    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
        // 具体的子类中，哪个 state 要参与比较，就把它赋值给从父类基础的那个 xxx
        this.xxx = this.age;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
