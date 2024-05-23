package day240509.practice.p1;

public class MyUtil {
    public static void calculateTime(Algorithm algorithm) {
        // 开始：记录时间点
        long start = System.currentTimeMillis();
        algorithm.justDoIt();
        // 结束：记录时间点
        // 这个算法的运行时间 = 结束时间 - 开始时间
        long end = System.currentTimeMillis();
        System.out.println(end - start);
    }
}
