package day240402;

public class Test {
    public static void main(String[] args) {
        //总金额
        int total = 10000;

        //抵用券
        double vouchers = 200.3;

        //多少钱
        double howMuch;

        //计算需要支付的金额
        howMuch = total - (((int)(((double)total - vouchers)/400)) *50) - vouchers;
        System.out.println("需要支付的金额为:"+ howMuch);
    }
}
