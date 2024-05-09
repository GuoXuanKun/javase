package day240509.practice.p1;

public class MyUtil {
    public static void calculateTime(Sum100 Sum100) {
        // 开始：记录时间点
        long start = System.nanoTime();
        Sum100.justDoIt();
        // 结束：记录时间点
        // 这个算法的运行时间 = 结束时间 - 开始时间
        long end = System.nanoTime();
        System.out.println(end - start);
    }
}
