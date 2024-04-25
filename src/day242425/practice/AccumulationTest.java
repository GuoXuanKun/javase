package day242425.practice;

public class AccumulationTest {
    public static void main(String[] args) {
        Accumulation accumulation = new Accumulation();
        int n = 100;
        System.out.println(accumulation.sum());
        System.out.println("用递归的方式加: "+ accumulation.sum(n));
    }
}
