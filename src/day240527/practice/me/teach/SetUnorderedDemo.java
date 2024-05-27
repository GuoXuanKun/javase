package day240527.practice.me.teach;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SetUnorderedDemo {
    public static void main(String[] args) {
        Set<String> ss = new HashSet<>();
        ss.add("abc");
        ss.add("bcd");
        ss.add("cef");

        System.out.println(ss);

        System.out.println("=== === ===");

        List<String> ls = new ArrayList<>();
        ls.add("abc");
        ls.add("bcd");
        ls.add("cef");
        System.out.println(ls);
    }
}
