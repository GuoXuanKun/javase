package day240509.practice.util;

public class AnalysisTest {
    public static void main(String[] args) throws Exception {
        // 步骤 :
      /*
        1. 把源码下载 (网址可能不一样)
        2. 解析 (每个网站解析的不一样)
        3. 保存到数据库 或者 直接打印
        4. 关键词命中、邮件发送 (想要获得的关键词可能不一样)
        */
//        需要一个类来进行分析网站的工具类 这个类中要有 一个能传进 网址 解析方法 关键词 的方法
//        每个网站分析的方法不一样 所以需要一个 分析单个网站 的类
//        需要一个能发邮件的包
        WebsiteUtil.util("http://bbs.xmfish.com/thread-htm-fid-55.html",new AnalysisXiaMenXiaoYu(),"苹果");
    }
}
