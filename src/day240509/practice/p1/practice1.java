package day240509.practice.p1;

public class practice1 {
    public static void main(String[] args) {
        // 开始：记录时间点
        long start = System.nanoTime();
        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            sum += i;
        }
        System.out.println(sum);
        // 结束：记录时间点
        // 这个算法的运行时间 = 结束时间 - 开始时间
        long end = System.nanoTime();
        System.out.println(end - start);
    }
    }

