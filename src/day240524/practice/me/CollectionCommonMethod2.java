package day240524.practice.me;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class CollectionCommonMethod2 {
    public static void main(String[] args) {
        ArrayList<String> strings = new ArrayList<>();
        strings.add("abc");
        strings.add("qwe");
        strings.add("asd");
        strings.add("jkl");
        strings.add("xyz");
        strings.remove("qwe");
        System.out.println(strings);
        System.out.println("-------------");
        ArrayList<Integer> is = new ArrayList<>();
        is.add(1);
        is.add(2);
        is.add(3);


//        is.remove(2);

        System.out.println(is);
    }
}
