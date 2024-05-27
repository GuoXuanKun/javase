package day240527.practice.me.teach;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SetCannotContainDuplicateElements {
    public static void main(String[] args) {
        Set<Integer> st = new HashSet<>();
        st.add(1);
        st.add(2);
        st.add(3);
        st.add(1);
        st.add(2);

        System.out.println(st);

        System.out.println("=== === ===");

        List<Integer> li = new ArrayList<>();
        li.add(1);
        li.add(2);
        li.add(3);
        li.add(1);
        li.add(2);
        System.out.println(li);
    }
}
