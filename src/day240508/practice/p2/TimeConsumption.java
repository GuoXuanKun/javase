package day240508.practice.p2;

public class TimeConsumption {
    // 怎么将算法传进这个这个方法 , 参数类型列表 该放什么?
    // Object 不行, 有什么东西可以收 方法或者类?
    public static long time(Way way){
        // 记录开始时间
        long start = System.nanoTime();
        // 这里放 要计算的算法
            way.way();
        // 记录结束时间
        long end = System.nanoTime();

        return end - start;
    }
}
