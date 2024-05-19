package day240519.practice;

import day240423.MyEmailUtil;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

// 分析网站的工具类
public class WebsiteUtil {

    //这个工具类方法需要传入 网址(String), 具体的分析算法(对象),要搜索的关键词(String),邮箱地址(String)
    public static void util(String url , AnalysisWebsite analysisWebsite, String key, String address) throws Exception {
        // 把源码下载
        Document doc = Jsoup.connect(url).get();

        // 解析算法
        // 将要搜索的关键词传进算法 ,用 result 接收 分析结果
        String result = analysisWebsite.Analysis(doc,key);


        // 将解析的结果打印出来 或者 保存进数据库
        System. out.println("解析的结果: " + result);

//         关键词命中、邮件发送
        MyEmailUtil.send(address,result);
}

}
