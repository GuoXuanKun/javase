package day240509.practice.util;

import day240423.MyEmailUtil;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

import java.io.IOException;

// 分析网站的工具类
public class WebsideUtil {
    public static void util(String 网址 , 具体的分析算法,String 搜索的关键字) throws IOException {
        // 把源码下载
        Document doc = Jsoup.connect(网址).get();

        // 解析算法
        具体的分析算法

        // 将解析的结果打印出来 或者 保存进数据库
        System. out.println("解析的结果: ");

//         关键词命中、邮件发送
        MyEmailUtil.send("xuankunguo@qq.com",解析的结果);
}

}
