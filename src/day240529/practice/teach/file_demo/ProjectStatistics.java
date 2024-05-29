package day240529.practice.teach.file_demo;

import java.io.File;
import java.util.HashMap;
import java.util.Map;

public class ProjectStatistics {
    private static final Map<String, Integer> FILE_TYPE_COUNTS = new HashMap<>();

    public static void main(String[] args) {
        File directory = new File("src");
        countFileTypes(directory);
        for (Map.Entry<String, Integer> entry : FILE_TYPE_COUNTS.entrySet()) {
            System.out.println("类型：" + entry.getKey() + "，数量：" + entry.getValue() + " 个");
        }
    }

    private static void countFileTypes(File directory) {
        File[] files = directory.listFiles();
        if (files != null) {
            for (File file : files) {
                if (file.isDirectory()) {
                    countFileTypes(file);
                } else {
                    String ext = getFileExtension(file.getName());
                    if (FILE_TYPE_COUNTS.containsKey(ext)) {
                        FILE_TYPE_COUNTS.put(ext, FILE_TYPE_COUNTS.get(ext) + 1);
                    } else {
                        FILE_TYPE_COUNTS.put(ext, 1);
                    }
                }
            }
        }
    }

    private static String getFileExtension(String fileName) {
        int lastDotIndex = fileName.lastIndexOf('.');
        return lastDotIndex == -1 ? "无后缀" : fileName.substring(lastDotIndex + 1);
    }
}