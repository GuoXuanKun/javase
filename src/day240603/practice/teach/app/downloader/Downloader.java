package day240603.practice.teach.app.downloader;

import static day240603.practice.teach.app.App.PROPERTIES;

public abstract class Downloader {

    public static Downloader getInstance() {
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

    public abstract String download(String url);
}
