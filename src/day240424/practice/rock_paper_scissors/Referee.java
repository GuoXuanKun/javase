package day240424.practice.rock_paper_scissors;


//裁判
public class Referee {
    // 1. state(field,Variable)

    // 2. behavior(method,function)
    public static String referee() {
        Player player = new Player();
        Computer computer = new Computer();
        if (player.getAction().equals(computer.getAction0())) {
            return "平局";
        } else if ((player.getAction().equals("Rock") && computer.getAction0().equals("Scissors"))
                || (player.getAction().equals("Paper") && computer.getAction0().equals("Rock"))
                || (player.getAction().equals("Scissors") && computer.getAction0().equals("Paper"))) {
            return "玩家胜出";
        } else {
            return "电脑胜出";
        }
    }
    // 3. constructor

}
