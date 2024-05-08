package day240508.practice.p1;

public class Student {
    public static int number;

    public Student() {
        number += 1;
        System.out.println("这是第几个Student: " + number);
    }
}
