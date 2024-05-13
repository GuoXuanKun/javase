package day240513.practice.mysortutil;

public class Dog extends Sortable {
    String name;
    int age;

    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public int compareTo(Sortable sortable) {
        Dog dog = (Dog) sortable;
        if (this.age > dog.age) {
            return 1;
        } else if (this.age < dog.age) {
            return -1;
        } else {
            return 0;
        }
    }
}
