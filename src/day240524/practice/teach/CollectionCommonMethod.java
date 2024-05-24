package day240524.practice.teach;


import java.util.ArrayList;
import java.util.Collection;

public class CollectionCommonMethod {
    public static void main(String[] args) {
        Collection<Integer> cs = new ArrayList<>();
        System.out.println(cs.size());
        System.out.println(cs.isEmpty());
        cs.add(123);
        System.out.println(cs.size());
        System.out.println(cs.isEmpty());
    }
}
