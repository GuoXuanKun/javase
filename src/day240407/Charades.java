package day240407;

import java.util.Random;
import java.util.Scanner;

public class Charades {
    public static void main(String[] args) {

        // 1.生成随机数
        Random random = new Random();
        //限制随机数范围
        int randomNumber = random.nextInt(101);
        System.out.println("欢迎进入猜数字游戏");
        System.out.println("请输入一个数字: (范围0-100)");
        System.out.println("您有五次机会");


        // 2.限制猜字次数

        /*
        for (int i = 0; i < 5; i++) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
            //number == randomNumber
        }
        */

        // 3.分支结构 设置提醒
        for (int i = 0; i < 5; i++) {
            System.out.println("请输入猜的数字 ->");
            Scanner scanner = new Scanner(System.in);
            int number = scanner.nextInt();
            if(number == randomNumber){
                System.out.println("恭喜你,答对了,但是并没有奖励");
                break;
            } else if (number < randomNumber) {
                System.out.println("小了");

            } else{
                System.out.println("大了");
            }

            if(i != 4){
                System.out.println("您还有"+ (5-(i+1))+"次机会");
            }
        }
        System.out.println("游戏结束 "+"正确答案为"+ randomNumber);
    }
}
