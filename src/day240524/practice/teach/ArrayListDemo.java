package day240524.practice.teach;

import java.util.ArrayList;

public class ArrayListDemo {
    public static void main(String[] args) {
        // 已经学过泛型了

        // 其他垃圾
        ArrayList al = new ArrayList();
        al.add("string");
        al.add(1);

        // 厨余垃圾
        ArrayList<String> als = new ArrayList<>();
        als.add("ddd");
    }
}
