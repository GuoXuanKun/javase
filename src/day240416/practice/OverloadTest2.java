package day240416.practice;

import org.w3c.dom.ls.LSOutput;

public class OverloadTest2 {
    public static void main(String[] args) {
        // 地址
        int[] arr1 = new int[]{1,2,3};
        System.out.println(arr1);


        // 不是地址
        // 为什么?
        // 用别人的方法, 我们可以看别人是怎么写的 (阅读源码)
        // 三个调用的就不是一个方法
        // char[] 类型,它有自己的处理方法
        char[] arr2 = new char[]{'a','b','c','d','e'};
        System.out.println(((Object) arr2));


        // 地址
        boolean[] arr3 = new boolean[]{false,true,true};
        System.out.println(arr3);
    }
}
