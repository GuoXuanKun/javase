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
        System.out.println("程序开始运行...");
        // 根据配置文件中配置的 `下载器` 和 `url` 进行下载

        Downloader downloader = getDownloader();
        String html = downloader.download(PROPERTIES.getProperty("url"));
        //System.out.println(html);

        Parser parser = getParser();
        List<CustomResult> results = parser.parse(html);
        //System.out.println(results);

        Repository repository = getRepository();
        repository.store(results);
        System.out.println("Repository - 已输出到指定位置");

        Notificator notificator = getNotificator();
        String to = PROPERTIES.getProperty("to");
        String msg = getMsgFromResult(results, PROPERTIES.getProperty("keywords"));
        if (!msg.isBlank()) {
            notificator.send(to, msg);
            System.out.println("成功给【" + to + "】发送了通知");
        } else {
            System.out.println("没有命中任何关键词，无序发送通知");
        }

        System.out.println("程序结束运行");
    }

    private static String getMsgFromResult(List<CustomResult> results, String keywords) {
        String[] kws = keywords.split(",");
        List<CustomResult> hitResults;
        StringBuilder sb = new StringBuilder();
        for (String kw : kws) {
            hitResults = new ArrayList<>();
            for (CustomResult cr : results) {
                if (cr.getTitle().contains(kw)) {
                    hitResults.add(cr);
                }
            }
            if (!hitResults.isEmpty()) {
                sb.append("*** 命中关键词【").append(kw).append("】").append(hitResults.size()).append("条\n");
                for (CustomResult hitCr : hitResults) {
                    sb.append(hitCr.getTitle()).append("\n").append(hitCr.getUrl()).append("\n").append(hitCr.getCreatedAt()).append("\n").append(hitCr.getUpdatedAt()).append("\n");
                }
            }
        }
        return sb.toString();
    }

    private static Notificator getNotificator() {
        String notificator = PROPERTIES.getProperty("notificator");
        Notificator nf = null;
        if ("console".equalsIgnoreCase(notificator)) {
            nf = new ConsoleNotificator();
        } else if ("email".equalsIgnoreCase(notificator)) {
            nf = new EmailNotificator();
        } else {
            System.out.println("不支持的 Notificator");
            System.exit(-1);
        }
        return nf;
    }

    private static Repository getRepository() {
        String repository = PROPERTIES.getProperty("repository");
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

    private static Parser getParser() {
        String parser = PROPERTIES.getProperty("parser");
        Parser ps = null;
        if ("xmfish".equals(parser)) {
            ps = new XmfishParser();
        } else {
            System.out.println("不支持的 Parser");
            System.exit(-1);
        }
        return ps;
    }

    private static Downloader getDownloader() {
        Downloader dl;
        switch (PROPERTIES.getProperty("downloader")) {
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
