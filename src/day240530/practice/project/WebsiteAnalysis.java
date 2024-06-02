package day240530.practice.project;

import day240530.practice.project.downloader.JsoupDownloader;
import day240530.practice.project.memorizer.PrintMemorizer;
import day240530.practice.project.notificator.EmailNotificatior;
import day240530.practice.project.parser.JsoupParser;
import org.jsoup.nodes.Document;

import java.util.Scanner;

public class WebsiteAnalysis {
    /*
        1. 下载模块:
            通过 配置文件 来规定要执行的下载器
            下载模块目前可以分为:
            两种选择(未完待续):
                    1. Jsoup
                    2. IO 流的规范

        2. 解析模块:
            根据网站的不同通过 配置文件 来进行选择相应的下载器

        3. 存储模块:
                   通过 配置文件 来进行选择相应的存储器

        4. 通知模块:
                   通过 配置文件 来进行选择相应的通知器
        */
    public static void main(String[] args) {
        // 1. 下载模块
        System.out.println("请输入要进行解析的网站:");
        String url = new Scanner(System.in).nextLine();
        JsoupDownloader jsoupDownloader = new JsoupDownloader();
        Document doc = jsoupDownloader.download("http://bbs.xmfish.com/thread-htm-fid-55.html");

        // 2. 解析模块
        System.out.println("请输入要查找的关键字:");
        String key = new Scanner(System.in).nextLine();
        JsoupParser jsoupParser = new JsoupParser();
        String content = jsoupParser.analysis(doc,key);

        // 3. 存储模块
        PrintMemorizer printMemorizer = new PrintMemorizer();
        printMemorizer.memorizer(content);

        // 4. 通知模块
        System.out.println("请输入要发送的邮件地址:");
        String address = new Scanner(System.in).nextLine();
        new EmailNotificatior().notificator(address,content);
    }
}
