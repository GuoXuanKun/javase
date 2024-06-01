package day240530.practice.project.downloader;

import org.jsoup.nodes.Document;

/*
Jsoup 的规范 : 通过 网址 将内容下载下来
需要参数 : String url(地址)
返回类型 : Document
*/
public interface DownloaderForJsoup {
    public Document download(String url);
}
