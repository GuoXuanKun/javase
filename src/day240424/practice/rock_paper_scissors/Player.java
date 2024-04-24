package day240424.practice.rock_paper_scissors;

import java.util.Scanner;

public class Player {
    // 1. state(fields , Variable)
    String action;

    // 2. behavior(method , function)
    public String getAction() {
        return action;
    }

    // 3. constructor
    public Player(){
        System.out.println("请玩家出招: ");
        Scanner scanner = new Scanner(System.in);
        action = scanner.nextLine();
        while (true) {
            if (action.equals("Rock") || action.equals("Paper")  || action.equals("Scissors")) {
                System.out.println("玩家出: " + action);
                break;
            } else {
                System.out.println("玩家输入错误,请重新输入");
                action = scanner.next();
            }
        }
    }

}
