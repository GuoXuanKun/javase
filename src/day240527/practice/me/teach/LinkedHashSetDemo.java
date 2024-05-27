package day240527.practice.me.teach;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetDemo {
    public static void main(String[] args) {
        Set<String> ss = new HashSet<>();
        ss.add("abc");
        ss.add("bcd");
        ss.add("cef");
        System.out.println(ss);

        System.out.println("=== === ===");

        Set<String> ssl = new LinkedHashSet<>();
        ssl.add("abc");
        ssl.add("bcd");
        ssl.add("cef");
        System.out.println(ssl);
    }
}
