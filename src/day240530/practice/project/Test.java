package day240530.practice.project;

import day240530.practice.project.downloader.JsoupDownloader;
import day240530.practice.project.parser.JsoupParserForXiaMenXiaoYuWang;

public class Test {
    public static void main(String[] args) {
        JsoupDownloader jsoupDownloader = new JsoupDownloader();
        System.out.println(jsoupDownloader.download("http://bbs.xmfish.com/thread-htm-fid-55.html"));

        JsoupParserForXiaMenXiaoYuWang jsoupParser = new JsoupParserForXiaMenXiaoYuWang();
        System.out.println(jsoupParser.analysis(jsoupDownloader.download("http://bbs.xmfish.com/thread-htm-fid-55.html"), "苹果"));
    }
}
