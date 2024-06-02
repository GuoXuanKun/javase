package day240530.practice.project;

import day240530.practice.project.downloader.JsoupDownloader;
import day240530.practice.project.memorizer.PrintMemorizer;
import day240530.practice.project.parser.JsoupParser;
import org.jsoup.nodes.Document;

import java.util.Scanner;

public class WebsiteAnalysis {
    /*
        下载模块:
        通过配置文件 规定的 来执行相应的下载器
        下载模块 目前 可以分为:
        两种规范:
               1. Jsoup
               2. IO 流的规范
        */
    public static void main(String[] args) {
        // 1. 下载模块
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
    }
}
