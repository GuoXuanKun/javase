package day240524.practice.me;

import java.util.ArrayList;

public class ArrayListDemo {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();

        ArrayList al = new ArrayList();
        al.add("string");
        al.add(1);

        ArrayList<Integer> als = new ArrayList<>();
        als.add(8);

        for (int i = 0; i < 10000; i++) {
            als.add(i);
        }

        // 阅读源码时间，自己找出以下问题的答案:
        // 0.跟昨天让大家阅读 StringBuilder 源码一样(重点考察有没去阅读过源码，特别是大厂爱问源码)
        // 1. ArrayList 的底层用什么存储的?(真的去面试的时候，不用说死，不同的版本可能不一样，就说你自己阅读过什么版本的代码…
        // 2. 初始数组长度是多少?(跟问题1一样，不用说死...)
        // 3. 可以自己指定吗?怎么指定?
        // 4. add 的时候超过数组长度，它是怎么处理的?(用注释或者配图整理出核心逻辑)
        // 待续 ...
    }
}
