package day240425.practice;

public class AccumulativeProduct {
    public int multiply(int n) {
        if (n == 1) {
            return n;
        }
        return n * multiply(n - 1);
    }
}
