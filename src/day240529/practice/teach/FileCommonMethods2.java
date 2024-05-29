package day240529.practice.teach;

import java.io.File;

@SuppressWarnings({"all"})
public class FileCommonMethods2 {
    public static void main(String[] args) {
        // 存在的文件
        File file = new File("src/day240529/file_demo/FileTreePrinter.java");
        System.out.println(file.exists());
        System.out.println(file.length());
        System.out.println(file.lastModified());
        System.out.println(file.isHidden());


        System.out.println("=== === ===");

        // 不存在的文件
        File fileXxx = new File("xxx.xxx");
        System.out.println(fileXxx.exists());
        System.out.println(fileXxx.length());
        System.out.println(fileXxx.lastModified());
        System.out.println(file.isHidden());

        // hidden
        File hiddenFile = new File(".xxx");
        System.out.println(hiddenFile.isHidden());

        System.out.println("=== === ===");

        File file1 = new File("src/day240529/dirx/file.txt");
        boolean result = file1.mkdir();
        System.out.println(result);
        boolean mkdirs = file1.mkdirs();
        System.out.println(mkdirs);
    }
}
