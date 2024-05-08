package day240508.practice.p2;



public class Test {
    public static void main(String[] args) {
        // 大概想法 : 创造一个类 可以的做到:
        // 1. 记录开始的时间
        // 2. 设置一个 可以将方法传进去的 方法
        // 3. 记录结束的时间
        // 4. 返回结束减开始的时间

        // 将算法导入此类
        BubbleSort bubbleSort = new BubbleSort();

        // 输出算法执行时间
        System.out.println(TimeConsumption.time(bubbleSort));

    }
}
