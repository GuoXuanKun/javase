package day240523.practice.me.string_test;

import day240509.practice.p1.MyUtil;

public class Test {
    public static void main(String[] args) {

        System.out.println("100000次");
        System.out.println("方式1:+");
        MyUtil.calculateTime( new StringPlusWay());

        System.out.println("方式2:StringBuffer");
        MyUtil.calculateTime(new StringBufferWay());

        System.out.println("方式3:StringBuilder");
        MyUtil.calculateTime(new StringBuilderWay());

    }
}
