package day240529.practice.teach;

import java.io.File;

public class FileTreePrinter {
    public static void main(String[] args) {
        File directory = new File("src/day240528");
        print(directory, 0);
    }

    public static void print(File file, int level) {
        for (int i = 0; i < level; i++) {
            System.out.print("--");
        }

        System.out.println(file.getName());

        if (file.isDirectory()) {
            File[] files = file.listFiles();
            if (files != null) {
                for (File f : files) {
                    print(f, level + 1);
                }
            }
        }
    }
}
