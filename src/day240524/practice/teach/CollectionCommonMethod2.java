package day240524.practice.teach;

import java.util.ArrayList;
import java.util.Iterator;

public class CollectionCommonMethod2 {
    public static void main(String[] args) {
        ArrayList<String> cs = new ArrayList<>();
        cs.add("abc");
        cs.add("qwe");
        cs.add("asd");
        cs.add("jkl");
        cs.add("xyz");

        //System.out.println(cs);

        // 遍历 ArrayList 方式一
        // 注意点：以 Collection 的视角，没有 get(int index) 的方法
        System.out.println(cs.get(0));
        System.out.println(cs.get(1));
        System.out.println(cs.get(2));
        System.out.println(cs.get(3));
        System.out.println(cs.get(4));

        System.out.println("=== === ===");

        // 遍历 ArrayList 方式二
        for (int i = 0; i < cs.size(); i++) {
            System.out.println(cs.get(i));
        }

        System.out.println("=== === ===");

        // 遍历 ArrayList 方式二 Iterator
        Iterator<String> iterator = cs.iterator();

        /*System.out.println(iterator.hasNext());
        System.out.println(iterator.next());
        System.out.println(iterator.next());
        System.out.println(iterator.next());
        System.out.println(iterator.next());
        System.out.println(iterator.next());*/

        System.out.println("--- --- ---");

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
