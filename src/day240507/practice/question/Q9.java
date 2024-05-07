package day240507.practice.question;

/*
自己还没做
- 已知：在编程竞赛中，有 10 位评委为参赛的选手打分，分数分别为：[5, 4, 6, 8, 9, 0, 1, 2, 7, 3]
- 求：选手的最后得分
- 算法要求：去掉一个最高分和一个最低分后，计算其余 8 位评委打分的平均值
*/
public class Q9 {
    public static void main(String[] args) {
        int[] scores = {5, 4, 6, 8, 9, 0, 1, 2, 7, 3};
        // 声明三个特征值
        int sum = 0;
        int max = scores[0];
        int min = scores[0];

        for (int i = 0; i < scores.length; i++) {
            sum += scores[i]; //累加总分
            //用于获取最高分
            if (max < scores[i]) {
                max = scores[i];
            }
            //用于获取最低分
            if (min > scores[i]) {
                min = scores[i];
            }
        }

        int avg = (sum - max - min) / (scores.length - 2);
        System.out.println("去掉最高分和最低分之后，平均分为：" + avg);
        // 思路
        /*
        - 总和、最大值、最小值
        - (总和 - 最大值 - 最小值) / (人数 - 2)
         */
    }
}
