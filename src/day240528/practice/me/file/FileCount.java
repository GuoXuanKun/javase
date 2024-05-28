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
     }
}
