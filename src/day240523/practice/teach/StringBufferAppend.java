package day240523.practice.teach;

import day240509.practice.p1.Algorithm;

public class StringBufferAppend extends Algorithm {
    int count;

    public StringBufferAppend(int count) {
        this.count = count;
    }

    @Override
    public void justDoIt() {
        StringBuffer stringBuffer = new StringBuffer();
        for (int i = 0; i < count; i++) {
            stringBuffer.append(i);
        }
    }
}
