package day240402;

/**
 * 作者:郭炫坤
 * 购物车中有总价10000元的代下单商品<br>
 * <p><br>
 * 问:最理想的情况下,你需要支付多少钱,把购物车中的原价10000元的商品买下
 */
public class Shopping {
    public static void main(String[] args) {
        //不着急写代码
        //写代码之前可以理一理思路

        //先抵扣无门槛抵用卷
        double step1 = 10000 - 200.3;
        System.out.println("step1 = " + step1);

        //计算满减可以用几次
        int step2 = (int)(step1 /400);
        System.out.println("step2" + step2);

        //计算满减的具体金额
        int step3 = step2 * 50;
        System.out.println("step3:" + step3);

        //计算优惠后的金额
        double result = step1 - step3;
        System.out.println(result);

    }
}
