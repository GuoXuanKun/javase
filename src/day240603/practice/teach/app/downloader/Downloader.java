package day240603.practice.teach.app.downloader;

import java.lang.reflect.Constructor;

import static day240603.practice.teach.app.App.PROPERTIES;

public abstract class Downloader {

    public static Downloader getInstance() {
        Downloader downloader;
        try {
            Class<?> downloaderClass = Class.forName(PROPERTIES.getProperty("downloader"));
            Constructor<?> declaredConstructor = downloaderClass.getDeclaredConstructor();
            downloader = (Downloader)declaredConstructor.newInstance();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        return downloader;
    }

    public abstract String download(String url);
}
