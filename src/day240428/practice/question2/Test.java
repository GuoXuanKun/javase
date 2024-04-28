package day240428.practice.question2;

import java.lang.reflect.Field;

public class Test {
    public static void main(String[] args) {
        Person person = new Person();
        Field[] fields = person.getClass().getFields();
        System.out.println(fields.length);

        for (int i = 0; i < fields.length; i++) {
            Field field = fields[i];
            System.out.println(field);
        }

        // 增强 for 循环
        for (Field field : fields) {
            System.out.println(field);
        }

        System.out.println("=== === ===");

        fields = person.getClass().getDeclaredFields();
        for (Field field : fields) {
            System.out.println(field);
        }
    }
}
