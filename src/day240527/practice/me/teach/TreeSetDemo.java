package day240527.practice.me.teach;

import java.util.TreeSet;

public class TreeSetDemo {
    public static void main(String[] args) {
        TreeSet<Integer> ts1 = new TreeSet<>();
        ts1.add(1);
        ts1.add(2);
        ts1.add(3);
        System.out.println(ts1);

        System.out.println("=== === ===");

        TreeSet<String> ts2 = new TreeSet<>();
        ts2.add("x");
        ts2.add("e");
        ts2.add("a");
        System.out.println(ts2);
    }
}
