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
        // 如何真的删除`值为2的那个元素`
        //is.remove(new Integer(2));
        is.remove(Integer.valueOf(2));
        System.out.println(is);


        System.out.println("=== === ===");

        ArrayList<String> ss = new ArrayList<>();
        ss.add("abc");
        ss.add("qwe");
        ss.add("asd");

        ss.set(0, "abc-update");
        System.out.println(ss);
    }
}
