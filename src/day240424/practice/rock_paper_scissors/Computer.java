package day240424.practice.rock_paper_scissors;

import java.util.Random;

public class Computer {
    // 1.state(fields , function)
    String[] action = new String[]{"Rock", "Paper", "Scissors"};
    String action0;

    // 2.behavior(method,function)
    public String getAction0() {
        return action0;
    }

    // 3.constructor
    public Computer() {
        Random random = new Random();
        action0 = action[random.nextInt(0, 2)];
        System.out.println("电脑出: " + action0);
    }

}
