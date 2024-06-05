package day240603.practice.teach.app.downloader;

import day240603.practice.teach.app.util.MyReflectUtil;

import java.lang.reflect.Constructor;

import static day240603.practice.teach.app.App.PROPERTIES;

public abstract class Downloader {

    public static Downloader getInstance() {
        return MyReflectUtil.getInstance(PROPERTIES.getProperty("downloader"));
    }

    public abstract String download(String url);
}
