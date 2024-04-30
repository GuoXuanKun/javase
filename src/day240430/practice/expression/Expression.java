package day240430.practice.expression;

import java.util.Scanner;

public class Expression {
    public static void main(String[] args) {
        // 每个人对孤独的描述
        Person person = new Person("炫坤", "一种可以很好的面对自己,看清自己的状态");
        Person person1 = new Person("凯龄", "傍晚四五点睡醒，手机没有一条消息");
        Person person2 = new Person("杨浩", "我不孤独");

        // 写出你对这个人的看法
        System.out.println("输出你对 这个人 的看法");
        Scanner scanner = new Scanner(System.in);
        String a = scanner.nextLine();
        person.whatCanISay(a);
    }

}
