package day240603.practice.teach.app;

import day240603.practice.teach.app.downloader.Downloader;
import day240603.practice.teach.app.downloader.JsoupDownloader;
import day240603.practice.teach.app.downloader.MyIODownloader;
import day240603.practice.teach.app.dto.CustomResult;
import day240603.practice.teach.app.notificator.ConsoleNotificator;
import day240603.practice.teach.app.notificator.EmailNotificator;
import day240603.practice.teach.app.notificator.Notificator;
import day240603.practice.teach.app.parser.Parser;
import day240603.practice.teach.app.parser.XmfishParser;
import day240603.practice.teach.app.repository.ConsoleRepository;
import day240603.practice.teach.app.repository.FileRepository;
import day240603.practice.teach.app.repository.Repository;
import day240603.practice.teach.app.util.MyEmailUtil;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;
import java.util.*;

public class App {
    public static final Properties PROPERTIES;

    static {
        // 读取配置文件，获取整个程序需要全局配置
        PROPERTIES = loadFromConfiguration();
        System.out.println(PROPERTIES);

        init();
    }

    private static void init() {
        // Email 相关设置
        MyEmailUtil.FROM = PROPERTIES.getProperty("from", "admin@xxx.com");
        MyEmailUtil.SECRET_TOKEN = PROPERTIES.getProperty("secret_token");
    }

    public static void main(String[] args) {
        // 开始
        System.out.println("程序开始运行...");

        // 下载
        String html = Downloader.getInstance().download(PROPERTIES.getProperty("url"));
        //System.out.println(html);

        // 解析
        List<CustomResult> results = Parser.getInstance().parse(html);
        //System.out.println(results);

        // 存储
        Repository.getInstance().store(results);
        System.out.println("Repository - 已输出到指定位置");

        // 通知
        Notificator.notice(results);

        // 结束
        System.out.println("程序结束运行");
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
