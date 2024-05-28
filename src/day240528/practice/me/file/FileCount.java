package day240528.practice.me.file;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;

public class FileCount {
    public static void main(String[] args) {
        File file = new File("src");
        System.out.println(Arrays.toString(file.list()));
        // 这个方法打印出来的是下级文件数组
        System.out.println(Arrays.toString(file.listFiles()));

        // 思路 : 想办法获取 文件夹的里面的文件
        // 但是文件夹里面还嵌套这文件夹 利用 isDirectory() 判断 是不是文件夹
        // 利用 listFiles() 层层 往下 直到 不是文件夹
        // 猜测会不会有个方法比如 getfilename 可以 获取文件名
        for (File file1 : file.listFiles()) {
            System.out.println(file1.getName());
        }
     }





}
