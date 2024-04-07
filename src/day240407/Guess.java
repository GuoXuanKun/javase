package day240407;

import java.util.Random;
import java.util.Scanner;

public class Guess {
    public static void main(String[] args) {
        // 提示信息
        System.out.println("欢迎进入猜数字游戏！");
        System.out.println("请输入一个数字：（范围是0-100）");

        // 生成随机整数（0到100）
        Random random = new Random();
        int randomNumber = random.nextInt(101);
        System.out.println(randomNumber); // 调试阶段，可以把随机数打印出来

        // 准备获取用户的输入
        Scanner scanner = new Scanner(System.in);

        // 限制用户可以猜测的次数
        int count = 5;

        // 循环
        while (count > 0) {
            System.out.println("您有" + count + "次机会！");

            // 提示用户输入数字
            System.out.print("请输入猜的数字：->");
            // 获取用户的输入数字（本次）
            int userInput = scanner.nextInt();

            // 次数递减（重要）
            count--;

            // 比较，分支，判断
            if (randomNumber == userInput) {
                System.out.println("恭喜您，猜对了！");
                count = 0; // 让循环条件不满足，结束循环。也可以用 break 语句，后续再讲。
            } else if (randomNumber > userInput) {
                System.out.println("抱歉, 猜小了！");
            } else {
                System.out.println("抱歉，猜大了！");
            }
        }
        System.out.println("游戏结束！");
    }
}
