package day240428.practice.question2;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

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

        //  类比刚才打印 getDeclaredFields 的方式，猜测肯定有类似方法打印 Methods
        System.out.println("=== === ===");
        Method[] methods = person.getClass().getDeclaredMethods();
        System.out.println(methods.length);
        for (Method method : methods) {
            System.out.println(method);
        }

        // 类比 getDeclaredFields 的方式,猜测肯定有类似方法打印 constructor
        System.out.println("=== === ===");
        Constructor[] constructors = person.getClass().getDeclaredConstructors();
        System.out.println(constructors.length);
        for (Constructor constructor : constructors) {
            System.out.println(constructor);
        }
    }
}
