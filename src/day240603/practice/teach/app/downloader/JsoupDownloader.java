package day240603.practice.teach.app.downloader;

import day240603.practice.teach.app.downloader.Downloader;

public class JsoupDownloader extends Downloader {
    @Override
    public String download(String url) {
        return "即将下载[" + url + "]的源码";
    }

    public JsoupDownloader() {
        System.out.println("JsoupDownloader.JsoupDownloader");
    }
}