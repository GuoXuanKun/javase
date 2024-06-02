package day240530.practice.project;

import day240530.practice.project.downloader.JsoupDownloader;
import day240530.practice.project.memorizer.PrintMemorizer;
import day240530.practice.project.notificator.EmailNotificatior;
import day240530.practice.project.parser.JsoupParserForXiaMenXiaoYuWang;
import org.jsoup.nodes.Document;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.Scanner;

public class WebsiteAnalysis {
    /*
        1. 下载模块:
            通过 配置文件 ( downloader 的值) 来规定要执行的下载器
            下载模块目前可以分为:
            选择(未完待续):
                    1. Jsoup
                    2. IO 流

        2. 解析模块:
            根据网站的不同通过 配置文件( parser 的值) 来进行选择相应的下载器
            选择(未完待续):
                    1. Jsoup
                    2. IO流

        3. 存储模块:
                   通过 配置文件 ( memorizer 的值) 来进行选择相应的存储器
                   选择(未完待续):
                    1. 打印的方式
                    2. IO流 : content 关键字来存 (待做)

        4. 通知模块:
                   通过 配置文件 ( notificatior 的值) 来进行选择相应的通知器
                   选择(未完待续):
                    1. 邮件的形式

        */

    // 从配置文件获取信息
    private static final String FILE_NAME = "src/day240530/practice/project/website_analysis.properties";
    private static final Properties STUDENTS_PROPERTIES = new Properties();
    public static String downloader;
    public static String parser;
    public static String memorizer;
    public static String notificatior;

    // 解析要用的信息
    public static Document doc;
    public static String content;

    public static void main(String[] args) {
        try {
            STUDENTS_PROPERTIES.load(new FileInputStream(FILE_NAME));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        int DOWNLOADER = Integer.getInteger(STUDENTS_PROPERTIES.getProperty(downloader));
        int PARSER = Integer.getInteger(STUDENTS_PROPERTIES.getProperty(parser));
        int MEMORIZER = Integer.getInteger(STUDENTS_PROPERTIES.getProperty(memorizer));
        int NOTIFICATIOR = Integer.getInteger(STUDENTS_PROPERTIES.getProperty(notificatior));
        // 1. 下载模块
        switch (DOWNLOADER){
            case 1:
                downloadModuleMode1();
                break;
            default:
                System.out.println("暂无此操作");
        }


        // 2. 解析模块
        System.out.println("请输入要查找的关键字:");
        String key = new Scanner(System.in).nextLine();
        JsoupParserForXiaMenXiaoYuWang jsoupParser = new JsoupParserForXiaMenXiaoYuWang();
         content = jsoupParser.analysis(doc, key);

        // 3. 存储模块
        PrintMemorizer printMemorizer = new PrintMemorizer();
        printMemorizer.memorizer(content);

        // 4. 通知模块
        System.out.println("请输入要发送的邮件地址:");
        String address = new Scanner(System.in).nextLine();
        new EmailNotificatior().notificator(address, content);
    }
    public static void downloadModuleMode1(){
        System.out.println("请输入要进行解析的网站:");
        String url = new Scanner(System.in).nextLine();
        JsoupDownloader jsoupDownloader = new JsoupDownloader();
        doc = jsoupDownloader.download(url);
    }
}
