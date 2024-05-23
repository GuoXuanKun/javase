package day240523.practice.teach;

import day240509.practice.p1.MyUtil;

public class Test {
    public static void main(String[] args) {
        int[] counts = new int[] {10, 1000, 10000, 100000};
        for (int i = 0; i < counts.length; i++) {
            MyUtil.calculateTime(new StringPlus(counts[i]));
            MyUtil.calculateTime(new StringBufferAppend(counts[i]));
            MyUtil.calculateTime(new StringBuilderAppend(counts[i]));
        }
    }
}
