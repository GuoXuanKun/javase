package day240507.practice.question;

public class Q8 {
    // 8. 写代码输出 100 以内的所有质数
    public static void main(String[] args) {
        int signal = 0;

        for (int i = 2; i <= 100; i++) {
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    signal = 1;
                    break;
                }
            }

            if (signal == 0) {
                System.out.println(i);
            }
            signal = 0;
        }
    }
}
