package day240523.practice.me.stringReplace;

import java.util.Arrays;
import java.util.Scanner;

public class StringReplaceTest {
    public static void main(String[] args) {
        // 接受用户输入
        System.out.println("请输入号码");
        String tel = new Scanner(System.in).nextLine();
        // 对 4 - 8 位的 数字进行替换
        // 方法1:
        char[] telArray = tel.toCharArray();
        for (int i = 3; i < 8; i++) {
            telArray[i] = '*';
        }
        System.out.println("输出号码: " + new String(telArray));


    }
}
