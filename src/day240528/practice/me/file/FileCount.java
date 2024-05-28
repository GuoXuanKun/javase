package day240528.practice.me.file;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;

public class FileCount {
    public static void main(String[] args) {
        File file = new File("src");
        System.out.println(Arrays.toString(file.list()));

     }
}
