package day240530.practice.project;

import day240530.practice.project.downloader.JsoupDownloader;
import day240530.practice.project.parser.JsoupParser;
import org.jsoup.nodes.Document;

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


    }
}
