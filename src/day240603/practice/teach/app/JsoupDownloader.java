package day240603.practice.teach.app;

public class JsoupDownloader extends Downloader {
    @Override
    public String download(String url) {
        return "即将下载[" + url + "]的源码";
    }
}
