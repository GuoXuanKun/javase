package day240530.practice.project.downloader;

import day240530.practice.project.downloader.DownloaderForJsoup;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

import java.io.IOException;

public class JsoupDownloader implements DownloaderForJsoup {

    @Override
    public Document download(String url) {
        Document doc;
        try {
            doc = Jsoup.connect(url).get();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return doc;
    }
}
