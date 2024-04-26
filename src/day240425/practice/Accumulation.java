package day240425.practice;

public class Accumulation {

    // 正常循环加
    public int sum() {
        int n = 100;
        int sum = 0;
        for (int i = 1; i < 101; i++) {
            sum += i;
        }
        return sum;
    }

    // 递归的方式加
    public int sum(int a){
        if (a == 1){
            return 1;
        }
        return a + sum(a-1);
    }

}
