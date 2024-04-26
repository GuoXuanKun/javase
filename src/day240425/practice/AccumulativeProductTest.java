package day240425.practice;

import java.util.Scanner;

public class AccumulativeProductTest {
    public static void main(String[] args) {
        AccumulativeProduct accumulativeProduct = new AccumulativeProduct();
        System.out.println("请输入要算阶乘的数");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println(accumulativeProduct.multiply(n));
    }
}
