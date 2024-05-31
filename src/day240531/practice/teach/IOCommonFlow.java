package day240531.practice.teach;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class IOCommonFlow {
    public static void main(String[] args) {
        // 回顾之前的 `CopyBytes` 代码
        //FileInputStream in = new FileInputStream("src/day240531/io_demo/file.txt");
        // 可以传入 `文件路径` 给 FileInputStream 构造器
        // 点进源码会发现，内部用这个 `文件路径` new 了 File 对象

        // 所以，以`文件&输入流`为例子，它的通用流程是：
        // 1. new File，即：数据源（这里以文件为例，`流`的数据源也可以是其他，如：URL...）
        File file = new File("src/day240531/io_demo/file.txt");
        try (
                // 2. 找一根 `管子` 接上去，即：`流`
                FileInputStream fis = new FileInputStream(file)
        ) {
            // 3. 打开开关，让`东西`流出来
            int c;
            while ((c = fis.read()) != -1) {
                System.out.println((char)c);
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            System.out.println(e.getMessage());
            throw new RuntimeException(e);
        }
        // 4. 关闭 `流`（已通过 ['try' with resources] 的方式自动关闭资源）
    }
}
