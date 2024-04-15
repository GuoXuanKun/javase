package day240415.practice.e1;

import org.w3c.dom.ls.LSOutput;

public class SumTest {
    public static void main(String[] args) {
        int a = 66;
        int b = 666;

        Sum sum = new Sum();
        System.out.println("int :" + sum.add(a,b));

        long a1 = 66L;
        long b1 = 666L;
        System.out.println("long: " + sum.add(a1,b1));

        float a2 = 6.6F;
        float b2 = 6.66F;
        System.out.println("float: " + sum.add(a2,b2));

        double a3 = 6.6;
        double b3 = 6.66;
        System.out.println("double: " + sum.add(a3,b3));

    }



}
