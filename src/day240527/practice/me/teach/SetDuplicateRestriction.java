package day240527.practice.me.teach;

import java.util.HashSet;
import java.util.Set;

public class SetDuplicateRestriction {
    public static void main(String[] args) {
        Set<CustomObj> sc = new HashSet<>();
        sc.add(new CustomObj(1, "n1"));
        sc.add(new CustomObj(2, "n2"));
        sc.add(new CustomObj(3, "n3"));
        sc.add(new CustomObj(1, "n1"));

        System.out.println(sc);
    }
}
