package day240523.practice.teach;

import day240509.practice.p1.MyUtil;

public class Test {
    public static void main(String[] args) {
        MyUtil.calculateTime(new StringPlus(10));
        MyUtil.calculateTime(new StringPlus(1000));
        MyUtil.calculateTime(new StringPlus(10000));
        MyUtil.calculateTime(new StringPlus(100000));
    }
}
