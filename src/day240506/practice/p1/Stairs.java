package day240506.practice.p1;

import java.util.Scanner;

public class Stairs {
    public static void main(String[] args) {
        // 1.获取台阶的阶数
        System.out.println("请输入台阶数");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        // 2.思路 对 1 和 2 进行取余
        if (n % 1 == 0) {
            for (int i = 0; i < n; i++) {
                System.out.print(" 1 ");
            }
            System.out.println();

        }

        if (n % 2 == 0) {
            int temp = n / 2;
            for (int i = 0; i < temp; i++) {
                System.out.print(" 2 ");
            }
            System.out.println();
        }

        if (n % 2 != 0) {
            int temp = n / 2;
            for (int i = 0; i < temp; i++) {
                System.out.print(" 2 ");
            }
            System.out.print(1);
            System.out.println();



        }
        System.out.println("上个方法就会这么多了");

    }


    }
}
