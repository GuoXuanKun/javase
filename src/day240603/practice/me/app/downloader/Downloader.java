package day240603.practice.me.app.downloader;

import day240603.practice.me.app.util.MyReflectUtil;

import static day240603.practice.teach.app.App.PROPERTIES;

public abstract class Downloader {

    public static Downloader getInstance() {
        return MyReflectUtil.getInstance(PROPERTIES.getProperty("downloader"));
    }

    public abstract String download(String url);
}
