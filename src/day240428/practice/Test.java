package day240428.practice;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class Test {
    public static void main(String[] args) {

        Person person = new Person();

        Method[] methods = person.getClass().getDeclaredMethods();
        for (Method method : methods){
            System.out.println(method);
        }

        Constructor[] constructors = person.getClass().getDeclaredConstructors();
        for (Constructor constructor : constructors){
            System.out.println(constructor);
        }

    }
}
