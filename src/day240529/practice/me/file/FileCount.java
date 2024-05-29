package day240529.practice.me.file;

import java.io.File;
import java.util.Arrays;
import java.util.HashSet;

public class FileCount {
    // 实例一个 Hashset 实例
    public static final HashSet<String> set = new HashSet<>();
    public static final HashSet<String> setForFileKind = new HashSet<>();
    public static void main(String[] args) {
        File file = new File("src");
        System.out.println(Arrays.toString(file.list()));
        // 这个方法打印出来的是下级文件数组
        System.out.println(Arrays.toString(file.listFiles()));
        // step 1
        // 思路 : 想办法获取 文件夹的里面的文件
        // 但是文件夹里面还嵌套这文件夹 利用 isDirectory() 判断 是不是文件夹
        // 利用 listFiles() 层层 往下 直到 不是文件夹
        // 猜测会不会有个方法比如 getfilename 可以 获取文件名

        // step 2
        // 经查证 确实存在 且返回的是 String
        // 那么 是不是可以用 String 里面 那个判断 结尾 是否是 某字段的方法
        // 问题是 怎么层层往下 ? 用递归
        System.out.println("有 "+countJavaFiles(file)+" 个 .java 文件");
        // 同款思路 计算 图片 和 .md 文件
        System.out.println("有 "+countPictureFiles(file) + " 张图片");
        System.out.println("有 "+ countMdFiles(file) + " 个 .md 文件");

        // step3 可以用 set 来判断 有几个不同的 .md 文件
        // 将查出来的 .md 文件存入 set 集合
        FindDifferenceMdFile(file);
        System.out.println("一共有 " + set.size() + " 种不同名的 .md 文件" );

        // step4 实例化一个 Hashset 对象 来存后缀名
        // 根据 split()方法取得 后缀名
        // 根据后缀名 统计有多少 文件
        // 存进 map 集合 (键值对) 或者 直接 文件名 + 数量 打印出来
        // 未完成...
        getFilesKind(file);

    }

    public static int countJavaFiles(File files) {
        int count = 0;
        for (File file : files.listFiles()) {
            if (file.isDirectory()) {
                // 判断文件夹的下层文件集合的文件是不是文件夹 是 就再往下查
                count += countJavaFiles(file);
            } else if (file.getName().endsWith(".java")) {
                // 如果不是 判断文件名是不是 .java 结尾的. 是的话 计数加1
//                System.out.print(" "+file.getName() + " ");
                count++;
            }
        }
        return count;
    }

    public static int countPictureFiles(File files) {
        int count = 0;
        for (File file : files.listFiles()) {
            if (file.isDirectory()) {
                // 判断文件夹的下层文件集合的文件是不是文件夹 是 就再往下查
                count += countPictureFiles(file);
            } else if (file.getName().endsWith(".png") || file.getName().endsWith(".jpg")) {
                // 如果不是 判断文件名是不是 .java 结尾的. 是的话 计数加1
//                System.out.print(" "+file.getName() + " ");
                count++;
            }
        }
        return count;
    }

    public static int countMdFiles(File files) {
        int count = 0;
        for (File file : files.listFiles()) {
            if (file.isDirectory()) {
                // 判断文件夹的下层文件集合的文件是不是文件夹 是 就再往下查
                count += countMdFiles(file);
            } else if (file.getName().endsWith(".md")) {
                // 如果不是 判断文件名是不是 .java 结尾的. 是的话 计数加1
//                System.out.print(" "+file.getName() + " ");
                count++;
            }
        }
        return count;
    }

    public static void FindDifferenceMdFile(File files) {
        for (File file : files.listFiles()) {
            if (file.isDirectory()) {
                // 判断文件夹的下层文件集合的文件是不是文件夹 是 就再往下查
                FindDifferenceMdFile(file);
            } else if (file.getName().endsWith(".md")) {
                // 如果不是 判断文件名是不是 .md 结尾的. 是的话 计数加1
//                System.out.print(" "+file.getName() + " ");
                setAdd(file.getName());
            }
        }

    }
    public static void setAdd(String a){
        set.add(a);
    }

    public static int getFilesKind(File files) {
        int count = 0;
        for (File file : files.listFiles()) {
            if (file.isDirectory()) {
                // 判断文件夹的下层文件集合的文件是不是文件夹 是 就再往下查
                count += countJavaFiles(file);
            } else  {
                String[] split = file.getName().split(".");
                // 如果不是 判断文件名是不是 .java 结尾的. 是的话 计数加1
//                System.out.print(" "+file.getName() + " ");
                for (String s : split){
                    setForFileKind.add(s);
                }
                count++;
            }
        }
        return count;
    }


}
