package day240428.practice.question2;

import java.lang.reflect.Field;

public class Test {
    public static void main(String[] args) {
        Person person = new Person();
        Field[] fields = person.getClass().getFields();
        System.out.println(fields.length);
    }
}
