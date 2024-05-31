package day240531.practice.teach;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class IOCommonFlow {
    public static void main(String[] args) throws IOException {
        // 回顾之前的 `CopyBytes` 代码
        //FileInputStream in = new FileInputStream("src/day240531/io_demo/file.txt");
        // 可以传入 `文件路径` 给 FileInputStream 构造器
        // 点进源码会发现，内部用这个 `文件路径` new 了 File 对象

        // 所以，以`文件&输入流`为例子，它的通用流程是：
        // 1. new File，即：数据源（这里以文件为例，`流`的数据源也可以是其他，如：URL...）
        File file = new File("src/day240531/io_demo/file.txt");
        // 2. 找一根 `管子` 接上去，即：`流`
        FileInputStream fis = new FileInputStream(file);
        // 3. 打开开关，让`东西`流出来
        int c = fis.read();
        while (c != -1) {
            System.out.println((char)c);
            c = fis.read();
        }
        // 4. 关闭 `流`
        fis.close();
    }
}
