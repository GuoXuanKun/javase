package day240523.practice.me.string_test;

import day240509.practice.p1.Algorithm;

public class StringBufferWay extends Algorithm {
    StringBuffer stringBuffer = new StringBuffer();

    @Override
    public void justDoIt() {
        for (int i = 0; i < 10; i++) {
            stringBuffer.append(i);
        }
    }
}
