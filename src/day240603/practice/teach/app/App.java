package day240603.practice.teach.app;

import day240603.practice.teach.app.downloader.Downloader;
import day240603.practice.teach.app.downloader.JsoupDownloader;
import day240603.practice.teach.app.downloader.MyIODownloader;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class App {
    public static void main(String[] args) {
        System.out.println("程序开始运行...");
        // 读取配置文件，获取整个程序需要全局配置
        Properties properties = loadFromConfiguration();
        System.out.println(properties);
        // 根据配置文件中配置的 `下载器` 和 `url` 进行下载

        Downloader downloader = getDownloader(properties.getProperty("downloader")); // 可以用 JsoupDownloader 也可以用 MyIODownloader
        String html = downloader.download(properties.getProperty("url"));
        System.out.println(html);

        System.out.println("程序结束运行");
    }

    private static Downloader getDownloader(String downloader) {
        Downloader dl;
        switch (downloader) {
            case "jsoup":
                dl = new JsoupDownloader();
                break;
            case "io":
                dl = new MyIODownloader();
                break;
            default:
                dl = new JsoupDownloader();
                break;
        }
        return dl;
    }

    private static Properties loadFromConfiguration() {
        Properties properties = new Properties();
        String fileName = "src/day240602/app/config.properties";
        try {
            properties.load(new FileReader(fileName));
        } catch (FileNotFoundException e) {
            System.out.println("配置文件[" + fileName + "]不存在。");
            throw new RuntimeException(e);
        } catch (IOException e) {
            System.out.println("未知的错误！");
            throw new RuntimeException(e);
        }
        System.out.println("配置文件读取成功");
        return properties;
    }
}