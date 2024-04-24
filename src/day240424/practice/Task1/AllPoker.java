package day240424.practice.Task1;

public class AllPoker {
    // 1.state (fileds , variable)
    static String[] kind = new String[]{"Spades", "Hearts", "Diamonds", "Clubs"};
    static String[] number = new String[]{"A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"};

    static Poker[] pokers = new Poker[52];

    // 2.behavior (Method , function)
    public static void setAllPoker() {
        for (int k = 0; k < 52; k++) {
            pokers[k] = new Poker();
        }
        for (int i = 0; i < kind.length; i++) {
            System.out.println();
            for (int j = 0; j < number.length; j++) {
                pokers[i * 13 + j].setKind(kind[i]);
                pokers[i * 13 + j].setNumber(number[j]);
                System.out.print("花色: " + pokers[i*13+j].kind + " 点数: " + pokers[i*13+j].number + "     ");
            }
        }

//        for (int k = 0; k < 52; k++) {
//            System.out.println("花色: " + pokers[k].kind + " 点数: " + pokers[k].number + "     ");
//        }
    }


    // 3.constructor

}
