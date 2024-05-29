package day240529.practice.teach;

import java.io.File;

public class FileTreePrinterPlus {
    public static void main(String[] args) {
        File directory = new File("src/day240528");
        print(directory, "");
    }

    public static void print(File file, String indent) {
        String suffix = "";
        if (file.isFile()) {
            long length = file.length();
            suffix = " ("+length+"字节)";
        }
        System.out.println(indent + file.getName() + suffix);

        if (file.isDirectory()) {
            File[] files = file.listFiles();
            if (files != null) {
                for (File f : files) {
                    print(f, indent + "--");
                }
            }
        }
    }
}

