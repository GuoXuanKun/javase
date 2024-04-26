package day240426.practice;

public class Test {
    public static void main(String[] args) {
        Person person = new Person();
        Girl girl = new Girl();
        Boy boy = new Boy();

        // boy 自己谁
        System.out.println(boy.getClass().getName());
        // 怎么知道 Boy 的父类是谁
        System.out.println(boy.getClass().getSuperclass().getName());
        // 怎么知道 Person 的父类是谁
        System.out.println(Person.class.getSuperclass());

        System.out.println("----------------------");
        // Object 的父类谁
        System.out.println(Object.class.getSuperclass());


    }
}
