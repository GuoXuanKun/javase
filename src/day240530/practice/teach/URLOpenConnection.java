package day240530.practice.teach;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.nio.charset.Charset;

public class URLOpenConnection {
    public static void main(String[] args) throws Exception {
        //testBaidu();
        //testBaiduTimeout();
//        testCn();
        //testCnWithCharset();
//        testDouban();
        //testDouban2();
    }

    static void testBaidu() throws Exception {
        URL oracle = new URL("https://www.baidu.com/");
        URLConnection uc = oracle.openConnection();
        BufferedReader in = new BufferedReader(new InputStreamReader(uc.getInputStream()));
        String inputLine;
        while ((inputLine = in.readLine()) != null) {
            System.out.println(inputLine);
        }
        in.close();
    }

    static void testBaiduTimeout() throws Exception {
        URL oracle = new URL("https://www.baidu.com/");
        URLConnection uc = oracle.openConnection();
        uc.setConnectTimeout(1);
        //uc.setReadTimeout(1);
        BufferedReader in = new BufferedReader(new InputStreamReader(uc.getInputStream()));
        String inputLine;
        while ((inputLine = in.readLine()) != null) {
            System.out.println(inputLine);
        }
        in.close();
    }

    static void testCn() throws Exception {
        URL oracle = new URL("https://www.youth.cn");
        URLConnection uc = oracle.openConnection();
        BufferedReader in = new BufferedReader(new InputStreamReader(uc.getInputStream()));
        String inputLine;
        while ((inputLine = in.readLine()) != null) {
            System.out.println(inputLine);
        }
        in.close();
    }

    static void testCnWithCharset() throws Exception {
        URL oracle = new URL("https://www.youth.cn");
        URLConnection uc = oracle.openConnection();
        BufferedReader in = new BufferedReader(new InputStreamReader(uc.getInputStream(), Charset.forName("gb2312"))); // gb2312
        String inputLine;
        while ((inputLine = in.readLine()) != null) {
            System.out.println(inputLine);
        }
        in.close();
    }

    static void testDouban() throws Exception {
        URL oracle = new URL("https://www.douban.com/");
        URLConnection uc = oracle.openConnection();
        uc.setRequestProperty("User-Agent","Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/122.0.6261.95 Safari/537.36");
        BufferedReader in = new BufferedReader(new InputStreamReader(uc.getInputStream()));
        String inputLine;
        while ((inputLine = in.readLine()) != null) {
            System.out.println(inputLine);
        }
        in.close();
    }

    static void testDouban2() throws Exception {
        // 思考：如何破？
    }
}
