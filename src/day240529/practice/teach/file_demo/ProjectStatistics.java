package day240529.practice.teach.file_demo;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class ProjectStatistics {
    private static final Map<String, Integer> FILE_TYPE_COUNTS = new HashMap<>();
    private static final Set<String> MD_NAMES = new HashSet<>();
    private static long totalLines;

    public static void main(String[] args) {
        File directory = new File("src");
        countFileTypes(directory);
        for (Map.Entry<String, Integer> entry : FILE_TYPE_COUNTS.entrySet()) {
            System.out.println("类型：" + entry.getKey() + "，数量：" + entry.getValue() + " 个");
        }
        System.out.println("=== 不重名的 md 文件 ===");
        for (String mdName : MD_NAMES) {
            System.out.println(mdName);
        }
        System.out.println("=== Java 文件行数统计 ===");
        Integer javaFiles = FILE_TYPE_COUNTS.get("java");
        System.out.println("Java 文件总数=" + javaFiles + ", 总行数=" + totalLines + ", 平均行数=" + totalLines / (javaFiles + 0.0));
    }

    private static void countFileTypes(File directory) {
        File[] files = directory.listFiles();
        if (files != null) {
            for (File file : files) {
                if (file.isDirectory()) {
                    countFileTypes(file);
                } else {
                    String ext = getFileExtension(file.getName());
                    if ("md".equals(ext)) { // vs ext.equals("md")
                        MD_NAMES.add(file.getName());
                    }
                    if ("java".equals(ext)) {
                        totalLines += countingJavaLines(file);
                    }
                    if (FILE_TYPE_COUNTS.containsKey(ext)) {
                        FILE_TYPE_COUNTS.put(ext, FILE_TYPE_COUNTS.get(ext) + 1);
                    } else {
                        FILE_TYPE_COUNTS.put(ext, 1);
                    }
                }
            }
        }
    }

    private static long countingJavaLines(File file) {
        long count;
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
            count = bufferedReader.lines().count();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        return count;
    }

    private static String getFileExtension(String fileName) {
        int lastDotIndex = fileName.lastIndexOf('.');
        return lastDotIndex == -1 ? "无后缀" : fileName.substring(lastDotIndex + 1);
    }
}