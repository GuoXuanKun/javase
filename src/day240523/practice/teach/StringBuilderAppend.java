package day240523.practice.teach;

import day240509.practice.p1.Algorithm;

public class StringBuilderAppend extends Algorithm {
    int count;

    public StringBuilderAppend(int count) {
        this.count = count;
    }

    @Override
    public void justDoIt() {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < count; i++) {
            stringBuilder.append(i);
        }
    }
}
