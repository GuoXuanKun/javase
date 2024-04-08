package day240408;

import java.util.Random;

public class RandomSelector {
    public static void main(String[] args) {
        //班级数组
        String[] class8 = new String[]{"0","1","2","3","4","5","6","7","8","9","10","11","12"};

        //生成随机数
        Random random = new Random();
        int randoNumber = random.nextInt(12);

        System.out.println("随机生成的同学为: "+ class8[randoNumber]);
    }
}
