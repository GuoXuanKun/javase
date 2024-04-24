package day240424.practice;

import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {
    public static void main(String[] args) {
        String user = "";
        int id = 0;
        String[] computer = new String[]{"Rock", "Paper", "Scissors"};

        // 获取用户的出招
        System.out.println("请玩家出招: ");
        Scanner scanner = new Scanner(System.in);
        user = scanner.nextLine();
        while (true) {
            if (user.equals("Rock") || user.equals("Paper")  || user.equals("Scissors")) {
                System.out.println("玩家出: " + user);
                break;
            } else {
                System.out.println("玩家输入错误,请重新输入");
                user = scanner.next();
            }
        }


        // 获取电脑的出招
        Random random = new Random();
        id = random.nextInt(0, 2);
        System.out.println("电脑出: "+computer[id]);

        // 进行判定胜负
        if (user == computer[id]) {
            System.out.println("平局");
        } else if ((user.equals("Rock") && computer[id].equals("Scissors"))
                || (user.equals("Paper")  && computer[id].equals("Rock"))
                || (user.equals("Scissors")  && computer[id].equals("Paper"))) {
            System.out.println("玩家胜出");
        } else {
            System.out.println("电脑胜出");
        }

    }
}
