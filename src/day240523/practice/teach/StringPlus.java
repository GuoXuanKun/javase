package day240523.practice.teach;

import day240509.practice.p1.Algorithm;

@SuppressWarnings({"all"})
public class StringPlus extends Algorithm {
    int count;

    public StringPlus(int count) {
        this.count = count;
    }

    @Override
    public void justDoIt() {
        String result = "";
        for (int i = 0; i < count; i++) {
            result += i;
        }
    }
}
