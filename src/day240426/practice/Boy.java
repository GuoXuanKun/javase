package day240426.practice;

public class Boy extends Person{

    // 3. constructor
    public Boy() {
    }

    @Override
    public String toString() {
        return "Boy{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public void eat() {
        System.out.println("Boy 吃");
    }
}
