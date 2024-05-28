package day240528.practice.teach.file_demo;

import java.io.File;
import java.util.Arrays;

public class FileTest {
    public static void main(String[] args) {
        File file0 = new File("xxxx.txt");
        System.out.println(file0);
        System.out.println(file0.exists());

        System.out.println("=== === ===");


        File file1 = new File("src/day240528/file_demo/demo.txt");
        System.out.println(file1);
        System.out.println(file1.exists());
        System.out.println(file1.getName());
        System.out.println(file1.isFile());
        System.out.println(file1.isDirectory());

        File file2 = new File("src/day240528/file_demo");
        System.out.println(file2.isFile());
        System.out.println(file2.isDirectory());
        System.out.println(Arrays.toString(file2.list()));
    }
}
