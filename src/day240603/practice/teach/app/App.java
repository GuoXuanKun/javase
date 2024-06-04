package day240603.practice.teach.app;

import day240603.practice.teach.app.downloader.Downloader;
import day240603.practice.teach.app.downloader.JsoupDownloader;
import day240603.practice.teach.app.downloader.MyIODownloader;
import day240603.practice.teach.app.dto.CustomResult;
import day240603.practice.teach.app.parser.Parser;
import day240603.practice.teach.app.parser.XmfishParser;
import day240603.practice.teach.app.repository.ConsoleRepository;
import day240603.practice.teach.app.repository.FileRepository;
import day240603.practice.teach.app.repository.Repository;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;
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
        //System.out.println(html);

        Parser parser = getParser(properties.getProperty("parser"));
        List<CustomResult> results = parser.parse(html);
        //System.out.println(results);

        Repository repository = getRepository(properties.getProperty("repository"));
        repository.store(results);
        System.out.println("Repository - 已输出到指定位置");

        System.out.println("程序结束运行");
    }

    private static Repository getRepository(String repository) {
        Repository r = null;
        if ("console".equalsIgnoreCase(repository)) {
            r = new ConsoleRepository();
        } else if ("file".equalsIgnoreCase(repository)) {
            r = new FileRepository();
        } else {
            System.out.println("不支持的 Repository");
            System.exit(-1);
        }
        return r;
    }

    private static Parser getParser(String parser) {
        Parser ps = null;
        if ("xmfish".equals(parser)) {
            ps = new XmfishParser();
        } else {
            System.out.println("不支持的 Parser");
            System.exit(-1);
        }
        return ps;
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
        String fileName = "src/day240603/practice/teach/app/config.properties";
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
