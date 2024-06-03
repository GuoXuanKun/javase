package day240603.practice.teach.app.downloader;

import day240603.practice.teach.app.downloader.Downloader;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.nio.charset.Charset;

public class MyIODownloader extends Downloader {
    @Override
    public String download(String url) {
        String result = "";
        BufferedReader in = null;
        try {
            URL oracle = new URL(url);
            URLConnection uc = oracle.openConnection();
            in = new BufferedReader(new InputStreamReader(uc.getInputStream(), Charset.forName("gbk")));
            String inputLine;
            while ((inputLine = in.readLine()) != null) {
                result += inputLine;
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                if (in != null) {
                    in.close();
                }
            } catch (IOException e) {
                System.out.println("IO 异常");
                throw new RuntimeException(e);
            }
        }
        return result;
    }

    public MyIODownloader() {
        System.out.println("MyIODownloader.MyIODownloader");
    }
}
