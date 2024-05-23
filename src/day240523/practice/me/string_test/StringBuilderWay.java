package day240523.practice.me.string_test;

import day240509.practice.p1.Algorithm;

public class StringBuilderWay extends Algorithm {
    StringBuilder stringBuilder = new StringBuilder();
    @Override
    public void justDoIt() {
        for (int i = 0; i < 1000; i++) {
            stringBuilder.append(i);
        }
    }
}
